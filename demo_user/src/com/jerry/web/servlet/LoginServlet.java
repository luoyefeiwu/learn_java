package com.jerry.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.jerry.domain.User;
import com.jerry.service.UserService;
import com.jerry.service.impl.UserServiceImpl;
import com.jerry.utils.DBUtils;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		User user = new User();
		
		try {
			BeanUtils.populate(user, req.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		UserService us = new UserServiceImpl();
		User u;
		try {
			u = us.login(user);
		
			//分发转向
			if(u!=null){
				req.getSession().setAttribute("u", user);//如果登录成功，就把user对象放到session对象 中
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}else{
				
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
