package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/Clear")
public class Clear extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	PrintWriter out = response.getWriter();
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

		//3.获取数据库操作对象
		Connection conn=DriverManager.getConnection(url, user, password);
		String sql = "delete from cart;";
		prepareStatement = conn.prepareStatement(sql); 
		prepareStatement.executeUpdate();
		System.out.print("购物车清空完毕");
		out.print("<script language=javascript>window.close();");
        out.print("</script>"); 
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}