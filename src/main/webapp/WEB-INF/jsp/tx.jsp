<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>提现</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        html {
            height: 100%;
        }

        body {
            height: 100%;
            background: #55ffff url(../images/txback4.jpg) 50% 50% no-repeat;
            background-size: cover;
        }

        .dowebok {
            position: absolute;
            left: 50%;
            top: 50%;
            width: 430px;
            height: 550px;
            margin: -300px 0px 0 -205px;
            border: 2px solid #ffffff;
            border-radius: 20px;
            overflow: hidden;
        }

        .logo {
            width: 104px;
            height: 104px;
            margin: 80px auto 50px;
            background: url(../images/tx.png) no-repeat 0 0px;
            transform: scale(1);
        }

        .form-item {
            position: relative;
            width: 360px;
            margin: 0 auto;
            padding-bottom: 30px;
        }

        .form-item input {
            width: 288px;
            height: 48px;
            padding-left: 70px;
            border: 2px solid #ffffff;
            border-radius: 25px;
            font-size: 18px;
            color: #ffffff;
            background-color: transparent;
            outline: none;
        }

        .form-item button {
            width: 360px;
            height: 50px;
            border: 1px;
            border-radius: 25px;
            font-size: 18px;
            color: #000000;
            outline: none;
            cursor: pointer;
            background-color: #ffffff;
        }

        #username {
            background: url(../images/money1.png) 20px 14px no-repeat;
        }

        #password {
            background: url(../images/password.png) 23px 11px no-repeat;
        }

        .tip {
            display: none;
            position: absolute;
            left: 20px;
            top: 52px;
            font-size: 14px;
            color: #f50;
        }

        .reg-bar {
            width: 360px;
            margin: 20px auto 0;
            font-size: 14px;
            overflow: hidden;
        }

        .reg-bar a {
            color: #ffffff;
            text-decoration: none;
        }

        .reg-bar a:hover {
            text-decoration: underline;
        }

        .reg-bar .reg {
            float: left;
        }

        .reg-bar .forget {
            float: right;
        }

        .dowebok ::-webkit-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #ffffff;
        }

        .dowebok :-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #ffffff;
        }

        .dowebok ::-moz-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #ffffff;
        }

        .dowebok :-ms-input-placeholder {
            font-size: 18px;
            line-height: 1.4;
            color: #ffffff;
        }

        @media screen and (max-width: 500px) {
            * {
                box-sizing: border-box;
            }

            .dowebok {
                position: static;
                width: auto;
                height: auto;
                margin: 0 30px;
                border: 0;
                border-radius: 0;
            }

            .logo {
                margin: 50px auto;
            }

            .form-item {
                width: auto;
            }

            .form-item input, .form-item button, .reg-bar {
                width: 100%;
            }
        }
    </style>
</head>
<body>
<div class="dowebok">
    <form action="/withDraw" method="post">
        <div class="logo"></div>
        <div  style="margin-left: 125px;margin-bottom: 45px;">
            <select name="bankType" style="font-size: 18px;border: 2px solid #ffffff;background-color: transparent;color: #000000;">
                <option value="建设银行">建设银行卡***666</option>
                <option value="农业银行">农业银行卡***555</option>
            </select>
        </div>
        <div class="form-item">
            <input id="username" name="withDrawMoney" style="color: deepskyblue" type="text" autocomplete="off" placeholder="提现金额">
            <p style="color: red ;margin-left: 3px">${errorMsg}</p>
        </div>
        <div class="form-item">
            <button id="submit" type="submit">提现</button>
        </div>
        <div class="reg-bar">
        </div>
    </form>
</div>
<script src="../js/jquery.min.js"></script>
<script>
    $(function () {
        $('input').val('')
        $('#submit').on('click', function () {
            $('.tip').show()
        })
    })
</script>

<div style="text-align:center;">
</div>

</body>
</html>