<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/9 Time: 16:04 To change this template use File | Settings |
  File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>生命周期</title>
</head>

<body>
<%! int global = 0;%>
<%--声明一个实例变量--%>
<% int local = 0;%>
<%--声明一个局部变量--%>
<% global++;
    local++; %>
实例变量值为：
<%=global %><br> 局部变量值为：
<%=local %><br>
</body>

</html>