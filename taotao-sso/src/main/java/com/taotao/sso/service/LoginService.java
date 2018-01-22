package com.taotao.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotao.common.pojo.TaotaoResult;

public interface LoginService {

	/**登陆
	 * @param username 用户名
	 * @param password 密码
	 * @param request 
	 * @param response
	 * @return
	 */
	public TaotaoResult login(String username,String password,HttpServletRequest request,HttpServletResponse response);

}
