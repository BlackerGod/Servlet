<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd 

 

">
<html>
<head>
<title>成语接龙</title>
</head>
<body>
      <%
      String chengyu = (String)application.getAttribute("message");
      if(chengyu!=null){
    	  out.print(chengyu);
      }
      %>
          

     <form action="Long" method="post">
          请输入成语:<input name="message" type="text"><br/>
     <input type="submit" value="提交">

     </form>

</body>
</html>
