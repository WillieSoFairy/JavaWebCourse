<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/11/11
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" class="WEB_20221111.beans.BookBean" scope="request"/>
<html>
<body>
书号：
<jsp:getProperty name="book" property="bookid"/>
书名：
<jsp:getProperty name="book" property="title"/>
作者：
<jsp:getProperty name="book" property="author"/>
出版社：
<jsp:getProperty name="book" property="publisher"/>
价格：
<jsp:getProperty name="book" property="price"/>
</body>
</html>

