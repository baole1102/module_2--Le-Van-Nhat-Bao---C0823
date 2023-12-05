package controller;

import model.User;
import service.IUserService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    private final IUserService iUserService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(req, resp);
                break;
            case "edit":
                showEditForm(req, resp);
                break;
            case "delete":
                deleteUser(req, resp);
                break;
            default:
                listUser(req, resp);
                break;
        }
    }

    private void listUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> listUser = iUserService.selectAllUsers();
        req.setAttribute("listUser",listUser);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        iUserService.deleteUser(id);

        List<User> listUser = iUserService.selectAllUsers();
        req.setAttribute("listUser",listUser);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User existingUser = iUserService.selectUser(id);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit.jsp");
        req.setAttribute("user",existingUser);
        requestDispatcher.forward(req, resp);
    }

    private static void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/create.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(req, resp);
                break;
            case "edit":
                updateUser(req, resp);
                break;
        }

    }

    private void updateUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User book = new User(id, name,email,country);
        iUserService.updateUser(book);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void insertUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User newUser = new User(name,email,country);
        iUserService.insertUser(newUser);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/create.jsp");
        requestDispatcher.forward(req, resp);
    }
}
