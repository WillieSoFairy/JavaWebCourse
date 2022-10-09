<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/9 Time: 15:54 To change this template use File | Settings |
  File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>静夜思</title>
</head>

<body>
&nbsp;&nbsp;<b>静夜思</b><br> &nbsp;&nbsp;&nbsp;
<b>李白</b><br> 床前明月光，
<br> 疑似地上霜。
<br> 举头望明月，
<br> 低头思故乡。
<br>
<%! int read = 0; %>
<%--定义一个浏览该网页的浏览量的变量--%>
<% read++;%>
<% session.setAttribute("read", read); %>
<%--将阅读量保存在session中--%>
<%@include file="readerCounter.jsp" %>

</body>

</html>