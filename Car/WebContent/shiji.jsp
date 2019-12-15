<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="./css/shu.css"/>
		<style type="text/css"> 
				.sousuokuang{
			position:absolute;
			
			margin-top: 70px;
			margin-left:450px;}
		
		.topBar{
			position:absolute;
			margin-top: 25px;
			margin-left:1250px; }
		.button{
			position:absolute;
			margin-top: 70px;
			margin-left:870px;
			}
		.logo{
				position:absolute;
				
				margin-left:50px;}
		.fengexian{
					position:absolute;
					margin-top: 130px;
				}
		</style>
	</head>
	<body bgcolor="lightblue">
				<div class="logo">
					   <img src="./img/u=375696152,3608813014&fm=214&gp=0.gif" alt="test" title="è¿æ¯logo" width="100"heigh="200"/>
					
				</div>
	
			 <div class="sousuokuang">
	                    <input type="text"    style="width: 400px;height: 35px;"   id="keyword" name="keyword" value="请输入">
	         </div>
			 
			<div class="topBar">
			          </b><a href="index.jsp" target="_blank" class="login">主页</a>
			            <span>|</span>
			            
	
			</div>
			<div class="button">
				<input type="submit"  style="width: 80px;height: 40px;"  value="搜索">
		    </div>
			
			<div class="fengexian">
				<HR align=center width=99999 color=lightslategray SIZE=2>	
			</div>
			
			
			
			
			<div class="shu">
				<div class="picture1">
					<input type="image" src="./img/timg.jpg" width="300"height="400"/>
				</div> 
				<div class="word1">
					<p>
						<ul>
							<li>书名：《史记》</li>
							<li>作者：司马迁</li>
							<li>上市时间：西汉</li>
							<li>售价：120.00元</li>
						</ul>
						<form action="tatal" method="post">
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</ng-pluralize>请输入数量:<input type="text" name="amount"></p>
							<input type="text" value="史记" name="1" style="display:none">
							<input type="text" value="120" name="2" style="display:none">
							<p>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="添加购物车"/></p>
						</form>
						
						
					</p>
			</div>
	</body>
</html>
