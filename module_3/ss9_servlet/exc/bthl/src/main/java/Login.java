import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        LocalTime time = LocalTime.now();


        if (username.equals("admin") && password.equals("123abc")) {
            req.setAttribute("result", "Dang nhap thanh cong vao luc "+time);
            req.getRequestDispatcher("/result.jsp").forward(req, resp);
        } else {
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            req.setAttribute("message", "Ten tai khoan hoac mat khau khong chinh xac");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }
}
