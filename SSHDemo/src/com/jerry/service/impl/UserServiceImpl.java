package com.jerry.service.impl;
import com.jerry.dao.UserDao;
import com.jerry.domain.User;
import com.jerry.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void register(User user) {
		userDao.save(user);
	}
}
