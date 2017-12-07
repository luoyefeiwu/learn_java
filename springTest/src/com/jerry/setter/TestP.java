package com.jerry.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP {
	@Test
	public void demo1() {
		String xmlPath = "com/jerry/setter/bean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		Person person = (Person) applicationContext.getBean("personId");
		System.out.println(person);
	}
}
