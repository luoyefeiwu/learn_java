package com.jerry.spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
	
	@Test
	public void demo()
	{
		String xmlPath="com/jerry/spel/bean.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		Customer customer=(Customer) applicationContext.getBean("customerId");
		System.out.println(customer);
	}
}
