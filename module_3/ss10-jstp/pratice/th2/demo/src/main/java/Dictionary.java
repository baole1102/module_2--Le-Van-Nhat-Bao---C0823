import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Dictionary", value = "/dictionary")
public class Dictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> convert = new HashMap<>();
        convert.put("Hello","Xin Chao");
        convert.put("Dog","Cho");
        convert.put("Cat","Meo");
        convert.put("Monkey","Khi");
        convert.put("Pig","Lon");
        String search = req.getParameter("search");
        String result = convert.get(search);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        req.setAttribute("search",search);
        req.setAttribute("result",result);
        requestDispatcher.forward(req,resp);
    }
}
