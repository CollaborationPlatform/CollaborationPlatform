<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 2019-04-21
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/register.action" method="post">
    username:<input type="text" name="username"> <br/>
    password:<input type="password" name="password"> <br/>
    category:<input type="text" name="category"> <br/>
    <input type="submit" value="register"/>
</form>
</body>
</html>
