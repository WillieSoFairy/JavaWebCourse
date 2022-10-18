<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/18 Time: 23:01 To change this template use File | Settings |
  File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String remoteAddr = request.getRemoteAddr();
    String remoteHost = request.getRemoteHost();
    int
            serverPort = request.getServerPort(); %>
<html>

<body>
你的IP地址为：
<%=remoteAddr %><br> 你的主机名为：
<%=remoteHost %><br> 服务器的端口号为：
<%=serverPort %><br>
</body>

</html>