package WEB_20220916;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String number = request.getParameter("number");
        String password = request.getParameter("password");

        if (number.equals("123") && password.equals("willie")) {
            //学号123，密码willie
            request.setAttribute("number", number);    //将学号存储在request对象中
            RequestDispatcher re = request.getRequestDispatcher("/WEB_20220916/welcome.jsp");
            re.forward(request, response);
        } else {
            request.setAttribute("number", number);
            RequestDispatcher re = request.getRequestDispatcher("/WEB_20220916/login.html");
            re.forward(request, response);

        }
    }
}