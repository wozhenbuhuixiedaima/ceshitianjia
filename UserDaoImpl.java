package com.mhys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mhys.dao.UserDao;
import com.mhys.pojo.User;
import com.mhys.util.JdbcUtils;

public class UserDaoImpl implements UserDao{
   private Connection conn=null;
   private PreparedStatement pstat=null;
   private ResultSet rs=null;

	public User findByNameAndPassword(String username, String password) {
		try{
			conn=JdbcUtils.getConnection();
			String sql="select * from message where username=? and password=？";
			pstat=conn.prepareStatement(sql);
			pstat.setString(1,username);
			pstat.setString(2,password);
			rs=pstat.executeQuery();
			
			User user=null;
			while(rs.next()) {
				user=new User();
				String uname = rs.getString("username");
				String pwd = rs.getString("password");
				
				user.setUsername(username);
				user.setPassword(password);
			}	
			return user;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
