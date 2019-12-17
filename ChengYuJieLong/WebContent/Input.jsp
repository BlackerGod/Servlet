<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
