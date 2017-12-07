package com.jerry.spring_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

	@Test
	public void demo() {
		String xmlPath = "com/jerry/spring_aop/bean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);

		

		UserService userService = (UserService) applicationContext
				.getBean("userServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
