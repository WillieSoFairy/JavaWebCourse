<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/27 Time: 21:13 To change this template use File | Settings |
  File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>登陆成功</title>
        </head>

        <body>
            <% String username=request.getParameter("name"); //读取用户名 out.print("用户名："+username +"<br />");
      out.print("密码："+ request.getParameter("password")); //读取密码并输出

      %>
        </body>

        </html>