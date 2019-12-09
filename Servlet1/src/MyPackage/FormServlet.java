package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	PrintWriter out=response.getWriter();
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String rePassword = request.getParameter("rePassword");
	String sex = request.getParameter("sex");
	String[] hobbies = request.getParameterValues("hobbies");
	String Info = request.getParameter("info");
	
	out.println("用户名=" + username +"</br>");
	out.println("密码=" + password +"</br>");
	out.println("确认密码=" + rePassword +"</br>");
	out.println("性别=" + sex +"</br>");
	for(String str:hobbies) {
		out.println("兴趣爱好=" + str +"</br>");
	}
	out.println("个人描述=" + Info +"</br>");
	
  }

}
