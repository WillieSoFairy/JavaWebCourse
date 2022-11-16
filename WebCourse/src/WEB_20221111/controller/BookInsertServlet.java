package WEB_20221111.controller;

import WEB_20221111.beans.BookBean;
import WEB_20221111.dao.BookDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookInsertServlet", value = "/WEB_20221111/bookinsert.do")
public class BookInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String message = null;
        BookBean book = new BookBean(
                request.getParameter("bookid"), request.getParameter("title"),
                request.getParameter("author"), request.getParameter("publisher"),
                Float.parseFloat(request.getParameter("price"))
        );
        BookDao bookdao = new BookDao();
        boolean success = bookdao.insertBook(book);
        if (success) {
            message = "成功插入一条记录！";
        } else {
            message = "插入记录错误！";
        }
        request.setAttribute("result", message);
        RequestDispatcher view = request.getRequestDispatcher("/WEB_20221111/bookInsert.jsp");
        view.forward(request, response);

    }
}
