package com.codewen.service;

import org.springframework.transaction.annotation.Transactional;

import com.codewen.dao.UserDao;
import com.codewen.entity.User;

@Transactional
public class UserService {

	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
//	public void add(User user) {
//		System.out.println("service..........");
//		userDao.add(user);
//	}

	public User login(User user) {
		// TODO Auto-generated method stub
		System.out.println("service..............login");
		User auser=this.userDao.login(user);
		return auser;
	}


}
