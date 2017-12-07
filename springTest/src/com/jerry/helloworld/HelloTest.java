package com.jerry.helloworld;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	 @Test  
     public void testHelloWorld() {  
           //1、读取配置文件实例化一个IoC容器  
           ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");  
           //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”  
            HelloApi helloApi = context.getBean("hello", HelloApi.class);  
            //3、执行业务逻辑  
            helloApi.sayHello();  
     }  

	 @Test
	 public void test1()
	 {
		 ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");  
		HelloApi helloApi= context.getBean(HelloApi.class);
		helloApi.sayHello();
	 }
	 @Test
	 public void test2()
	 {
		 BeanFactory context = new ClassPathXmlApplicationContext("helloworld.xml");  
		HelloApi helloApi= context.getBean(HelloApi.class);
		helloApi.sayHello();
	 }
	 @Test
	 public void test3()
	 {
		BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");  
		 //根据 name 获取Bean
		HelloApi bean=(HelloApi)context.getBean("bean");
		bean.sayHello();
	 }
	 @Test
	 public void test4()
	 {
		 BeanFactory banFactory=new ClassPathXmlApplicationContext("bean2.xml");
		HelloApi bean= banFactory.getBean(HelloApi.class);
		bean.sayHello();
	 }
	 @Test
	 public void test5()
	 {
		 BeanFactory banFactory=new ClassPathXmlApplicationContext("bean3.xml");
		HelloApi bean= banFactory.getBean(HelloApi.class);
		bean.sayHello();
	 }
}
