package com.jerry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("hello")
	public String myHello(){
		return "hello";
	}
}
