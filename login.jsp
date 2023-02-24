
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>???????</title>
</head>
<body>
<form action="userLoginServlet">
   <table align="center">
   <caption> 用户登录</caption>
       <tr>
          <td>用户名：</td>     
            <td><input type="text" name="name"></td>       	
       </tr>   
       <tr>
          <td>密码：</td>     
            <td><input type="text" name="pwd"></td>       	
       </tr>   
       <tr>
          <td><input type="submit" value="登录"></td>     
            <td><input type="reset" value="重置"></td>       	
       </tr>   
       <tr>
       <td colspan="2"><span>${msg}</span></td>
         </table>

</form>

</body>
</html>