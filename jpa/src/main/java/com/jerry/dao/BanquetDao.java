package com.jerry.dao;

import com.jerry.model.TBanquet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BanquetDao extends JpaRepository<TBanquet, String> {
    @Query(value = "select * from t_banquet  where restaurantId=?1",nativeQuery=true)
    List<TBanquet> findByReayaurantId(String restaurantId);
}
