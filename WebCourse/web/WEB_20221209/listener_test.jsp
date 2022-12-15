<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/12/15
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Listener test</title>
</head>
<body>
欢迎您，您的IP地址是<%= request.getRemoteAddr() %>
<p>自应用程序启动以来，该页面被访问了
    <font color="blue"><%=application.getAttribute("count")%>
    </font>次<br>
</body>
</html>
