<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>授权</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <style type="text/css">
        #login {
            width: 450px;
            height: 100px;
            margin: 126px auto;
        }

        body {
            background-color: #ecfcf9;
        }
    </style>
</head>
<body>
<div class="container">
    <div id="login">
        <fieldset>
            <div id="legend" class="">
                <legend class="">提现成功</legend>
                <a href="main.jsp">回到主页</a>

            </div>
        </fieldset>
    </div>
</div>
</body>
</html>


