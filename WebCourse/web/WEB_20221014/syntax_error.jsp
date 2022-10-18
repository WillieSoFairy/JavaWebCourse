<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/18
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page errorPage="exception.jsp" %>

<%
    Calendar rightNow = null;

    //下行代码将产生NullPointerException异常
    rightNow.getTime();
%>
