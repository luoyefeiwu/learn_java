package com.jerry.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jerry.dao.PersonDao;
import com.jerry.entity.Person;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	protected HttpServletRequest request;
	protected HttpServletResponse response;

	Person person = new Person();

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String login() {
		String result = INPUT;
		PersonDao dao = new PersonDao();
		if (dao.isPersonCanLogin(person)) {
			result = SUCCESS;
		}
		return result;
	}
	
	/*Ê×Ò³*/
	public String Index() {
		return SUCCESS;
	}
}
