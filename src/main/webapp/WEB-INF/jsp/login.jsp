<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>

</head>
<body>

    <div id="login">
   <div id="top">
	<div id="top_left"><img src="images/logicon.jpeg" width="20" height="20"/></div>
			  <div id="top_center"></div>
		 </div>		
		 
		 <div id="center">
		      <div id="center_left"></div>
			  <div id="center_middle">
			    <form name="myForm" class="form-signin" action="login" method="post">
			       <div id="user">用 户
			         <input type="text" name="uname" />
			       </div>
				   <div id="password">密   码
				     <input type="password" name="pwd" />
				   </div>
				   <div id="btn"><button class="btn btn-large btn-primary" type="submit">登录</button></div>
			  </form>
			  </div>
			  <div id="center_right"></div>		 
		 </div>
		 <div id="down">
		      <div id="down_left">
			      
			  </div>
			  <div id="down_center"></div>		 
		 </div>

	</div>
</body>
</html>
