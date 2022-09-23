package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WebServlet", value = "/WebServlet")
public class WebServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ser = this.getInitParameter("servlet");
        String app = getServletContext().getInitParameter("application");

        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h4>获取init-param参数的方法：" + ser + "</h4>");
        out.println("<h4>获取context-param参数的方法：" + app + "</h4>");

    }
}
