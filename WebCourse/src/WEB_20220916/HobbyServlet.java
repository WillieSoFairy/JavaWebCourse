package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HobbyServlet", value = "/HobbyServlet")
public class HobbyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = request.getParameter("hobby");

        //根据兴趣决定响应重定向的网站
        if (hobby != null && hobby.equals("1")) {
            response.sendRedirect("http://www.csdn.net/?ref=toolbar");
        } else if (hobby != null && hobby.equals("2")) {
            response.sendRedirect("http://news.163.com/");
        } else if (hobby != null && hobby.equals("3")) {
            response.sendRedirect("http://www.baidu.com/");
        } else {//如果没有填写兴趣选项，则向客户端发送状态码和错误信息
            response.sendError(404, "没有填写兴趣选项");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
