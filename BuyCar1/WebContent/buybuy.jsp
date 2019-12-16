<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<P> 这里是中心百货市场，请你输入你要买的物品并添加到购物车：
<h1>这里现在有许多东西</h1> <br>
       香蕉   :  8元一斤<br>
       苹果   :  10元一斤<br>
       西瓜   :  20元一个<br>
<form action="tatal" method="post">
  请你输入你要买的物品: <input name = "product" type = "text"><br>
 请你输入购买数量:<input name = "amount" type = "text">
<input type = "submit" value = "添加到购物车">
</form>
</body>
</html>