package com.jerry.aspect.anno;

import org.springframework.stereotype.Service;

@Service("userServiceId")
public class UserServiceImpl implements UserService {

	public void addUser() {
		System.out.println("com.jerry.aspect.anno addUser");
	}

	public String updateUser() {
		System.out.println("com.jerry.aspect.anno updateUser");
		return "≤‚ ‘";
	}

	public void deleteUser() {
		System.out.println("com.jerry.aspect.anno deleteUser");

	}

}
