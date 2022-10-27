<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/27 Time: 21:16 To change this template use File | Settings |
  File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <title>注册成功</title>
        </head>

        <body>
            <h1>用户注册信息</h1>
            <% out.print("姓名："+ request.getParameter("name")); out.print("<br />");
      out.print("学号："+ request.getParameter("score"));
      out.print("<br />");
      out.print("用户名："+ request.getParameter("username"));
      out.print("<br />");
      out.print("密码："+ request.getParameter("password"));
      out.print("<br />");
      out.print("邮箱："+ request.getParameter("email"));

      %>
        </body>

        </html>