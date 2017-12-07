package com.jerry.setter;

public class Person {
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(Address companyAddr) {
		this.companyAddr = companyAddr;
	}

	private Integer age;
	private Address homeAddr;
	private Address companyAddr;
}
