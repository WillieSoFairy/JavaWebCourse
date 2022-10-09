<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/9
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page errorPage="errorHander.jsp" %>
<html>
<body>
<%
    String password = request.getParameter("password");
    if (!password.equals("123456")) {
        throw new RuntimeException("Ä¬ÈÏÃÜÂëÎª 123456");
    }
%>
<% String name = request.getParameter("name");%>
Hello, <%= name %>
</body>
</html>
