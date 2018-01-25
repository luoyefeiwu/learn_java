package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

public interface LoginService {
	
	/**
	 * 通过token获得用户信息
	 * @param token
	 * @return
	 */
	TbUser getUserByToken(String token);
}
