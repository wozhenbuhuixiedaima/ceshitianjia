package com.mhys.service;

import com.mhys.pojo.User;

public interface UserService {
	//获取登录信息，拿到登陆对象
	User findByNameAndPassword(String username,String password);

}
