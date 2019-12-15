package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/buy")
public class buy extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	PrintWriter out = response.getWriter();
	PreparedStatement prepareStatement1;
	PreparedStatement prepareStatement2;
	PreparedStatement prepareStatement3;
	PreparedStatement prepareStatement4;
	try {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
			//2.获取数据库连接
			String url="jdbc:mysql://localhost:3306/servlet?useSSL=false&serverTimezone=Asia/Shanghai";
			String user="root";
			String password="root";



		//3.获取数据库操作对象
		int sum=0;
		
		
		Connection conn1=DriverManager.getConnection(url, user, password);
		String sql1 = "SELECT 数量 FROM cart WHERE 书名='时间简史'";
		prepareStatement1 = conn1.prepareStatement(sql1); 
		ResultSet newQuery1 = prepareStatement1.executeQuery();
		while(newQuery1.next()) {
		int amount1=newQuery1.getInt("数量");
		out.println("时间简史的单价为：80.0元        "+"数量为:"+amount1+"    "+"合计为："+amount1*80+"<br>");
		sum=amount1*80;
		}
		
		Connection conn2=DriverManager.getConnection(url, user, password);
		String sql2 = "SELECT 数量 FROM cart WHERE 书名='七个谎言'";
		prepareStatement2 = conn2.prepareStatement(sql2); 
		 ResultSet newQuery2 = prepareStatement2.executeQuery();
		 while(newQuery2.next()) {
		 int amount2=newQuery2.getInt("数量");
		out.println("七个谎言的单价为：100.0元        "+"数量为:"+amount2+"    "+"合计为："+amount2*100+"<br>");
		sum+=amount2*100;
		 }
		
		
		
		Connection conn3=DriverManager.getConnection(url, user, password);
		String sql3 = "SELECT 数量 FROM cart WHERE 书名='史记'";
		prepareStatement3 = conn3.prepareStatement(sql3); 
		 ResultSet newQuery3 = prepareStatement3.executeQuery();
		 while(newQuery3.next()) {
		 int amount3=newQuery3.getInt("数量");
		out.println("史记的单价为：120.0元        "+"数量为:"+amount3+"    "+"合计为："+amount3*120+"<br>");
		sum+=amount3*120;
		 }
		
		Connection conn4=DriverManager.getConnection(url, user, password);
		String sql4 = "SELECT 数量 FROM cart WHERE 书名='泰戈尔诗集'";
		prepareStatement4 = conn4.prepareStatement(sql4); 
		ResultSet newQuery4 = prepareStatement4.executeQuery();
		if(newQuery4.next()) {
		int amount4=newQuery4.getInt("数量");
		out.println("泰戈尔诗集的单价为：140.0元        "+"数量为:"+amount4+"    "+"合计为："+amount4*140+"<br>");
		sum+=amount4*140;
		}
		out.println("共计为:"+sum+"元");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}