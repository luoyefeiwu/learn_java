package com.jerry.helloworld;

public class HelloImpl3 implements HelloApi {

	private String message;
	private int index;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void sayHello() {
		System.out.println(index+message);
	}

}
