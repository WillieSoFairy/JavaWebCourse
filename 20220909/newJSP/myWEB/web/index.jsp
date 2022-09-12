<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/9/9
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
<form action="NewServlet" method="post">
    <table>·
        <tr>
            <td>用户：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"/></td>
            <td><input type="reset" value="重设"/></td>
        </tr>
    </table>
</form>
</body>
</html>

