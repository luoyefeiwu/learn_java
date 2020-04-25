package com.jerry.service.impl;

import com.jerry.dao.BanquetDao;
import com.jerry.model.TBanquet;
import com.jerry.service.BanquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanquetServiceImpl implements BanquetService {

    @Autowired
    BanquetDao banquetDao;

    @Override
    public List<TBanquet> listBanquetByRestaurantId(String restaurantId) {
        return banquetDao.findByReayaurantId(restaurantId);
    }

    @Override
    public TBanquet findOne(String banquetId) {
        return banquetDao.findAll().get(0);
    }
}
