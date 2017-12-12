package com.jerry.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jerry.domain.Items;
import com.jerry.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Resource
	private ItemsService itemsService;

	// 查询所有商品
	@RequestMapping("list")
	public String list(Model model) {
		List<Items> list = itemsService.findAll();
		model.addAttribute("itemsList", list);
		return "itemsList";
	}
}