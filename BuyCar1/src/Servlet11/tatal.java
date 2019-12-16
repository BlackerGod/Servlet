package Servlet11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


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
	     String product = request.getParameter("product");
	     int amount =Integer.parseInt(request.getParameter("amount"));
       
//	     String[] bufeStrin = {product, product1, product2};
//	     for(String x : bufeStrin) {
//	    	 if(!map.containsKey(x)) {
//	    		 map.put(product, amount);  
//	    	 }
//	    	 else {
//	    		 int value = map.get(product);
//		    	 map.put(product, value + amount);
//	    	 }
//	     }
	     if(!map.containsKey(product)){
	         map.put(product, amount);  
	     }else {
	    	 int value = map.get(product);
	    	 map.put(product, value + amount);
	     }
	     
        out.write("添加成功");
		out.write("<a href='buybuy.jsp'><h3>继续购物</h3></a><br>");
		out.write("<a href='list.jsp'><h3>结算购物车</h3></a><br>");
	}
	 
	 
	 @Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			this.doPost(request, response);
		}
}