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
        //��������������
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
			//2.��ȡ���ݿ�����
			String url="jdbc:mysql://localhost:3306/servlet?useSSL=false&serverTimezone=Asia/Shanghai";
			String user="root";
			String password="root";



		//3.��ȡ���ݿ��������
		int sum=0;
		
		
		Connection conn1=DriverManager.getConnection(url, user, password);
		String sql1 = "SELECT ���� FROM cart WHERE ����='ʱ���ʷ'";
		prepareStatement1 = conn1.prepareStatement(sql1); 
		ResultSet newQuery1 = prepareStatement1.executeQuery();
		while(newQuery1.next()) {
		int amount1=newQuery1.getInt("����");
		out.println("ʱ���ʷ�ĵ���Ϊ��80.0Ԫ        "+"����Ϊ:"+amount1+"    "+"�ϼ�Ϊ��"+amount1*80+"<br>");
		sum=amount1*80;
		}
		
		Connection conn2=DriverManager.getConnection(url, user, password);
		String sql2 = "SELECT ���� FROM cart WHERE ����='�߸�����'";
		prepareStatement2 = conn2.prepareStatement(sql2); 
		 ResultSet newQuery2 = prepareStatement2.executeQuery();
		 while(newQuery2.next()) {
		 int amount2=newQuery2.getInt("����");
		out.println("�߸����Եĵ���Ϊ��100.0Ԫ        "+"����Ϊ:"+amount2+"    "+"�ϼ�Ϊ��"+amount2*100+"<br>");
		sum+=amount2*100;
		 }
		
		
		
		Connection conn3=DriverManager.getConnection(url, user, password);
		String sql3 = "SELECT ���� FROM cart WHERE ����='ʷ��'";
		prepareStatement3 = conn3.prepareStatement(sql3); 
		 ResultSet newQuery3 = prepareStatement3.executeQuery();
		 while(newQuery3.next()) {
		 int amount3=newQuery3.getInt("����");
		out.println("ʷ�ǵĵ���Ϊ��120.0Ԫ        "+"����Ϊ:"+amount3+"    "+"�ϼ�Ϊ��"+amount3*120+"<br>");
		sum+=amount3*120;
		 }
		
		Connection conn4=DriverManager.getConnection(url, user, password);
		String sql4 = "SELECT ���� FROM cart WHERE ����='̩���ʫ��'";
		prepareStatement4 = conn4.prepareStatement(sql4); 
		ResultSet newQuery4 = prepareStatement4.executeQuery();
		if(newQuery4.next()) {
		int amount4=newQuery4.getInt("����");
		out.println("̩���ʫ���ĵ���Ϊ��140.0Ԫ        "+"����Ϊ:"+amount4+"    "+"�ϼ�Ϊ��"+amount4*140+"<br>");
		sum+=amount4*140;
		}
		out.println("����Ϊ:"+sum+"Ԫ");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}