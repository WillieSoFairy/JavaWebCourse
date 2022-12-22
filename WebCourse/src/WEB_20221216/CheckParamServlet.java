package WEB_20221216;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CheckParamServlet", value = "/WEB_20221216/check")
public class CheckParamServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Param Test</title></head>");
        out.println("<h3 align=center>你的用户名为：" + name + "</h3>");
        out.println("<h3 align=center>你的口令为：" + pass + "</h3>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}
