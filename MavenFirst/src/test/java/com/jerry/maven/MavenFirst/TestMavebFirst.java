package com.jerry.maven.MavenFirst;

import org.junit.Test;

import junit.framework.Assert;

public class TestMavebFirst {

	@Test
	public void testSayhello() {
		MavenFirst first = new MavenFirst();
		String result = first.sayHello("jerry");
		Assert.assertEquals("hello jerry", result);
	}
}
