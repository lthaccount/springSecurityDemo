<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/28
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome page</title>
</head>
<body>
    <h1>this is welcome page</h1>
    <form action="firstController" method="post">
        <input name="name">
        return:${name}
        <input value="提交" type="submit">
    </form>
</body>
</html>
