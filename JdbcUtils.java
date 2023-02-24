package com.mhys.util;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class JdbcUtils { // 创建类Conn
	    static Connection con; // 声明Connection对象
	    public static String user;
	    public static  String password;
	    public static Connection getConnection() { // 建立返回值为Connection的方法
	        try { // 加载数据库驱动类
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("数据库驱动加载成功");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        user = "root";//数据库登录名
	        password = "135790";//密码
	        try { // 通过访问数据库的URL获取数据库连接对象
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", user, password);
	            System.out.println("数据库连接成功");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return con; // 按方法要求返回一个Connection对象
	    }
	    public static void main(String[] args) { // 主方法，测试连接
	        JdbcUtils c = new JdbcUtils(); // 创建本类对象
	        JdbcUtils.getConnection(); // 调用连接数据库的方法
	    }
	}


