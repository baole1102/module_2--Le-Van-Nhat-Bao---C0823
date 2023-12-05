import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Converter", value = "/converter")
public class Converter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd =  Float.parseFloat(req.getParameter("usd"));
        float result = rate*usd;
           RequestDispatcher requestDispatcher =  req.getRequestDispatcher("/index.jsp");
           req.setAttribute("rate",rate);
           req.setAttribute("usd",usd);
           req.setAttribute("result",result);
           requestDispatcher.forward(req,resp);
    }
}
