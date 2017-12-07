package com.jerry.aspect.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectXml {
	@Test
	public void Demo() {
		String xmlPath = "com/jerry/aspect/xml/bean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}

}
