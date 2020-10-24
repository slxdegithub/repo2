<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/16
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="../js/jquery-2.1.0.min.js"></script>
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
        <th>学号</th>
        <th>年龄</th>
        <th>姓名</th>
        <th>
            <input type="text" placeholder="请输入查询的学号" id="searchKind">
            <input type="button" value="搜索" onclick="search()"></input>
        </th>
        <th>
            <input type="button" value="添加学生"  onclick="search()"></input>
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allStudent}" var="student">

        <tr>
            <td>${student.stu_no}</td>
            <td>${student.age}</td>
            <td>${student.name}</td>
            <td>
                <input type="button" onclick="" value="修改" class="button">
                <input type="button" onclick="deleteStudent(${student.stu_no})" value="删除">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>




<script>
    function search() {
        var a = document.getElementById("searchKind").value;
        window.location.href = "/selectOne?stuNumber=" + a
    }

    function deleteStudent(data){

        $.ajax({
            url : '${pageContext.request.contextPath}/deleteStudent',
            //secureuri : false,
            dataType : 'json',//此时指定的是后台需要返回json字符串,前端自己解析,可以注释掉.后台直接返回map
            data : {
                stuNumber:data
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

    //输入框调用回车事件 按类别搜索
    $('#searchkind').bind('keypress', function (event) {

        if (event.keyCode == "13") {
            // searchClick();
            search();
        }
    });
</script>
</body>
</html>
