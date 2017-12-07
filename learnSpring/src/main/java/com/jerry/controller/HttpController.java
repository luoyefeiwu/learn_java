package com.jerry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HttpController implements HttpRequestHandler{

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//给页面赋值
		request.setAttribute("hello","我也是测试哈哈");
		//设置 物理试图
		request.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(request, response);
	}

}
