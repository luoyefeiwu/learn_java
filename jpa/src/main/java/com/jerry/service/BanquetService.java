package com.jerry.service;

import com.jerry.model.TBanquet;

import java.util.List;

public interface BanquetService {
    List<TBanquet> listBanquetByRestaurantId(String restaurantId);

    TBanquet findOne(String banquetId);
}
