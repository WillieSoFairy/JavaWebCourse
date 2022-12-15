package WEB_20221209.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "OnlineCountServlet", value = "/WEB_20221209/online")
public class OnlineCountServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        ServletContext context = getServletConfig().getServletContext();
        Integer count = (Integer) context.getAttribute("onlineCount");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Session Event Test</title></head>");
        out.println("<h3 align=center><font color=\"#ff0000\">" +
                "当前在线人数：" + count + "</h3>");
        out.println("</body></html>");
        out.close();
    }
}
