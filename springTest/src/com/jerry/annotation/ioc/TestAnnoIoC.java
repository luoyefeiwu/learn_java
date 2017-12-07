package com.jerry.annotation.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoIoC {
	@Test
	public void demo02(){
		//´ÓspringÈÝÆ÷»ñµÃ
		String xmlPath = "com/jerry/annotation/ioc/bean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
		
	}
}
