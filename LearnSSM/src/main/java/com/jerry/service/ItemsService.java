package com.jerry.service;

import java.util.List;

import com.jerry.domain.Items;

public interface ItemsService {

	List<Items> findAll();
	
	Items findByID(Integer id);
	
	void saveOrUpdate(Items items);
	
	void deleteByID(Integer id);
}
