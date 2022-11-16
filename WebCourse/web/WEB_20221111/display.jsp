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
<table border="1">
    <tr>
        <th>书号</th>
        <th>书名</th>
        <th>作者</th>
        <th>出版社</th>
        <th>价格</th>
    </tr>
    <tr>
        <td>
            <jsp:getProperty name="book" property="bookid"/>
        </td>
        <td>
            <jsp:getProperty name="book" property="title"/>
        </td>
        <td>
            <jsp:getProperty name="book" property="author"/>
        </td>
        <td>
            <jsp:getProperty name="book" property="publisher"/>
        </td>
        <td><span>￥</span>
            <jsp:getProperty name="book" property="price"/>
        </td>
    </tr>
</table>
<a href="/WEB_20221104/displayBooks_2.jsp" target="_blank">查看所有书目</a>
</body>
</html>

