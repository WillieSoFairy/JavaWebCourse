package WEB_20221028;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CheckServlet", value = "/WEB_20221028/CheckServlet")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        //设置会话的超时期限
        session.setMaxInactiveInterval(30 * 60);
        //将请求参数值存储到会话对象上
        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("number", request.getParameter("number"));
        session.setAttribute("password", request.getParameter("password"));
        String subject = null;
        String option = request.getParameter("subject");
        if (option.equals("1")) {
            subject = "语文";
        } else if (option.equals("2")) {
            subject = "数学";
        } else {
            subject = "英语";
        }
        session.setAttribute("subject", subject);
        PrintWriter out = response.getWriter();
        //在会话对象上检索属性并输出
        out.println("<html>");
        out.println("<head>");
        out.println("<title>显示考生考试信息</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>考生信息：</h4>");
        out.println("姓名：" + session.getAttribute("name") + "</br>");
        out.println("考试科目：" + session.getAttribute("subject") + "</br>");
        out.println("学号：" + session.getAttribute("number") + "</br>");
        out.println("密码：" + session.getAttribute("password") + "</br>");
        out.println("</body>");
        out.println("</html>");
        //使会话对象失效
        session.invalidate();

    }
}
