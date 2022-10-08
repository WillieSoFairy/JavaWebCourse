package WEB_20220930;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FirstServlet", value = "/WEB_20220930/FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FirstServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sno = request.getParameter("stuId");
        String name = request.getParameter("stuName");
        Student_0930 student = new Student_0930(sno, name);
        request.setAttribute("student", student);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB_20220930/SecondServlet");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
