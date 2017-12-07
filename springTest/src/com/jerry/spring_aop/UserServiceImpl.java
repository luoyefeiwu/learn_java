package com.jerry.spring_aop;

public class UserServiceImpl implements UserService {

	public void addUser() {
		System.out.println("com.jerry.spring_aop addUser");
	}

	public void updateUser() {
		System.out.println("com.jerry.spring_aop updateUser");
	}

	public void deleteUser() {
		System.out.println("com.jerry.spring_aop deleteUser");
	}
}
