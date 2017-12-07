package com.jerry.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo1 implements Servlet {

	//Servlet生命周期的方法
	//在servlet第一次被访问时调用
	//实例化
	public ServletDemo1(){
		System.out.println("***********ServletDemo1执行了*********");
	}
	//Servlet生命周期的方法
	//在servlet第一次被访问时调用
	//初始化
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("***********init执行了*********");
		
	}
	//Servlet生命周期的方法
	//服务
	//每次访问时都会被调用
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		//System.out.println("hello servlet");
		System.out.println("***********service执行了*********");
	}
	
	//Servlet生命周期的方法
	//销毁
	public void destroy() {
		System.out.println("***********destroy执行了*********");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
