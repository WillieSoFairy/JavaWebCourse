<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/21
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="WEB_20221021.UserBean" %>
<jsp:useBean id="user" class="WEB_20221021.UserBean" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<html>
<body>
UserName:
<jsp:getProperty name="user" property="username"/>
<br>
Password:
<jsp:getProperty name="user" property="password"/>
<br>
Email:
<jsp:getProperty name="user" property="email"/>
<br>
</body>
</html>
