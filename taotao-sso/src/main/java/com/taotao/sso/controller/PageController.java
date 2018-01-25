package com.taotao.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.pojo.TbUser;
import com.taotao.sso.service.LoginService;
import com.taotao.sso.service.RegisterService;

@Controller
@RequestMapping("/page")
public class PageController {

	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult register(TbUser user) {
		try {
			return registerService.register(user);
		} catch (Exception e) {
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult login(String username, String password, 
			HttpServletRequest request, HttpServletResponse response) {
		TaotaoResult result = loginService.login(username, password, request, response);
		return result;
	}
}
