package LinkedPackage;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginCl extends HttpServlet{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	//�����û���������
     String u=request.getParameter("username");
     String p=request.getParameter("passwd");
     //��֤
     if(u.equals("china")&&p.equals("123")){
          //�Ϸ���          ��ת��welcome��
     HttpSession hs=request.getSession(true);
    	//�޸�session�Ĵ���ʱ��Ϊ20s
     hs.setMaxInactiveInterval(20);
     hs.setAttribute("pass", "ok");
     response.sendRedirect("/Linked/Welcome?uname="+u+"&password="+p);
        }else{
        //���Ϸ�       ��ת(��ԭ����)
        response.sendRedirect("/Linked/LoginServlet");//дurl
      //sendRedirect��urlӦ��ʾΪ/ webӦ����/servlet��url  
      }        
}
        public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	this.doGet(request,response);
	}
}