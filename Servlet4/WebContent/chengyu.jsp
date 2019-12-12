<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
  String message="";
  ServletContext application;
  synchronized void sendMessage(String s){
	  application=getServletContext();
	  message=message+s+"->";
	  application.setAttribute("message",message);
  }
%>
<%! 
String result;
%>
<% 
request.setCharacterEncoding("UTF-8");
String content=request.getParameter("message");
sendMessage(content);
out.print("你的四字成语:<br/>"+content+"已经提交！3秒回到主页");
response.setHeader("refresh","3;url=input2.jsp");
%>
<a href="http://i.itpk.cn/api.php?question=@cy<%=content%>">点击开始接龙</a>



</body>
</html>