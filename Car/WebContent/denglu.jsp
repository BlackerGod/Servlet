<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎来到登录界面</title>
		<link rel="stylesheet" href="css/a.css" type="text/css">
		
	</head>
	<body>
	<div class="zhidao">
		<div class="register">
			<div class="title">
				<span>用户登录</span>
			</div>
			<form action="Login" method="post">
				<div class="username1">
					<span class="require">*</span>
					<label for="username">用户名</label>
					<div class="username-input">
						<input type="text"  id="username" name="username" placeholder="请输入用户名 长度:6-12个字符" />
					</div>
				</div>
	
				<div class="xiao-userPassword-box">
					<span class="require">*</span>
					<label for="userPassword">密码</label>
					<div class="xiao-userPassword-input">
						<input type="password" id="userPassword" name="userPassword" placeholder="请输入密码 长度:6-12个字符" />
					</div>
				</div>
				<div class="xiao-submit-box">
			
					<input id = "xiao-submit-button" type="submit" value="登录">
				</div>
				
				</form>>
				<div class="xiao-goLogin-box">
					<a href="zhuce.jsp" style="text-decoration: none;">没有账号？去注册</a>
				</div>
			</div>
			</div>
			
		
	</body>
	
</html>