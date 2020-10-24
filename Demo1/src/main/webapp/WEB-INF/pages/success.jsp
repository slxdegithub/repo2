<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/9
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${user.name}:恭喜你，登入成功</h1>
<a href="/findAll">点此跳转到学生信息界面</a>
<a href="/allRegister">查看所有学生注册信息</a>
<a href="/addReg">实验三工程注册</a>
</body>
</html>
