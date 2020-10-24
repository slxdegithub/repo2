
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<script type="text/javascript" src="../js/jquery-2.1.0.min.js"></script>--%>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<html>
<body>


    <form  >
        <input type="text" placeholder="请输入用户账号" name="userNumber" id="userNumber">
        <input type="password" placeholder="请输入密码" name="password" id="password">
        <input  class="button" value="登录" onclick="loginJson()" >
    </form>

    <script>
        function loginJson() {
            var userNumber = document.getElementById("userNumber").value;
            var password = document.getElementById("password").value;
            $.ajax({
                url : '${pageContext.request.contextPath}/loginJson',
                //secureuri : false,
                dataType : 'json',//此时指定的是后台需要返回json字符串,前端自己解析,可以注释掉.后台直接返回map
                data : {
                    userNumber:userNumber,
                    password:password
                },
                success : function(response) {
                    if(response.status=="1"){
                        alert("userNumber=" + response.userNumber )
                        alert( "password=" + response.password)
                    }else if (response.status=="0") {
                        alert("错误咯")
                    }
                }
            });
        }
    </script>
</body>
</html>
