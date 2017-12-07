package com.jerry.service;

import com.jerry.domain.User;

public interface UserService {
	
	/**зЂВс
	 * @param user
	 * @throws Exception
	 */
	public void register(User user) throws Exception;
	
	/**
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
}
