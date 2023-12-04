import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculate", value = "/calculator")
public class Calculate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float txtFirst = Float.parseFloat(req.getParameter("txtFist"));
        float txtSecond = Float.parseFloat(req.getParameter("txtSecond"));
        char operation = req.getParameter("option").charAt(0);
        PrintWriter writer = resp.getWriter();
        try {
            float result = Operation.calculator(txtFirst,txtSecond,operation);
            req.setAttribute("txtFirst",txtFirst);
            req.setAttribute("txtSecond",txtSecond);
            req.setAttribute("operation",operation);
            req.setAttribute("result",result);
            req.setAttribute("equal"," = ");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req,resp);
        }catch (Exception e){
            writer.println("Error:"+e.getMessage());
        }
    }
}
