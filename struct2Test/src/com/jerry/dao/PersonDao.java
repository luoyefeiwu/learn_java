package com.jerry.dao;

import com.jerry.entity.Person;

public class PersonDao {

	/* �����û��������룬�ж��û��Ƿ��ܵ�¼ */
	public Boolean isPersonCanLogin(Person person) {
		Boolean result = false;
		if (person.getUsername().equals("admin") && person.getPassword().equals("123")) {
			result = true;
		}
		return result;
	}
	
}
