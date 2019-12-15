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
        //��������������
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
			//2.��ȡ���ݿ�����
			String url="jdbc:mysql://localhost:3306/servlet?useSSL=false&serverTimezone=Asia/Shanghai";
			String user="root";
			String password="root";
		conn=DriverManager.getConnection(url, user, password);
		//3.��ȡ���ݿ��������
		
		String sql="select username from user where username= ? and Userpassword = ?";
		//sql������Ԥ����
		ps=conn.prepareStatement(sql);
		String name=request.getParameter("username");
		String mima=request.getParameter("userPassword");
		//��sql�����и�ֵ
		ps.setString(1,name);
		ps.setString(2,mima);
		rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("��¼�ɹ�");
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("��¼����");
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