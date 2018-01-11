package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;
import com.taotao.service.ContentCatgoryService;

/**
 * 内容分类管理
 * 
 * @author Jerry
 *
 */
@Service
public class ContentCatgoryServiceImpl implements ContentCatgoryService {
	@Autowired
	private TbContentCategoryMapper ContentCatgoryMapper;

	@Override
	public List<EasyUITreeNode> getContentCatList(long parentId) {
		// 根据 parentId查询子节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbContentCategory> list=ContentCatgoryMapper.selectByExample(example);
		//转换成  EasyUITreeNode
		List<EasyUITreeNode> resultList=new ArrayList<>();
		for(TbContentCategory tbContentCategory:list)
		{
			//创建一个 EasyUItreeNode
			EasyUITreeNode node=new EasyUITreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
	}

}
