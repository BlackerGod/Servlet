<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>账户注册</title>
     <link rel="stylesheet" type="text/css" href="css/b.css"/>
</head>
<body>
	<div class="zhidao">
		<div class="register">
			<div class="title">
				<span>用户注册</span>
			</div>
			<form action="Zhuce" method="post">
				<div class="username1">
					<span class="xiao-require">*</span>
					<label for="username">用户名</label>
					<div class="username-input">
						<input type="text" id="username" name="username" placeholder="请输入用户名 长度:6-12个字符" />
					</div>
				</div>
 
				<div class="xiao-userPassword-box">
					<span class="xiao-require">*</span>
					<label for="userPassword">密码</label>
					<div class="xiao-userPassword-input">
						<input type="password" id="userPassword" name="userPassword" placeholder="请输入密码 长度:6-12个字符" />
					</div>
				</div>
 
				<div class="xiao-userRePassword-box">
				<span class="xiao-require">*</span>
						<label for="userRePassword">确认密码</label>
					<div class="xiao-userRePassword-input">
						<input type="password" id="userRePassword" name="userRePassword" placeholder="请重复输入密码" />
					</div>
				</div>
 
				<div class="xiao-userPhone-box">
					<span class="xiao-require">*</span>
					<label for="userPhone">手机号码</label>
					<div class="xiao-userPhone-input">
						<input type="text" id="userPhone" name="userPhone" placeholder="请输入您的手机号码，11位有效数字" />
					</div>
				</div>
				
				<div class="xiao-userEmail-box">
					<span class="xiao-require">*</span>
					<label for="userEmail">电子邮箱</label>
					<div class="xiao-userEmail-input">
						<input type="text" id="userEmail" name="userEmail" placeholder="请输入您的邮箱地址，如：123@qq.com" />
					</div>
				</div>
				
				<div class="xiao-userGender-box">
					<span class="xiao-require">*</span>
					<label for="userGender">性别</label>
					<div class="xiao-userGender-input">
						<input type="radio" id="userGender_01" name="userGender" value="男" checked="checked" />男   
						<input type="radio" id="userGender_02" name="userGender" value="女" />女
					</div>
				</div>
				
				<div class="xiao-submit-box">
					<input id = "xiao-submit-button" type="submit" value="注册">
				</div>
				
				<div class="xiao-goLogin-box">
					<a href="denglu.jsp" style="text-decoration: none;">已有账号？去登录</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>