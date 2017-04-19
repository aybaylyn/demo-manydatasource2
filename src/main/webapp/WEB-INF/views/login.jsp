<%--
  Created by IntelliJ IDEA.
  User: aybaylyn
  Date: 3/17/17
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="logForm" title="登录" action="/users/login" method="post">

    用户名:<input name="userName" title="userName" value="" placeholder="请输入用户名"/><br/>
    密&nbsp;&nbsp;&nbsp;&nbsp;码:<input name="password" title="password" value="" placeholder="请输入密码"/><br/>

    <input type="submit" name="登录"  value="提交"/>

</form>
</body>
</html>
