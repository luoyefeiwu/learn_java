package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.service.ItemParamService;

/**
 * 规格参数模板Controller
 * 
 * @author Jerry
 *
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	@Autowired
	private ItemParamService itemParamService;

	@RequestMapping("/query/itemcatid/{cid}")
	@ResponseBody
	public TaotaoResult getItemCatByCid(@PathVariable long cid) {
		TaotaoResult result = itemParamService.getItemParemByCid(cid);
		return result;
	}

	@RequestMapping("/save/{cid}")
	@ResponseBody
	public TaotaoResult insertItemParam(@PathVariable long cid, String paramData) {
		TaotaoResult result = itemParamService.insertItemParam(cid, paramData);
		return result;
	}

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getItemParamlist(Integer page, Integer rows) {
		EasyUIDataGridResult result = itemParamService.getItemParamlist(page, rows);
		return result;
	}

	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult deleteItemParam(long[] ids) {
		TaotaoResult result = itemParamService.deleteItemParam(ids);
		return result;
	}

}
