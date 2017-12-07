package com.jerry.web.action;

import com.jerry.domain.User;
import com.jerry.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	//1.·âÑbÊý¾Ý
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	//2.service
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//////////////////////
	/**
	 * ×¢²á
	 * @return
	 */
	public String register(){
		userService.register(user);
		return "success";
	}
	
}
