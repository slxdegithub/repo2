
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

    <table action="/loginUser">
        <input type="text" placeholder="请输入用户账号" name="userNumber" id="userNumber">
        <input type="password" placeholder="请输入密码" name="password" id="password">
        <input type="submit" class="button" value="登录" >
    </table>
</body>
</html>
