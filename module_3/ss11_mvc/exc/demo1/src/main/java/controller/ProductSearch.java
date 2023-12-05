//package controller;
//
//import model.Product;
//import service.IProductService;
//import service.ProductService;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(name = "ProductSearch", value = "/product-servlet-search" )
//public class ProductSearch extends HttpServlet {
//    private final IProductService iProductService = new ProductService();
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = null;
//        String name = req.getParameter("findName");
//        List<Product> list = iProductService.findName(name);
//        if (!list.isEmpty()) {
//            req.setAttribute("search", list);
//            requestDispatcher = req.getRequestDispatcher("/search.jsp");
//            requestDispatcher.forward(req, resp);
//        } else {
//            list = iProductService.findAll();
//            req.setAttribute("list", list);
//            req.setAttribute("message", "Dont find product!!");
//            req.getRequestDispatcher("/show-list.jsp");
//            requestDispatcher.forward(req, resp);
//        }
//    }
//}
//
//
