package com.jerry.web.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import com.jerry.domain.User;
import com.jerry.service.UserService;
import com.jerry.service.impl.UserServiceImpl;

public class RegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//��ȡ������
		User user=new User();
		try {
			ConvertUtils.register(new DateLocaleConverter(), Date.class);

			BeanUtils.populate(user, req.getParameterMap());
			 //����ҵ���߼�
			UserService us=new UserServiceImpl();
			us.register(user);
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ַ�ת��
	    resp.getWriter().write("ע��ɹ���1������ת����ҳ");
	    resp.setHeader("refresh","1;url="+req.getContextPath()+"/index.jsp");
	
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
}
