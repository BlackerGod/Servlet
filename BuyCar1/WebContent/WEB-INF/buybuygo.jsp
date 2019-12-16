<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
P> 这里是中心百货市场，请你输入你要买的物品并添加到购物车：
<h1>这里现在有许多东西</h1> <br>
       香蕉   :  8元一斤<br>
       苹果   :  10元一斤<br>
       西瓜   :  20元一个<br>
<form action="tatal" method="post">
<h3>这是水果摊位,请你选择:</h3><br>
<select name = "product">
<option value= "香蕉">香蕉</option>
<option value= "苹果">苹果</option>
<option value= "西瓜">西瓜</option>
</select>
<input type = "submit" value = "添加到购物车">
</form>
</body>
</html>