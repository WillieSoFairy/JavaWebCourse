package WEB_20221209.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//@WebServlet(name = "EventTestServlet", value = "/WEB_20221209/EventTest")
public class EventTestServlet extends HttpServlet {
    ServletContext context = null;

    public void init() {
        context = getServletConfig().getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Event Test</title></head>");
        Integer anInteger = 100;
        Date aDate = new Date();
        context.setAttribute("obj", anInteger); //添加属性
        context.setAttribute("obj", aDate);   //替换属性
        context.removeAttribute("obj");  //删除属性
        out.println("<h3 align=center>" +
                "已在ServletContext对象上添加、替换和删除了属性</h3>");
        out.println("</body></html>");
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
