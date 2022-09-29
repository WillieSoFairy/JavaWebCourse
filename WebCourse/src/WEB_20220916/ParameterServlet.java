package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ParameterServlet", value = "/ParameterServlet")
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        name = new String(name.getBytes("iso-8859-1"), "UTF-8");
        String subjectValue = request.getParameter("subject");
        subjectValue = new String(subjectValue.getBytes("iso-8859-1"), "UTF-8");
        String number = request.getParameter("number");
        number = new String(number.getBytes("iso-8859-1"), "UTF-8");
        String password = request.getParameter("password");
        password = new String(password.getBytes("iso-8859-1"), "UTF-8");

        String subject;
        if (subjectValue.equals("1")) {
            subject = "语文";
        } else if (subjectValue.equals("2")) {
            subject = "数学";
        } else {
            subject = "英语";
        }

        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>显示考生考试信息</title></head>");
        out.println("<body>");
        out.println("<h4>考生信息：</h4>");
        out.println("姓名：" + name + "</br>");
        out.println("考试科目：" + subject + "</br>");
        out.println("学号：" + number + "</br>");
        out.println("密码：" + password + "</br>");
        out.println("</html>");

    }
}
