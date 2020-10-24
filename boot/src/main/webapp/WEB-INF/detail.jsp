<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/10/14
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登入成功 <br>
userName = ${user.userName} <br>
userNumber = ${user.userNum} <br>
userPsd = ${user.userPsd} <br>
userPhone =${user.userPhone} <br>
url : ${ftps.url} <br>
file_path : ${ftps.file_path}<br>
ftp_server : ${ftps.ftp_server}<br>
ftp_port : ${ftps.ftp_port}<br>
ftp_user : ${ftps.ftp_user}<br>
ftp_password : ${ftps.ftp_password}<br>
</body>
</html>
