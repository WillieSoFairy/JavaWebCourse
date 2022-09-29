package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ClientInfoServlet", value = "/ClientInfoServlet")
public class ClientInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String RemoteHost = request.getRemoteHost(); //返回主机名
        String RemoteAddr = request.getRemoteAddr(); //返回客户端IP地址
        int RemotePort = request.getRemotePort();    //返回IP地址端口号
        String Protocol = request.getProtocol();    //返回请求协议名和版本
        String RequestURI = request.getRequestURI();  //返回请求中URL的查询串前面部分
        String ContentType = request.getContentType();  //返回请求行中MIME类型

        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>显示该客户端的相关信息</title></head>");
        out.println("<body>");
        out.println("<h3>客户端信息：</h3>");
        out.println("主机名：" + RemoteHost + "</br>");
        out.println("客户端IP地址：" + RemoteAddr + "</br>");
        out.println("IP地址端口号：" + RemotePort + "</br>");
        out.println("请求协议名和版本：" + Protocol + "</br>");
        out.println("URL查询串：" + RequestURI + "</br>");
        out.println("MIME类型：" + ContentType + "</br>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
