package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/Zhuce")
public class Zhuce extends HttpServlet {
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
	PreparedStatement prepareStatement;
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
		
		String sql="insert into user values(?,?,?,?,?)";
		//sql语句进行预编译
		String name=request.getParameter("username");
		String mima=request.getParameter("userPassword");
		String tele=request.getParameter("userPhone");
		String email=request.getParameter("userEmail");
		String sex=request.getParameter("userGender");
		//对sql语句进行赋值
		prepareStatement = conn.prepareStatement(sql);
		
        prepareStatement.setString(1, name);
        prepareStatement.setString(2, mima);
        prepareStatement.setString(3, tele);
        prepareStatement.setString(4, email);
        prepareStatement.setString(5, sex);
        prepareStatement.executeUpdate();
        System.out.println("注册成功");
        response.sendRedirect("denglu.jsp");
		
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