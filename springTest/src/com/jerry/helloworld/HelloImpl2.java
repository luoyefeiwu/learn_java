package com.jerry.helloworld;

public class HelloImpl2 implements HelloApi {

	private String message;

	public HelloImpl2(String message) {
		this.message = message;
	}

	public HelloImpl2() {
		this.message = "Hello World!";
	}

	public void sayHello() {
		System.out.println(message);
	}

}
