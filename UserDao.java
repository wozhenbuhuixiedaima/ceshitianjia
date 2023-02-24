package com.mhys.dao;

import com.mhys.pojo.User;

public interface UserDao {
	//获取登录信息，拿到登陆对象
		User findByNameAndPassword(String username,String password);

}
