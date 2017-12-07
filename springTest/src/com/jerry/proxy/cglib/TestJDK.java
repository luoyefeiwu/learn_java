package com.jerry.proxy.cglib;

import org.junit.Test;

public class TestJDK {
	
	@Test
	public void demo(){
		UserServiceImpl uservice= MyBeanFactory.createService();
		uservice.AddUser();
		uservice.UpdateUser();
		uservice.DeleteUser();
	}
}
