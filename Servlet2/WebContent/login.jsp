<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="LoginCookie" method="post">
  <table>
    <tr>
    <th>用户名：</th></br>
    <td><input type="text" name="uname" value=""></td>
    </tr>
    <tr>
    <th>密码</th>
    <td><input type="password" name="pwd" value=""></td>
    </tr>
    <tr>
    <th colspan="2"><input type="checkbox" name="che" value="yes">两周免登录</th>
    </tr>
    <tr>
    <th colspan="2"><input type="submit" value="登录"></th>
    </tr>
    </table>
  </form>
</body>
</html>