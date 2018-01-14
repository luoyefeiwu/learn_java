package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;

public interface ContentCatgoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);

	public TaotaoResult insertCatgory(Long parentId, String name);
	
	public TaotaoResult updateCatgory(Long id,String name);
	
	public TaotaoResult deleteCatgory(Long parentid,Long id);
}
