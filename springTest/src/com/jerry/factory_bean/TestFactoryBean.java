package com.jerry.factory_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	@Test
	public void demo1(){
		String xmlPath="com/jerry/factory_bean/bean.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		
		//��ô���
		UesrService userService=(UesrService) applicationContext.getBean("proxyServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
