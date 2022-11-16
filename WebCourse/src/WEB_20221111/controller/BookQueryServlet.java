package WEB_20221111.controller;

import WEB_20221111.beans.BookBean;
import WEB_20221111.dao.BookDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookQueryServlet", value = "/WEB_20221111/bookquery.do")
public class BookQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookid = request.getParameter("bookid");
        BookDao bookdao = new BookDao();
        BookBean book = bookdao.searchBook(bookid);

        if (book != null) {
            request.setAttribute("book", book);
            RequestDispatcher view = request.getRequestDispatcher("/WEB_20221111/display.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("/WEB_20221111/errorPage.jsp");
            view.forward(request, response);
        }
    }

}
