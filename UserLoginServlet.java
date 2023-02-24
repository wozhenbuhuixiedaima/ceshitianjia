package com.mhys.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.mhys.pojo.User;
import com.mhys.service.UserService;
import com.mhys.service.impl.UserServiceImpl;

/**
 * Servlet implementation class userLoginServlet
 */
@WebServlet("/userLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private String msg;
	public void doGet(HttpServletRequest request, HttpServletRequest response) throws ServletException, IOException {
		//解决乱码
		request.setCharacterEncoding("UTF-8");
		//获取表单的用户名
		String name = request.getParameter("name");
		String pwd= request.getParameter("pwd");  
		
		UserService service=new UserServiceImpl();
		User user = service.findByNameAndPassword(name,pwd);
		
		if(user!=null) {
			request.getRequestDispatcher("/index.jsp").forward(request,(ServletResponse) response);
		}else {
		
			//错误信息返回
			request.setAttribute(msg, "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request,(ServletResponse) response);
		}
} 
   public void doPost(HttpServletRequest request, HttpServletRequest response) throws ServletException, IOException {
  doGet(request,response); 
}
}