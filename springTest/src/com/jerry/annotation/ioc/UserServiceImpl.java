package com.jerry.annotation.ioc;

import org.springframework.stereotype.Component;

@Component("userServiceId")
public class UserServiceImpl implements UserService {

	public void addUser() {
		System.out.println("g_annotation.a_ioc add user");
	}

}
