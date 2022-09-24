package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WordServlet", value = "/WordServlet")
public class WordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-Encoding", "gb2312");
        //设置响应的内容类型
        response.setContentType("application/msword;charset = UTF-8");
        PrintWriter out = response.getWriter();

        out.println("这是一个word文件，你可以在该文件上编辑实现word文档的功能");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
