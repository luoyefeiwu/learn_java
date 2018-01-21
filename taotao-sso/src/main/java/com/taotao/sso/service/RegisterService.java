package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;

public interface RegisterService {

	/**
	 * 校验数据
	 * @param param
	 * @param type
	 * @return
	 */
	public TaotaoResult checkData(String param,int type);
}
