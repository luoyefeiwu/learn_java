package com.jerry.proxy.jdk;

import org.junit.Test;

public class TestJDK {
	
	@Test
	public void demo(){
		UserService uservice= MyBeanFaction.createService();
		uservice.AddUser();
		uservice.UpdateUser();
		uservice.DeleteUser();
	}
}
