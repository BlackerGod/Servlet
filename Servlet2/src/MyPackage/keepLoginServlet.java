package MyPackage;




import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCookie
 */
@WebServlet("/LoginCookie")
public class keepLoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //System.out.println("LoginCookie.service()");
        System.out.println("登陆成功");
        //处理中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        
        //获取请求参数
        String name=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        String check=req.getParameter("che");
        

        if(check!=null&&"yes".equals(check)){
            if((name!=null&&!"".equals(name))&&(pwd!=null&&!"".equals(pwd))){
                
            Cookie cookiename=new Cookie("cookiename",URLEncoder.encode(name,"utf-8"));
            Cookie cookiepwd=new Cookie("cookiename",URLEncoder.encode(pwd,"utf-8"));
            System.out.println("LoginCookie.service(存储cookie)有效期是2周");
            cookiename.setMaxAge(14*24*3600);
            cookiepwd.setMaxAge(14*24*3600);
            
            cookiename.setPath(req.getContextPath()+"/LoginCookie");
            cookiepwd.setPath(req.getContextPath()+"/LoginCookie");
            

            resp.addCookie(cookiename);
            resp.addCookie(cookiepwd);
            
            resp.getWriter().print(name+"普通方式登陆成功！");
        }
        
        //如果用户名和密码为空，从客户端硬盘中读取cookie
        if((name==null||"".equals(name))||(pwd==null||"".equals(pwd))){
            //读取cookie
        Cookie[] cookies=req.getCookies();
        //过滤出用户名和密码
        if(cookies!=null&&cookies.length>0){
            for(int i=0;i<cookies.length;i++){
                //取出用户名
                if("cookiename".equals(cookies[i].getName())){
                    //pwd=cookies[i].getValue();
                    resp.getWriter().print("cookie方式登录成功！账号 "+name);
                    name=URLDecoder.decode(cookies[i].getValue(),"utf-8");
                    pwd=URLDecoder.decode(cookies[i].getValue(),"utf-8");
                }
                
            }
            }
      }
        } 
        
    }
}
