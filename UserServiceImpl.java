package com.mhys.service.impl;

import com.mhys.dao.UserDao;
import com.mhys.dao.impl.UserDaoImpl;
import com.mhys.pojo.User;
import com.mhys.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl(); 
	@Override
	public User findByNameAndPassword(String username, String password) {
		// TODO 自动生成的方法存根
		return dao.findByNameAndPassword(username, password);
	}

}
 