<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/18
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<%
    session.setAttribute("user", "Willie");
%>

<html>
<body>
您的会话ID是：<%=session.getId()%><br>
session对象中存放的变量user的值为：<%=session.getAttribute("user")%>
</body>
</html>
