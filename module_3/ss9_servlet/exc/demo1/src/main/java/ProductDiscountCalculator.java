import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculator")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Float.parseFloat(req.getParameter("price"));
        double discount = Float.parseFloat(req.getParameter("discount"));
        double discountAmount = price * discount * 0.01;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println(description);
        writer.println("<h3> Sum: " + discountAmount + "</h3>");
        writer.println("</html>");
    }
}
