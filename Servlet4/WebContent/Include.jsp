<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>Insert title here</title>
</head>
<body>
<%
out.println("欢迎来到本系统");

%>
<br/>
<%@ include file="info.jsp" %><%-- 这是指令 --%>
<jsp:include page="info.jsp"></jsp:include><%-- 这是动作 --%>
</body>
</html>