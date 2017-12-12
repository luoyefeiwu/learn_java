package com.jerry.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jerry.dao.ItemsMapper;
import com.jerry.domain.Items;
import com.jerry.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Resource
	private ItemsMapper itemsMapper;

	public List<Items> findAll() {
		return itemsMapper.findAll();
	}

	public Items findByID(Integer id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	public void saveOrUpdate(Items items) {
		itemsMapper.updateByPrimaryKey(items);
	}

	public void deleteByID(Integer id) {
		itemsMapper.deleteByPrimaryKey(id);
	}

}
