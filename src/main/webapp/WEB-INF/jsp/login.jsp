<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 2019-04-21
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/login.action" method="post">
        username:<input type="text" name="username"> <br/>
        password:<input type="password" name="password"> <br/>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
