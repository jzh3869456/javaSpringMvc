
<%@ page import="com.jzh.kaoshi.entity.Login" %><%--
  Created by IntelliJ IDEA.
  User: JZH
  Date: 2019/5/12
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>



    <form action="/user/login" method="post">


        <span>账号：</span><input id="user" type="text" name="name">  <br>
        <span>密码：</span><input id="pass" type="password" name="password" > <br>
                    <input type="submit" value="登录">
    </form>

    </body>
    <script>



    </script>



</html>
