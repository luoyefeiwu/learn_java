package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;

public interface ItemParamService {

	TaotaoResult getItemParemByCid(long cid);

	TaotaoResult insertItemParam(long cid, String paramData);

	EasyUIDataGridResult getItemParamlist(int page,int rows);
	
	TaotaoResult deleteItemParam(long[] id);
}
