package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;

public interface TokenService {

	/**
	 * 通过Token 得到用户信息
	 * @param token
	 * @return
	 */
	public TaotaoResult getUserByToken(String token);
	
	public TaotaoResult deleteUserToken(String token);
}
