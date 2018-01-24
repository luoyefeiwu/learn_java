package com.taotao.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpRequest;
import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.sso.service.LoginService;
import com.taotao.sso.service.RegisterService;
import com.taotao.sso.service.TokenService;

@Controller
@RequestMapping("/user")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	@Autowired
	private LoginService loginService;

	@Autowired
	private TokenService tokenService;

	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {
		TaotaoResult result = registerService.checkData(param, type);
		if (StringUtils.isNotBlank(callback)) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
		return result;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult login(String username, String password, HttpServletResponse response,
			HttpServletRequest request) {
		try {
			TaotaoResult result = loginService.login(username, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {

		try {
			TaotaoResult result = tokenService.getUserByToken(token);
			if (StringUtils.isNotBlank(callback)) {
				MappingJacksonValue jacksonValue = new MappingJacksonValue(result);
				jacksonValue.setJsonpFunction(callback);
				return jacksonValue;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/token/logout/{token}")
	@ResponseBody
	public Object logout(@PathVariable String token, String callback) {

		try {
			TaotaoResult result = tokenService.deleteUserToken(token);
			if (StringUtils.isNotBlank(callback)) {
				MappingJacksonValue jacksonValue = new MappingJacksonValue(result);
				jacksonValue.setJsonpFunction(callback);
				return jacksonValue;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
