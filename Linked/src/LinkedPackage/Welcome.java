package LinkedPackage;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Welcome extends HttpServlet{
     public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setCharacterEncoding("gb2312");
        HttpSession hs=request.getSession(true);
        String val=(String)hs.getAttribute("pass");
        if(val==null) {//���ص�½����
        response.sendRedirect("/Linked/LoginServlet");
        }else {
        	String username=request.getParameter("uname");
            String password=request.getParameter("password");
        	PrintWriter pw=response.getWriter();
        	pw.println("<h1>������</h1>");
        	pw.println("welcome name="+username+"  password="+password);
        	pw.println("<a href='/Linked/LoginServlet'>�������µ�¼</a>");
        //������ʾ
        }
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	this.doGet(request,response);
	}
}
