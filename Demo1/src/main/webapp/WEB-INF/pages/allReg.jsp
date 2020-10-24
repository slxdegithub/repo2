<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/30
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table  table-striped" >

    <thead>
    <tr>
        <th>序号</th>
        <th>工程名称</th>
        <th>施工单位</th>
        <th>建设单位</th>
        <th>监理单位</th>
        <th>附件资料路径</th>
        <th>
            <input type="text" placeholder="请输入名称" id="searchName" value="${searchName}">
            <input type="button" value="搜索" onclick="search()"/>
        </th>
        <th>
            <input type="button" value="添加"  onclick="add()" />
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allReg}" var="register">

        <tr>
            <td>${register.id}</td>
            <td>${register.project_name}</td>
            <td>${register.sg_unit}</td>
            <td>${register.js_unit}</td>
            <td>${register.jl_unit}</td>
            <td>${register.file_path}</td>
            <td>
                <input type="button" onclick="" value="修改" class="button">
                <input type="button" onclick="delRegister()" value="删除">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
