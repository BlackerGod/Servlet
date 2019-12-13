<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车</title>
</head>
<body>
  <h3>你购买的物品如下</h3>
  <%
		//获取map
		Map<String, Integer> map =(Map<String, Integer>)session.getAttribute("cart");
		//遍历map
		int sum = 0;
		if(map != null){
			for(String key : map.keySet()){
				int value = map.get(key);
				//key： 商品名称   	value：商品数量
	%>
		<h3>名称:<%= key %>	数量:<%= value %></h3></br>
	<% 
			if(key.equals("时间简史")){
				System.out.println("时间简史:"+80*value);
				sum += 80*value;
			} else if(key.equals("七个谎言")){
				System.out.println("七个谎言:"+100*value);
				sum += 100*value;
			} else if(key.equals("史记")){
				System.out.println("史记:"+120*value);
				sum += 120*value;
			}  else if(key.equals("泰戈尔诗集")){
				System.out.println("泰戈尔诗集:"+140*value);
				sum += 140*value;
			}
	}
}
	%>
		<h3>总计:<%= sum %></h3></br>
	<%
	%>
	<a href='Book.jsp'><h4>继续购物</h4></a><br>
	<a href="Clear"><h4>清空购物车</h4></a>
</body>
</html>