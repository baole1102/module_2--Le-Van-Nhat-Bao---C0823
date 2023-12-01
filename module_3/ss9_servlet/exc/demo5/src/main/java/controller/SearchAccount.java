package controller;

import model.Customer;
import util.CustomerDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(name = "SearchAccount",value = "/SearchAccount")
public class SearchAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<table border = 1 cellPadding = 1 cellSpacing = 1>");
        writer.println("<tr>");

        writer.println("<td>");
        writer.println("id");
        writer.println("</td>");

        writer.println("<td>");
        writer.println("Ten Thue Bao");
        writer.println("</td>");

        writer.println("<td>");
        writer.println("So Dien Thoai");
        writer.println("</td>");

        writer.println("<td>");
        writer.println("Dia Chi");
        writer.println("</td>");

        writer.println("</tr>");
        List<Customer> list = CustomerDB.getAll();
        for (int i = 0; i < list.size(); i++) {
            Customer c = list.get(i);
            writer.println("<tr>");

            writer.println("<td>");
            writer.println(c.getId());
            writer.println("</td>");

            writer.println("<td>");
            writer.println(c.getName());
            writer.println("</td>");

            writer.println("<td>");
            writer.println(c.getNumber());
            writer.println("</td>");

            writer.println("<td>");
            writer.println(c.getAddress());
            writer.println("</td>");

            writer.println("</tr>");
        }
        writer.println("</table>");
    }
}
