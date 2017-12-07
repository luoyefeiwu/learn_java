package com.jerry.dao;

import com.jerry.domain.User;

public interface UserDao
{
	/*
	 * ����û���Ϣ
	 * 
	 * @param user
	 * 
	 * @throw Exeption
	 */
	public void addUser(User user) throws Exception;

	public User findUser(User user) throws Exception;

	public boolean findUserByName(String name);
}
