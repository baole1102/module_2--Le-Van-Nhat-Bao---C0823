package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    private final IProductService iProductService = new ProductService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        System.out.println(action);
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(req, resp);
                break;
            case "edit":
                editProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
            case "view":
                viewProduct(req, resp);
                break;
        }
    }


    private void viewProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        iProductService.delete(id);
        resp.sendRedirect("/product-servlet");
    }

    private void editProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        Product product = iProductService.findById(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setProducer(producer);
        RequestDispatcher requestDispatcher;
        iProductService.update(id, product);
        req.setAttribute("product", product);
        req.setAttribute("message", "Product information was updated");
        requestDispatcher = req.getRequestDispatcher("/edit.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        Product product = new Product(id, name, price, description, producer);
        iProductService.createProduct(product);
        try {
            resp.sendRedirect("/product-servlet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProduct(req, resp);
                break;
            case "edit":
                showEditProduct(req, resp);
                break;
            case "delete":
                showDeleteProduct(req, resp);
                break;
            case "view":
                showViewProduct(req, resp);
                break;
            case "search":

                searchProduct(req, resp);
                break;
            default:
                showListProduct(req, resp);
        }
    }

    private void searchProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        String name = req.getParameter("findName");
        List<Product> list = this.iProductService.findName(name);
        if (list.isEmpty()) {
            req.setAttribute("list", list);
            req.setAttribute("message", "Dont find product!!");
            requestDispatcher = req.getRequestDispatcher("/show-list.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("search", list);
            requestDispatcher = req.getRequestDispatcher(   "/search.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    private void showViewProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = iProductService.detail(id);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view.jsp");
        req.setAttribute("view", product);
        requestDispatcher.forward(req, resp);
    }

    private void showDeleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/delete.jsp");
        Product product = iProductService.findById(id);
        req.setAttribute("product", product);
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = iProductService.findById(id);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit.jsp");
        req.setAttribute("product", product);
        requestDispatcher.forward(req, resp);
    }

    private static void showCreateProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/create.jsp").forward(req, resp);
    }

    private void showListProduct(HttpServletRequest req, HttpServletResponse resp) {
        List<Product> list = iProductService.findAll();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/show-list.jsp");
        req.setAttribute("list", list);
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
