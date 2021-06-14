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
        .authorizeFail{
            color: red;
        }
        #btn {
            margin-left: 2px;
            margin-top: -5px;
            width: 150px;
            height: 25px;
            font-size: 11px;
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
                <legend class="">提现授权</legend>
            </div>
            <form class="form-horizontal" role="form" action="authorizeTransfer">
                <div class="form-group">
                    <label class="authorizeFail">${authorizeFail}</label>
                    <label class="col-sm-2 control-label">支付密码</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="phone" name="authorizePwd"
                               placeholder="请输入您的支付密码" required>
                    </div><br><br>
                    <div id="btn"><button class="btn btn-large btn-primary" type="submit">确定</button></div>
                </div>
            </form>
        </fieldset>
    </div>
</div>
</body>
</html>


