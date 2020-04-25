package com.jerry.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_dishes_erp", schema = "banquet1125", catalog = "")
public class TBanquetDishesErpEntity {
    private String id;
    private String restaurantId;
    private String orderId;
    private String banquetId;
    private String setMealId;
    private String dishesId;
    private String dishesName;
    private String dishesUnitId;
    private String dishesUnitName;
    private BigDecimal dishesNum;
    private String dishesType;
    private String dishesMethodId;
    private Timestamp createTime;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "restaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Basic
    @Column(name = "setMealId")
    public String getSetMealId() {
        return setMealId;
    }

    public void setSetMealId(String setMealId) {
        this.setMealId = setMealId;
    }

    @Basic
    @Column(name = "dishesId")
    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    @Basic
    @Column(name = "dishesName")
    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    @Basic
    @Column(name = "dishesUnitId")
    public String getDishesUnitId() {
        return dishesUnitId;
    }

    public void setDishesUnitId(String dishesUnitId) {
        this.dishesUnitId = dishesUnitId;
    }

    @Basic
    @Column(name = "dishesUnitName")
    public String getDishesUnitName() {
        return dishesUnitName;
    }

    public void setDishesUnitName(String dishesUnitName) {
        this.dishesUnitName = dishesUnitName;
    }

    @Basic
    @Column(name = "dishesNum")
    public BigDecimal getDishesNum() {
        return dishesNum;
    }

    public void setDishesNum(BigDecimal dishesNum) {
        this.dishesNum = dishesNum;
    }

    @Basic
    @Column(name = "dishesType")
    public String getDishesType() {
        return dishesType;
    }

    public void setDishesType(String dishesType) {
        this.dishesType = dishesType;
    }

    @Basic
    @Column(name = "dishesMethodId")
    public String getDishesMethodId() {
        return dishesMethodId;
    }

    public void setDishesMethodId(String dishesMethodId) {
        this.dishesMethodId = dishesMethodId;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetDishesErpEntity that = (TBanquetDishesErpEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (setMealId != null ? !setMealId.equals(that.setMealId) : that.setMealId != null) return false;
        if (dishesId != null ? !dishesId.equals(that.dishesId) : that.dishesId != null) return false;
        if (dishesName != null ? !dishesName.equals(that.dishesName) : that.dishesName != null) return false;
        if (dishesUnitId != null ? !dishesUnitId.equals(that.dishesUnitId) : that.dishesUnitId != null) return false;
        if (dishesUnitName != null ? !dishesUnitName.equals(that.dishesUnitName) : that.dishesUnitName != null)
            return false;
        if (dishesNum != null ? !dishesNum.equals(that.dishesNum) : that.dishesNum != null) return false;
        if (dishesType != null ? !dishesType.equals(that.dishesType) : that.dishesType != null) return false;
        if (dishesMethodId != null ? !dishesMethodId.equals(that.dishesMethodId) : that.dishesMethodId != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (setMealId != null ? setMealId.hashCode() : 0);
        result = 31 * result + (dishesId != null ? dishesId.hashCode() : 0);
        result = 31 * result + (dishesName != null ? dishesName.hashCode() : 0);
        result = 31 * result + (dishesUnitId != null ? dishesUnitId.hashCode() : 0);
        result = 31 * result + (dishesUnitName != null ? dishesUnitName.hashCode() : 0);
        result = 31 * result + (dishesNum != null ? dishesNum.hashCode() : 0);
        result = 31 * result + (dishesType != null ? dishesType.hashCode() : 0);
        result = 31 * result + (dishesMethodId != null ? dishesMethodId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
