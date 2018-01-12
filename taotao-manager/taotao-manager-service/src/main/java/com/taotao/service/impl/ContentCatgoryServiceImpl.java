package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
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
	private TbContentCategoryMapper contentCatgoryMapper;

	@Override
	public List<EasyUITreeNode> getContentCatList(long parentId) {
		// 根据 parentId查询子节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbContentCategory> list = contentCatgoryMapper.selectByExample(example);
		// 转换成 EasyUITreeNode
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			// 创建一个 EasyUItreeNode
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent() ? "closed" : "open");
			resultList.add(node);
		}
		return resultList;
	}

	@Override
	public TaotaoResult insertCatgory(Long parentId, String name) {
		// 创建一个pojo对象
		TbContentCategory contentCategory = new TbContentCategory();

		contentCategory.setName(name);
		contentCategory.setParentId(parentId);
		contentCategory.setStatus(1);
		contentCategory.setIsParent(false);
		// '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数'
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		contentCatgoryMapper.insert(contentCategory);
		// 取返回的主键
		Long id = contentCategory.getId();
		// 判断父节点的isparent属性
		// 查询父节点
		TbContentCategory parentNode = contentCatgoryMapper.selectByPrimaryKey(parentId);
		if (!parentNode.getIsParent()) {
			parentNode.setIsParent(true);
			// 更新父节点
			contentCatgoryMapper.updateByPrimaryKey(parentNode);
		}
		// 返回主键
		return TaotaoResult.ok(id);
	}
}
