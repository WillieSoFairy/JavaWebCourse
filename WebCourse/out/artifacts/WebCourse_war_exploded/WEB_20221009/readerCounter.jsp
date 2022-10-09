<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/10/9
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String counter = session.getAttribute("read").toString(); //小脚本中获取session对象保存的read属性
%>
<b>访问量：<%=counter %>
</b>

