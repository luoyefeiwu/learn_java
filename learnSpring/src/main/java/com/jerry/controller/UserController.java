package com.jerry.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//接受请求，接受参数，验证参数，处理请求
		//分装参数，调用业务方法，处理结果数据
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("hello", "我是测试数据，哈哈");
		//设置物理试图
		//mv.setViewName("/WEB-INF/jsps/index.jsp");
		
		//设置逻辑试图
		mv.setViewName("index");
		return mv;
	}

}
