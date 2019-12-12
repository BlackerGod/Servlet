<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>计数器</title>
</head>
<body>
<%! int count=0;

synchronized void setCount()

{ 
	count++;
}

 %>

 <% setCount();

  out.println("您是第"+count+"个访问本站的用户");

  %>
</body>
</html>