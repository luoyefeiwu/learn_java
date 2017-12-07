package com.jerry.dao;

import com.jerry.entity.Person;

public class PersonDao {

	/* 根据用户名和密码，判断用户是否能登录 */
	public Boolean isPersonCanLogin(Person person) {
		Boolean result = false;
		if (person.getUsername().equals("admin") && person.getPassword().equals("123")) {
			result = true;
		}
		return result;
	}
	
}
