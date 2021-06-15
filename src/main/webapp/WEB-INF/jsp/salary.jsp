<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>Cost</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="" />
    <script>
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }

    </script>
    <!-- //Meta tag Keywords -->
    <!-- Custom-Files -->
    <link rel="stylesheet" href="../css/bootstrap.css">
    <!-- Bootstrap-Core-CSS -->
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
    <!-- Style-CSS -->
    <!-- font-awesome-icons -->
    <link href="../css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome-icons -->

</head>
<body>
    <!--/home -->
    <div id="home" class="inner-w3pvt-page">
        <div class="overlay-innerpage">
            <!--/top-nav -->
            <div class="top_w3pvt_main container">
                <!--/header -->
                <header class="nav_w3pvt text-center">
                    <!-- nav -->
                    <nav class="wthree-w3ls">
                        <div id="logo">
                            <h1> <a class="navbar-brand px-0 mx-0" href="index.jsp">电子账户</a>
                            </h1>
                        </div>

                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                        <ul class="menu mr-auto">
                            <li><a href="http://localhost:8088/toUserIndex">首页</a></li>
                        </ul>
                    </nav>
                    <!-- //nav -->
                </header>
                <!--//header -->

                <!--/breadcrumb-->
                <div class="inner-w3pvt-page-info">
                    <ol class="breadcrumb d-flex">
                        <li class="breadcrumb-item">
                            <a href="http://localhost:8088/toUserIndex">首页</a>
                        </li>
                        <li class="breadcrumb-item active">流水查询</li>
                    </ol>

                </div>
                <!--//breadcrumb-->
            </div>
            <!-- //top-nav -->
        </div>
    </div>
    <!-- //about -->
	<!--/Cost-->

    <section class="about py-6">
	    <div class="container p-md-6">
	        <h3 class="tittle-w3ls text-center">流水表</h3><br/>
            <div class="table-responsive">
                <table class="table table-striped table-bordered">
                    <tr class="">
                        <th>交易编号</th><th>收款账号</th><th>交易名称</th><th>交易方式</th>
                        <th>交易时间</th><th>交易备注</th><th>客户余额</th><th>交易状态</th>
                        <th>交易模式</th><th>转账金额</th><th>柜员账号</th><th>货币类型</th>
                        <th>跨行交易</th><th>客户等级</th><th>服务费用</th><th>转账代码</th>


                    </tr>
                    <tr class="">
                        <th>*</th><th>*</th><th>*</th><th>*</th>
                        <th>*</th><th>*</th><th>*</th><th>*</th>
                        <th>*</th><th>*</th><th>*</th><th>*</th>
                        <th>*</th><th>*</th><th>*</th><th>*</th>

                    </tr>

                </table>
            </div>

	    </div>
	</section>
	<!--//Cost-->
    <!--/services-->
<%--    <section class="services" id="services">--%>
<%--        <div class="over-lay-blue py-5">--%>
<%--            <div class="container py-md-5">--%>
<%--                <div class="row my-4">--%>
<%--                    <div class="col-lg-5 services-innfo pr-5">--%>
<%--                        <h3 class="tittle-w3ls two mb-3 text-left"><span class="pink">我们</span>提供</h3>--%>
<%--                        <p class="sub-tittle mt-2 mb-sm-3 text-left">一个小区管理平台，使小区内的住户能够通过该平台登记个人信息、缴纳费用以及办理相关业务；同时也使负责小区的业务人员能够通过该平台查看及处理待办业务。</p>--%>
<%--                        <a href="services.html"><img src="images/ab2.jpg" alt="w3pvt" class="img-fluid"></a>--%>
<%--                    </div>--%>
<%--                    <div class="col-lg-7 services-grid-inf">--%>
<%--                        <div class="row services-w3pvt-main mt-5">--%>
<%--                            <div class="col-lg-6 feature-gird">--%>
<%--                                <div class="row features-hny-inner-gd mt-3">--%>
<%--                                    <div class="col-md-2 featured_grid_left">--%>
<%--                                        <div class="icon_left_grid">--%>
<%--                                            <span class="fa fa-paint-brush" aria-hidden="true"></span>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-10 featured_grid_right_info">--%>
<%--                                        <h4><a class="link-hny" href="single.jsp">智慧平台</a></h4>--%>
<%--                                        <p>智能停车、智能门禁、智能监控、客服呼叫中心、移动缴费终端、智能水电表，软硬件集成，智慧化服务，轻松实现服务升级！</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 feature-gird">--%>
<%--                                <div class="row features-hny-inner-gd mt-3">--%>
<%--                                    <div class="col-md-2 featured_grid_left">--%>
<%--                                        <div class="icon_left_grid">--%>
<%--                                            <span class="fa fa-bullhorn" aria-hidden="true"></span>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-10 featured_grid_right_info">--%>
<%--                                        <h4><a class="link-hny" href="single.jsp">财务系统对接</a></h4>--%>
<%--                                        <p>主流财务系统对接集成，管理 票据+凭证，数据自动同步；自动完成报表统计，支持导出EXCEL，方便省心！</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="row services-w3pvt-main mt-5">--%>
<%--                            <div class="col-lg-6 feature-gird ">--%>
<%--                                <div class="row features-hny-inner-gd mt-3">--%>
<%--                                    <div class="col-md-2 featured_grid_left">--%>
<%--                                        <div class="icon_left_grid">--%>
<%--                                            <span class="fa fa-shield" aria-hidden="true"></span>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-10 featured_grid_right_info">--%>
<%--                                        <h4><a class="link-hny" href="single.jsp">分级权限管控</a></h4>--%>
<%--                                        <p>提供系统操作权限和数据权限的分级管控机制，可按岗位角色和组织架构设置系统权限，保障数据安全！</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 feature-gird">--%>
<%--                                <div class="row features-hny-inner-gd mt-3">--%>
<%--                                    <div class="col-md-2 featured_grid_left">--%>
<%--                                        <div class="icon_left_grid">--%>
<%--                                            <span class="fa fa-lightbulb-o" aria-hidden="true"></span>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-10 featured_grid_right_info">--%>
<%--                                        <h4><a class="link-hny" href="single.jsp">流程化设计</a></h4>--%>
<%--                                        <p>按照物业工作的业务流程设计，对应各个岗位角色实际业务，应用灵活，操作简便，上手快！</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </section>--%>
    <!--//services-->
</body>

</html>
