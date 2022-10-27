<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/21
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Forward Test</title></head>
<body>
<jsp:forward page="forwardTo.jsp">
    <jsp:param name="userName" value="Willie"/>
</jsp:forward>
</body>
</html>

