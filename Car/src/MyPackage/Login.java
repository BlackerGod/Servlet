package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	Statement st=null;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	boolean flag=false;
	try {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//2.获取数据库连接
			String url="jdbc:mysql://localhost:3306/servlet?useSSL=false&serverTimezone=Asia/Shanghai";
			String user="root";
			String password="root";
		conn=DriverManager.getConnection(url, user, password);
		//3.获取数据库操作对象
		
		String sql="select username from user where username= ? and Userpassword = ?";
		//sql语句进行预编译
		ps=conn.prepareStatement(sql);
		String name=request.getParameter("username");
		String mima=request.getParameter("userPassword");
		//对sql语句进行赋值
		ps.setString(1,name);
		ps.setString(2,mima);
		rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("登录成功");
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("登录错误");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
	 {
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps!=null)
		{
			
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }

}


}