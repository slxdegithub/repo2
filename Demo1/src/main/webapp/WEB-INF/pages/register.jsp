<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2020/9/30
  Time: 10:28
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

<form role="form" action="/submitRegister" enctype="multipart/form-data">
    <div class="form-group">
       工程名称：<input type="text" class="form-control" id="project_name" name="project_name" placeholder="请输入名称">
       施工单位：<input type="text" class="form-control" id="sg_unit" name="sg_unit" placeholder="请输入名称">
       建设单位：<input type="text" class="form-control" id="js_unit" name="js_unit" placeholder="请输入名称">
       监理单位：<input type="text" class="form-control" id="jl_unit" name="jl_unit" placeholder="请输入名称">
    </div>
    <div class="form-group">
        <label for="inputfile">文件输入</label>
        <input type="file" id="inputfile" name="file_path" >
    </div>

    <button type="reset" class="btn btn-default">重置</button>
    <button type="submit" class="btn btn-default">提交</button>
</form>

</body>
</html>
