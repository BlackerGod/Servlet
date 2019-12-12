<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage ="error.jsp"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name=request.getParameter("src");
double result=0.0;
if(name !=null){
for(int i=0;i<name.length();i++){
	if(name.charAt(i)<'0' || name.charAt(i)>'9'){
		int num=10/0;
		break;
	}
}
int arr=Integer.valueOf(name);
 result=(double)arr;
 out.print("</br>");
 out.print("转换后的浮点数字为:");
 out.print("</br>");
 out.print(result);
} else {
out.print("</br>");
out.print("转换后的浮点数字为:");
out.print("</br>");
out.print("null");
}
%>
</body>
</html>