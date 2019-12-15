package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/tatal")
public class tatal extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	PrintWriter out = response.getWriter();
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
		
		String sql = "insert into cart values(?,?,?)";
		//sql语句进行预编译
		 String bookname =request.getParameter("1");
		 int price =Integer.parseInt(request.getParameter("2"));
		 int amount =Integer.parseInt(request.getParameter("amount"));
	     prepareStatement = conn.prepareStatement(sql);
	     prepareStatement.setString(1, bookname);
	     prepareStatement.setInt(2, price);
	     prepareStatement.setInt(3, amount);
		prepareStatement.executeUpdate();
		System.out.println("添加购物车成功");
		out.print("<script language=javascript>window.close();");
        out.print("</script>"); 
		
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