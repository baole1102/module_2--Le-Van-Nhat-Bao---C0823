import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculate",value = "/calculate")
public class Calculate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    float number1 = Float.parseFloat(req.getParameter("txt1"));
    float number2 = Float.parseFloat(req.getParameter("txt2"));
    String action = req.getParameter("action");
    float sum = number1+number2;
    float minus = number1-number2;
    float nhan = number1*number2;
    float divide = number1/number2;
        PrintWriter writer = resp.getWriter();
        if (action.equals("+")){
            writer.println("Total: " + sum);
        }else if (action.equals("-")){
            writer.println("Total: " + minus);
        }else if (action.equals("*")){
            writer.println("Total: " + nhan);
        }else {
            writer.println("Total: " + divide);
        }
    }
}
