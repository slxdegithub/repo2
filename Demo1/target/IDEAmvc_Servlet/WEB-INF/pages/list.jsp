<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/23
  Time: 10:54
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
        <th>姓名</th>
        <th>学号</th>
        <th>年龄</th>
        <th>性别</th>
        <th>业余爱好</th>
        <th>个人描述</th>
        <th>
            <input type="text" placeholder="请输入名称" id="searchName" value="${searchName}">
            <input type="button" value="搜索" onclick="search()"/>
        </th>
        <th>
            <input type="button" value="注册"  onclick="add()" />
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${registerList}" var="register">

        <tr>
            <td>${register.name}</td>
            <td>${register.stu_no}</td>
            <td>${register.age}</td>
            <td>${register.sex}</td>
            <td>${register.hobbies}</td>
            <td>${register.description}</td>
            <td>
                <input type="button" onclick="" value="修改" class="button">
                <input type="button" onclick="delRegister(${register.stu_no})" value="删除">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
        <script>
            function add() {
                window.location.href="${pageContext.request.contextPath}/add";
            }

            function delRegister(data) {
                $.ajax({
                    url : '${pageContext.request.contextPath}/delRegister',
                    //secureuri : false,
                    dataType : 'json',//此时指定的是后台需要返回json字符串,前端自己解析,可以注释掉.后台直接返回map
                    data : {
                        stu_no:data
                    },
                    success : function(response) {
                        if(response.status=="1"){
                            alert("删除成功")
                            window.location.reload()
                        }else{
                            alert("删除失败")

                        }
                    }
                });
            }

            function search() {
                var name = document.getElementById("searchName").value;
                window.location.href = "/searchName?name=" + name

            }
        </script>
</body>
</html>
