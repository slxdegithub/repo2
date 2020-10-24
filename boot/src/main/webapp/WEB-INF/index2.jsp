<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/10/14
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet">
    <%--<script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <title>login</title>
</head>
<body>

<div id="formbackground" style="position:absolute; z-index:-1;"><img src="${pageContext.request.contextPath}/images/index.jpg" height="100%"
                                                                     width="100%"/></div>
<script type="text/javascript">
    $(function () {
        $('#formbackground').height($(window).height());
        $('#formbackground').width($(window).width());
    });
</script>

<%--<form class="form-horizontal" action="/login" role="form">
    <div class="form-group">
        <label for="userNum" class="col-sm-2 control-label">账号</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="userNum" name="userNum" placeholder="请输入账号">
        </div>
    </div>
    <div class="form-group">
        <label for="userPsd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="userPsd" name="userPsd" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox">请记住我
                </label>
                <span style="color: red"> ${errorInfo}</span>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>--%>


<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">学生账号登入</h3>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-group">
            <label for="userNum">账号： </label> <span style="color: red">${errorInfo}</span>
            <input type="text" name="username" class="form-control" id="userNum" name="userNum" placeholder="请输入账号"/>
        </div>

        <div class="form-group">
            <label for="userPsd">密码：</label>
            <input type="password" name="password" class="form-control" id="userPsd" name="userPsd"placeholder="请输入密码"/>
        </div>

        <hr/>
        <div class="form-group" >
            <input class="btn btn btn-primary" type="submit" value="登录">
            <input class="btn btn btn-primary" type="button" value="注册">
        </div>
    </form>

</div>

</body>
</html>
