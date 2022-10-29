<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/29
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>进入会话</title>
</head>
<body>
用户：<b><%=request.getParameter("username")%>
</b>,您好<br>
您已进入会话，您的会话ID为：
<b><%=session.getId()%>
</b><br>
会话的创建时间是：
<%SimpleDateFormat formater = new SimpleDateFormat("yy-MM-dd   HH:mm:ss"); %>
<b><%=formater.format(session.getCreationTime()) %>
</b>

<form action="endSession.jsp">
    如果你想结束该会话，点击按钮：
    <input type="submit" value="结束会话" name="submit">
</form>
</body>
</html>

