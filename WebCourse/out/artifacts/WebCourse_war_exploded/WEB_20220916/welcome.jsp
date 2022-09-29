<%-- Created by IntelliJ IDEA. User: Willie Date: 2022/9/21 Time: 0:14 To change this template use File | Settings |
  File Templates. --%>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
      <title>TODO supply a title</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body>
      <h4>Welcome!</h4>
      <%= request.getAttribute("number") %>
        <!--从request对象中提取出参数number -->
    </body>

    </html>