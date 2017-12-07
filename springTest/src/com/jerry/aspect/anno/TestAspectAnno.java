package com.jerry.aspect.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectAnno {

	@Test
	public void demo() {
		String xmlPath = "com/jerry/aspect/anno/bean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
