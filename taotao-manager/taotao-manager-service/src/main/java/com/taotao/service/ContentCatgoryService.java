package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

public interface ContentCatgoryService {
	
	List<EasyUITreeNode> getContentCatList(long parentId);
}
