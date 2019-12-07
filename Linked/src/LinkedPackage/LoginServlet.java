package LinkedPackage;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet{
     public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
         //中文乱码解决方法
        response.setContentType("text/html;charset=gb2312");
        PrintWriter pw = response.getWriter();
        //返回登陆界面
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>登陆界面</h1>");
        pw.println("<form action=/Linked/LoginCl method=post>");
        pw.println("用户名：<input type=text name=username><br>");
        pw.println("密    码：<input type=password name=passwd><br>");
        pw.println("<input type=submit value=登录><br>");
        pw.println("</form>");
        pw.println("</body>");
        pw.println("</html>");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	this.doGet(request,response);
	}
}