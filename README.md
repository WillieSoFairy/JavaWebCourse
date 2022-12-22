# JavaWebCourse

### 介绍
Web编程技术实验源码

**本项目线上测试环境：http://106.55.224.60:8080/**

### 实验一 *20220910*：简单的Servlet与JSP

### 实验二 *20220916*：HTTP请求、响应对象

实验内容包括：

1. 返回客户端的有关信息
2. 注册考试信息表单
3. 请求转发（学号123，密码willie）
4. 设置context-param参数与init-param参数，并在WebServlet中读取
5. 每5秒刷新一次页面
6. 将响应内容类型设置为“application/msword”，输出以word形式发送给客户浏览器
7. 根据用户填写的信息，在Servlet中实现响应重定向

### 实验三 *20220930*：HTTP请求、响应对象

实验内容包括：

1. 使用ServletConfig检索Servlet的初始化参数
2. 获得有关服务器的信息
3. 简单的综合应用：返回输入的学生信息

### 实验四 *20221009*：JSP基本语法与页面指令

实验内容包括：

1. 通过JSP页面元素显示一首诗和该诗的阅读量
2. 通过JSP脚本元素的声明和小脚本创建jspService()的实例变量和局部变量
3. 使用page指令的errorPage属性和iserrorPage属性进行提示的登陆界面
4. 用户注册登录

### 实验五 *20221014*：JSP隐含对象与作用域

实验内容包括：

1. request隐含对象的使用，查询本地和服务器的IP地址、端口号
2. out隐含对象的使用
3. application隐含对象的使用
4. session隐含对象的使用
5. 错误页面与异常处理

### 实验六 *20221021*：Web组件重用与JavaBeans

实验内容包括：

1. include指令的使用
2. &lt;jsp:include&gt;、&lt;jsp:forward&gt;、&lt;jsp:param&gt;标准动作的使用
3. &lt;jsp:forward&gt;标准动作的使用
4. &lt;jsp:useBean&gt;、&lt;jsp:setProperty&gt;、&lt;jsp:getProperty&gt;的使用

### 实验七 *20221103*：会话管理

实验内容包括：

1. 会话机制
2. setAttribute()和getAttribute()
3. 设置会话超时时间以及通过Session.invalidate()方法实现会话的销毁

### 实验八 *20221104*：JDBC访问数据库

实验内容包括：

1. JDBC连接测试
2. 访问books表中的数据
3. 通过数据源访问数据库

### 实验九 *20221111*：MVC模式及其应用

实验内容包括：

1. 根据书号查询图书信息
2. 向数据库中插入数据

### 实验十 *20221209*：Servlet事件处理

实验内容包括：

1. 在ServletContext对象上添加属性、删除属性和替换属性时，在Tomcat日志中记录有关信息
2. 记录当前在线人数
3. 记录某个页面自应用程序启动以来被访问的次数

### 实验十一 *20221216*：Servlet过滤器的使用

实验内容包括：

1. 将访问任何资源用户的IP地址和主机名写入日志文件中
2. 过滤器改变请求编码