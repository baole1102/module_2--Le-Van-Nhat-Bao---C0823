import module.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowList", value = "/showlist")
public class ShowList extends HttpServlet {
    private static List<Customer> list = new ArrayList<>();

    static {
        list.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://wallpapers.com/wallpapers/lion-head-picture-kr555c8cxco2sz2t.html"));
        list.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://wallpapers.com/wallpapers/purple-flower-field-picture-c7o3veeueiljex1v.html"));
        list.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://wallpapers.com/wallpapers/snowy-road-picture-3wlwtu7z46vbv7k2.html"));
        list.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://wallpapers.com/wallpapers/bird-art-picture-049l3sm0tp5ou65n.html"));
        list.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://wallpapers.com/wallpapers/bicycle-in-nature-picture-ecql12sj9njv6lqo.html"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", list);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/showlist.jsp");
        requestDispatcher.forward(req, resp);
    }
}
