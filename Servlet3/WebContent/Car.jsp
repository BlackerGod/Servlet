<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>显示购物车购物信息</title>
    </head>
    <body>
        你的选择结果是：<br>
        <% request.setCharacterEncoding("UTF-8");
            String str="";
            if(session.getAttribute("s1")!=null)
            {
                str=(String)session.getAttribute("s1");
                out.println(str+"<br>");
            }
            if(session.getAttribute("s2")!=null);
            {
                str=(String)session.getAttribute("s2");
                out.print(str+"<br>");
            }
            if(session.getAttribute("s3")!=null)
            {
                str=(String)session.getAttribute("s3");
                out.print(str+"<br>");
            }
            if(session.getAttribute("s4")!=null)
            {
                str=(String)session.getAttribute("s4");
                out.print(str+"<br>");
            }
            
         %>
 <form action="Car.jsp" method="post">
 <input type="submit" name="清空" value="清空购物车">
 <%
 session.invalidate();
 %>
 </form>
    </body>
</html>