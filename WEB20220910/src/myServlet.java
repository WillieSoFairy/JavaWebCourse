import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "myServlet", value = "/myServlet")
public class myServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>The first Servlet Project</h1>");
        out.println("<h3>By Willie So on Sep. 09, 2022</h3>");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.println("Username: " + username + "</br>");
        out.println("Password: " + password + "</br>");
        out.println("<a href=\"http://106.55.224.60:8080/\">back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
