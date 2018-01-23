<%--
  Created by IntelliJ IDEA.
  User: 41589
  Date: 2018/1/22
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单用户注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/springmvc/css/style.css">
</head>
<body>
<div id="content1">
    <form action="http://localhost:8080/springmvc/user/simple" method="post">
        <div class="title">简单用户注册</div>
        <br>
        <br>
        <lable class="input">用户名称：
            <input type="text" name="name">
        </lable>
        <br>
        <br>
        <label class="tip">注：用户名长度必须在2到8之间</label>
        <br>
        <br>
        <lable class="input">用户密码：
            <input type="password" name="passWord">
        </lable>

        <br>
        <br>
        <hr>
        <div class="btn">
            <button type="submit">注册</button>
            <button type="reset">重置</button>
        </div>
        <p>${message}</p>
    </form>
</div>
<footer>Copyright&copy;2017.轻实训版权所有</footer>
</body>
</html>
