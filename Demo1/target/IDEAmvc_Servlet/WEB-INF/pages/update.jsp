<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/23
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<form action="/addRegister">
    <div class="col-sm-10">
        <input  class="form-control" type="text" value="${register.stu_no}"  name="stu_no" id="stu_no">
    </div>
    <div class="col-sm-10">
        <input  class="form-control" type="text" value="" name="name" id="name">

    </div>
    <div class="col-sm-10">
        <input  class="form-control" type="text"  name="age" id="age">
    </div>
    <div class="col-sm-10">
        <input  class="form-control" type="text"  name="sex" id="sex">
    </div>
    <div class="col-sm-10">
        <input  class="form-control" type="text"  name="hobbies" id="hobbies">
    </div>

    <div class="col-sm-10">
        <input  class="form-control" type="text"  name="description" id="description">
    </div>
    <div>
        <input type="reset" class="button" value="重置">
    </div>
    <div>
        <input type="submit" class="button" value="注册">
    </div>

</form>

</body>
</html>
