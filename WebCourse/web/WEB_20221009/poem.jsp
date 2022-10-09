<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/10/9 Time: 15:54 To change this template use File | Settings |
  File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>茅屋为秋风所破歌</title>
</head>

<body>
&nbsp;&nbsp;<b>茅屋为秋风所破歌</b><br> &nbsp;&nbsp;&nbsp;
<b>杜甫</b><br> 八月秋高风怒号，卷我屋上三重茅。茅飞渡江洒江郊，高者挂罥长林梢，下者飘转沉塘坳。
<br> 南村群童欺我老无力，忍能对面为盗贼。公然抱茅入竹去，唇焦口燥呼不得，归来倚杖自叹息。
<br> 俄顷风定云墨色，秋天漠漠向昏黑。布衾多年冷似铁，娇儿恶卧踏里裂。床头屋漏无干处，雨脚如麻未断绝。自经丧乱少睡眠，长夜沾湿何由彻！
<br> 安得广厦千万间，大庇天下寒士俱欢颜！风雨不动安如山。呜呼！何时眼前突兀见此屋，吾庐独破受冻死亦足！
<br>
<%! int read = 0; %>
<%--定义一个浏览该网页的浏览量的变量--%>
<% read++;%>
<% session.setAttribute("read", read); %>
<%--将阅读量保存在session中--%>
<%@include file="readerCounter.jsp" %>

</body>

</html>