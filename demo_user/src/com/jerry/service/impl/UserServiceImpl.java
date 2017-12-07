package com.jerry.service.impl;

import com.jerry.dao.UserDao;
import com.jerry.dao.impl.UserDaoImpl;
import com.jerry.domain.User;
import com.jerry.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public void register(User user) throws Exception {
		userDao.addUser(user);
	}

	@Override
	public User login(User user) throws Exception {
		User u = null;
		try {
			u = userDao.findUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

}
