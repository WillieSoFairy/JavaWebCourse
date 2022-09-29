package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RefreshServlet", value = "/RefreshServlet")
public class RefreshServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        response.setHeader("refresh", "5");

        PrintWriter out = response.getWriter();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
        String s = sdf.format(date);

        out.println("<html>");
        out.println("<body>");
        out.println("<h3 align=\"center\">每5秒钟刷新一次页面</h3><p>");
        out.println("<h3 align=\"center\">现在的时间是：" + s + "</h3><p>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
