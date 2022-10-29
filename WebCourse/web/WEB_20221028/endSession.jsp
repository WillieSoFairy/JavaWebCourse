<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/29
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>结束会话</title>
</head>
<body>
<h2>该会话已经结束，结束时间为：</h2>
<%SimpleDateFormat formater = new SimpleDateFormat("yy-MM-dd   HH:mm:ss"); %>
<b><%=formater.format(session.getLastAccessedTime()) %>
</b>
<%session.invalidate();%>
</body>
</html>

