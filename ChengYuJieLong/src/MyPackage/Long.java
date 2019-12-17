package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import net.sourceforge.pinyin4j.*;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/Long")

public class Long extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //中文乱码解决方法
       doPost(request,response);
}
	public static String message="";
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{ 
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("GBK");
	PrintWriter out = response.getWriter();
	PreparedStatement prepareStatement1;

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
			String result = request.getParameter("message");
			char a[]=result.toCharArray();
			
			HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
			t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
			t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
			t3.setVCharType(HanyuPinyinVCharType.WITH_V);
			String[] t2=new String[10];
			 try {
				t2 = PinyinHelper.toHanyuPinyinStringArray(a[3], t3);
			} catch (BadHanyuPinyinOutputFormatCombination e1) {
				
				e1.printStackTrace();
			}
			
			
			
			
			
			
			try {
				Connection conn=DriverManager.getConnection(url, user, password);
				String sql="select ChengYu FROM sheet1 where PingYin like ? order by rand() limit 1;";
				prepareStatement1 = conn.prepareStatement(sql); 
				prepareStatement1.setString(1, t2[0] + " %");
				ResultSet resultSet = prepareStatement1.executeQuery();
				
				while (resultSet.next()){
                   
                    String name=resultSet.getString("ChengYu");
              
                    //System.out.println(name);
                    
                    ServletContext application;
                    application=getServletContext();
                  	  message=message+result+"->"+name+"->";
                  	  application.setAttribute("message",message);
                  	
					out.print("你的四字成语:<br/>"+result+"已经提交！3秒回到主页");
                  	response.setHeader("refresh","3;url=Input.jsp");
                    return;
                }
				System.out.println("服务器未收录!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
}