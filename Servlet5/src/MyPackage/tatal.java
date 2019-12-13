package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/tatal")
public class tatal extends HttpServlet{
	
	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("UTF-8");
	     response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out=response.getWriter();
	     Map<String, Integer> map = (Map<String, Integer>)request.getSession().getAttribute("cart");
	     if(map == null) {
	    	 map = new LinkedHashMap<String, Integer>();
	    	 request.getSession().setAttribute("cart", map);
	     }
	     
	     
	     int amount1 =Integer.parseInt(request.getParameter("amount1"));
	     int amount2 =Integer.parseInt(request.getParameter("amount2"));
	     int amount3 =Integer.parseInt(request.getParameter("amount3"));
	     int amount4 =Integer.parseInt(request.getParameter("amount4"));
	     
	     if(!map.containsKey("时间简史")){
		     map.put("时间简史",amount1); 
	     }else {
	    	 int value = map.get("时间简史");
	    	 map.put("时间简史", value + amount1);
	     }
	     
	     if(!map.containsKey("七个谎言")){
	    	 map.put("七个谎言",amount2);
	     }else {
	    	 int value = map.get("七个谎言");
	    	 map.put("七个谎言", value + amount2);
	     }
		 
	     if(!map.containsKey("史记")){
	    	 map.put("史记",amount3);
	     }else {
	    	 int value = map.get("史记");
	    	 map.put("史记", value + amount3);
	     }
	     
	     if(!map.containsKey("泰戈尔诗集")){
	    	 map.put("泰戈尔诗集",amount4);
	     }else {
	    	 int value = map.get("泰戈尔诗集");
	    	 map.put("泰戈尔诗集", value + amount4);
	     }


	    
	     
	     
	        out.write("添加成功");
			out.write("<a href='Book.jsp'><h3>继续购物</h3></a><br>");
			out.write("<a href='Car.jsp'><h3>结算购物车</h3></a><br>");
	}
	 
	 
	 @Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			this.doPost(request, response);
		}
}