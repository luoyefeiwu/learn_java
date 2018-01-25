package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

public interface RegisterService {

	/**
	 * 校验数据
	 * @param param
	 * @param type
	 * @return
	 */
	public TaotaoResult checkData(String param,int type);
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public TaotaoResult register(TbUser user);
}
