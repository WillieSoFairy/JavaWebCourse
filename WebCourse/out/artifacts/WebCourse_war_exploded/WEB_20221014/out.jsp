<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/18
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Out Example</title></head>
<body>
<h2>out对象的使用</h2>
<%
    out.print("这是WIllie的out对象");
    int buffer = out.getBufferSize();
    int available = out.getRemaining();
%>
<br>
out对象的类型为：<%= out.getClass().getName() %><br>
BufferSize=<%= buffer %><br>
Available=<%= available %>
</body>
</html>

