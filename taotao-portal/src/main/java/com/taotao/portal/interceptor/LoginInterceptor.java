package com.taotao.portal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.taotao.pojo.TbUser;
import com.taotao.portal.service.UserService;

/**
 * 用户登陆拦截器
 * 
 * @author Jerry
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private UserService userService;
	@Value("${SSO_LOGIN_URL}")
	private String SSO_LOGIN_URL;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		TbUser user = userService.getUserByToken(request, response);
		//session过期
		if(user==null) {
			response.sendRedirect(SSO_LOGIN_URL);
			return false;
		}
		//没有过期，放行
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}