<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/21
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("userName");
    String welcomeStr = "欢迎光临本站";
    welcomeStr = userName + "," + welcomeStr;
    out.print(welcomeStr);
%>
