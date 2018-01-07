package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.pojo.TbItemParamExample.Criteria;
import com.taotao.service.ItemParamService;

@Service
public class ItemParamServiceImpl implements ItemParamService {

	@Autowired
	private TbItemParamMapper itemParamMapper;

	@Override
	public TaotaoResult getItemParemByCid(long cid) {
		// 创建查询条件
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		if (null != list && !list.isEmpty()) {
			return TaotaoResult.ok(list.get(0));
		}
		return TaotaoResult.build(400, "此分类未定义规格模板");
	}

	@Override
	public TaotaoResult insertItemParam(long cid, String paramData) {
		TbItemParam itemParam = new TbItemParam();
		itemParam.setItemCatId(cid);
		itemParam.setParamData(paramData);
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		itemParamMapper.insert(itemParam);
		return TaotaoResult.ok();
	}

	@Override
	public EasyUIDataGridResult getItemParamlist(int page,int rows) {
		//分页处理
		PageHelper.startPage(page, rows);
		//执行查询
		TbItemParamExample example=new TbItemParamExample();
		List<TbItemParam> list=itemParamMapper.selectByExampleWithBLOBs(example);
		//取分页信息
		PageInfo<TbItemParam> pageInfo=new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult(pageInfo.getTotal(), list);
		return result;
	}

	@Override
	public TaotaoResult deleteItemParam(long[] ids) {
		for (long item : ids) {
			itemParamMapper.deleteByPrimaryKey(item);
		}
		return TaotaoResult.ok();
	}
}
