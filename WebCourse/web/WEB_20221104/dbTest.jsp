<%--
  Created by IntelliJ IDEA.
  User: Willie
  Date: 2022/11/4
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<% //加载驱动程序
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    String url = "jdbc:mysql://localhost:13306/JavaWeb";
    String user = "root";
    String password = "Willie";
    //建立连接对象
    Connection conn = DriverManager.getConnection(url, user, password);
    //创建语句对象
    Statement stmt = conn.createStatement();
    String sql = "select pname,password from tb_person";
    out.println("查询语句：" + sql);
    //获得SQL语句的执行结果
    ResultSet rs = stmt.executeQuery(sql);
%>
<br>
<% int i = 0;
    while (rs.next()) {
        i++;
        out.println("<br>" + i + ". ");
        out.println("pname:" + rs.getString(1));
        out.println("password:" + rs.getString(2));
    }
    out.print("<br>数据库操作成功，恭喜你!");
    rs.close();
    stmt.close();
    conn.close();
%>
</body>
</html>

