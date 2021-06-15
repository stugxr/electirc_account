<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>UserHome</title>
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
    <!-- home -->
    <div id="home">
        <!--/top-nav -->
        <div class="top_w3pvt_main container">
            <!--/header -->
            <header class="nav_w3pvt text-center ">
                <!-- nav -->
                <nav class="wthree-w3ls">
                    <div id="logo">
                        <h1> 
						<a class="navbar-brand px-0 mx-0" href="#">电子账户</a>
                        </h1>
                    </div>

                    <label for="drop" class="toggle">Menu</label>
                    <input type="checkbox" id="drop" />
                    <ul class="menu mr-auto">
                        <li class="active"><a href="http://localhost:8088/toIndex">首页</a></li>
                        <li>
                            <!-- First Tier Drop Down -->
                            <label for="drop-2" class="toggle toggle-2">Pages <span class="fa fa-angle-down" aria-hidden="true"></span> </label>
                            <a href="#">个人业务  <span class="fa fa-angle-down" aria-hidden="true"></span></a>
                            <input type="checkbox" id="drop-2" />
                            <ul>
                                <li><a href="http://localhost:8088/toCost" class="drop-text">余额管理</a></li>
                                <li><a href="http://localhost:8088/toSalary" class="drop-text">流水查询</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
                <!-- //nav -->
            </header>
            <!--//header -->
        </div>
        <!-- //top-nav -->
        <!-- banner slider 轮播屏-->
        <div id="homepage-slider" class="st-slider">
            <input type="radio" class="cs_anchor radio" name="slider" id="play1" checked="" />
            <input type="radio" class="cs_anchor radio" name="slider" id="slide1" />
            <input type="radio" class="cs_anchor radio" name="slider" id="slide2" />
            <input type="radio" class="cs_anchor radio" name="slider" id="slide3" />
            <div class="images">
                <div class="images-inner">
                    <div class="image-slide">
                        <div class="banner-w3pvt-1">
                            <div class="overlay-w3ls">
                            </div>
                        </div>
                    </div>
                    <div class="image-slide">
                        <div class="banner-w3pvt-2">
                            <div class="overlay-w3ls">

                            </div>
                        </div>
                    </div>
                    <div class="image-slide">
                        <div class="banner-w3pvt-3">
                            <div class="overlay-w3ls">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="labels">
                <div class="fake-radio">
                    <label for="slide1" class="radio-btn"></label>
                    <label for="slide2" class="radio-btn"></label>
                    <label for="slide3" class="radio-btn"></label>
                </div>
            </div>
            <!-- banner-hny-info -->
            <div class="banner-hny-info">
                <h3>六组支付通</h3>
                <div class="top-buttons mx-auto text-center mt-md-5 mt-3">
                    <a href="http://localhost:8088/toSingle" class="btn more mr-2">了解更多</a>
                </div>
          </div>
            <!-- //banner-hny-info -->
        </div>
        <!-- //banner slider -->
    </div>
    <!-- //banner -->

    <!-- //home -->

    <!-- about -->
    <section class="about py-5">
        <div class="container p-md-5">
            <div class="about-hny-info text-left px-md-5">
                <h3 class="tittle-w3ls mb-3"><span class="pink">关于</span> 我们</h3>
                <p class="sub-tittle mt-3 mb-4">我们是一支十人的小团队，是一支年轻的团队，是一支独具特色的方案设计团队。我们的团队成员有陈天宇、李鹏辉、陈钊、李强、张二杰、赵鸿波、黄远洋、郭鑫仁、王一淋、李渊，我们都是即将毕业的大四学生，在设计系统方面我们没有特别丰富的实战经验，对于竞争激烈的方案设计市场来说我们的工作经验也远远不足，所以我们是一支年轻的队伍。但也正是因为我们的年轻，我们更具有拼劲，是一支能打硬仗的力量型队伍，无论面对多难出手的方案我们从来都不畏惧，无论面对多么紧张的时间要求我们也都能在有限的时间里努力创造亮点。</p>
                <a class="btn more black" href="http://localhost:8088/toSingle" role="button">Read More</a>
            </div>
        </div>
    </section>

 <section class="services" id="services">
        <div class="over-lay-blue py-5">
            <div class="container py-md-5">
                <div class="row my-4">
                    <div class="col-lg-5 services-innfo pr-5">
                        <h3 class="tittle-w3ls two mb-3 text-left"><span class="pink">我们</span>提供</h3>
                        <p class="sub-tittle mt-2 mb-sm-3 text-left">我们是一支十人的小团队，是一支年轻的团队，是一支独具特色的方案设计团队。我们的团队成员有陈天宇、李鹏辉、陈钊、李强、张二杰、赵鸿波、黄远洋、郭鑫仁、王一淋、李渊，我们都是即将毕业的大四学生，在设计系统方面我们没有特别丰富的实战经验，对于竞争激烈的方案设计市场来说我们的工作经验也远远不足，所以我们是一支年轻的队伍。但也正是因为我们的年轻，我们更具有拼劲，是一支能打硬仗的力量型队伍，无论面对多难出手的方案我们从来都不畏惧，无论面对多么紧张的时间要求我们也都能在有限的时间里努力创造亮点。</p>
                        <a href="services.html"><img src="images/ab2.jpg" alt="w3pvt" class="img-fluid"></a>
                    </div>
                    <div class="col-lg-7 services-grid-inf">
                        <div class="row services-w3pvt-main mt-5">
                            <div class="col-lg-6 feature-gird">
                                <div class="row features-hny-inner-gd mt-3">
                                    <div class="col-md-2 featured_grid_left">
                                        <div class="icon_left_grid">
                                            <span class="fa fa-paint-brush" aria-hidden="true"></span>
                                        </div>
                                    </div>
                                    <div class="col-md-10 featured_grid_right_info">
                                        <h4><a class="link-hny" href="http://localhost:8088/toSingle">智慧平台</a></h4>
                                        <p>智能停车、智能门禁、智能监控、客服呼叫中心、移动缴费终端、智能水电表，软硬件集成，智慧化服务，轻松实现服务升级！</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 feature-gird">
                                <div class="row features-hny-inner-gd mt-3">
                                    <div class="col-md-2 featured_grid_left">
                                        <div class="icon_left_grid">
                                            <span class="fa fa-bullhorn" aria-hidden="true"></span>
                                        </div>
                                    </div>
                                    <div class="col-md-10 featured_grid_right_info">
                                        <h4><a class="link-hny" href="http://localhost:8088/toSingle">财务系统对接</a></h4>
                                        <p>主流财务系统对接集成，管理 票据+凭证，数据自动同步；自动完成报表统计，方便省心！</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row services-w3pvt-main mt-5">
                            <div class="col-lg-6 feature-gird ">
                                <div class="row features-hny-inner-gd mt-3">
                                    <div class="col-md-2 featured_grid_left">
                                        <div class="icon_left_grid">
                                            <span class="fa fa-shield" aria-hidden="true"></span>
                                        </div>
                                    </div>
                                    <div class="col-md-10 featured_grid_right_info">
                                        <h4><a class="link-hny" href="http://localhost:8088/toSingle">分级权限管控</a></h4>
                                        <p>提供系统操作权限和数据权限的分级管控机制，可按岗位角色和组织架构设置系统权限，保障数据安全！</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 feature-gird">
                                <div class="row features-hny-inner-gd mt-3">
                                    <div class="col-md-2 featured_grid_left">
                                        <div class="icon_left_grid">
                                            <span class="fa fa-lightbulb-o" aria-hidden="true"></span>
                                        </div>
                                    </div>
                                    <div class="col-md-10 featured_grid_right_info">
                                        <h4><a class="link-hny" href="http://localhost:8088/toSingle">流程化设计</a></h4>
                                        <p>按照物业工作的业务流程设计，对应各个岗位角色实际业务，应用灵活，操作简便，上手快！</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>

</html>
