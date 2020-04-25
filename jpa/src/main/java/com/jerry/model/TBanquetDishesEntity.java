package com.jerry.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_dishes", schema = "banquet1125", catalog = "")
public class TBanquetDishesEntity {
    private String dishesId;
    private String restaurantId;
    private String banquetId;
    private String orderId;
    private String mealDishesId;
    private String newDishesId;
    private String dishesName;
    private String dishesUnit;
    private BigDecimal dishesNum;
    private String specificationName;
    private String specificationId;
    private String oriDishesId;
    private String oriDishesName;
    private String oriDishesUnit;
    private Integer oriDishesNum;
    private String oriSpecificationName;
    private String oriSpecificationId;
    private String dishesType;
    private String dishesUuid;
    private String dishesNewUuid;
    private Integer isDeleted;
    private int isAdjust;
    private String setMealId;
    private String banquetSetmealId;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;

    @Id
    @Column(name = "dishesId")
    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
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
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
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
    @Column(name = "mealDishesId")
    public String getMealDishesId() {
        return mealDishesId;
    }

    public void setMealDishesId(String mealDishesId) {
        this.mealDishesId = mealDishesId;
    }

    @Basic
    @Column(name = "newDishesId")
    public String getNewDishesId() {
        return newDishesId;
    }

    public void setNewDishesId(String newDishesId) {
        this.newDishesId = newDishesId;
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
    @Column(name = "dishesUnit")
    public String getDishesUnit() {
        return dishesUnit;
    }

    public void setDishesUnit(String dishesUnit) {
        this.dishesUnit = dishesUnit;
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
    @Column(name = "specificationName")
    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }

    @Basic
    @Column(name = "specificationId")
    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    @Basic
    @Column(name = "oriDishesId")
    public String getOriDishesId() {
        return oriDishesId;
    }

    public void setOriDishesId(String oriDishesId) {
        this.oriDishesId = oriDishesId;
    }

    @Basic
    @Column(name = "oriDishesName")
    public String getOriDishesName() {
        return oriDishesName;
    }

    public void setOriDishesName(String oriDishesName) {
        this.oriDishesName = oriDishesName;
    }

    @Basic
    @Column(name = "oriDishesUnit")
    public String getOriDishesUnit() {
        return oriDishesUnit;
    }

    public void setOriDishesUnit(String oriDishesUnit) {
        this.oriDishesUnit = oriDishesUnit;
    }

    @Basic
    @Column(name = "oriDishesNum")
    public Integer getOriDishesNum() {
        return oriDishesNum;
    }

    public void setOriDishesNum(Integer oriDishesNum) {
        this.oriDishesNum = oriDishesNum;
    }

    @Basic
    @Column(name = "oriSpecificationName")
    public String getOriSpecificationName() {
        return oriSpecificationName;
    }

    public void setOriSpecificationName(String oriSpecificationName) {
        this.oriSpecificationName = oriSpecificationName;
    }

    @Basic
    @Column(name = "oriSpecificationId")
    public String getOriSpecificationId() {
        return oriSpecificationId;
    }

    public void setOriSpecificationId(String oriSpecificationId) {
        this.oriSpecificationId = oriSpecificationId;
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
    @Column(name = "dishesUUID")
    public String getDishesUuid() {
        return dishesUuid;
    }

    public void setDishesUuid(String dishesUuid) {
        this.dishesUuid = dishesUuid;
    }

    @Basic
    @Column(name = "dishesNewUUID")
    public String getDishesNewUuid() {
        return dishesNewUuid;
    }

    public void setDishesNewUuid(String dishesNewUuid) {
        this.dishesNewUuid = dishesNewUuid;
    }

    @Basic
    @Column(name = "isDeleted")
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "isAdjust")
    public int getIsAdjust() {
        return isAdjust;
    }

    public void setIsAdjust(int isAdjust) {
        this.isAdjust = isAdjust;
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
    @Column(name = "banquetSetmealId")
    public String getBanquetSetmealId() {
        return banquetSetmealId;
    }

    public void setBanquetSetmealId(String banquetSetmealId) {
        this.banquetSetmealId = banquetSetmealId;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "createUserId")
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "createUser")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "updateUserId")
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "updateUser")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetDishesEntity that = (TBanquetDishesEntity) o;

        if (isAdjust != that.isAdjust) return false;
        if (dishesId != null ? !dishesId.equals(that.dishesId) : that.dishesId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (mealDishesId != null ? !mealDishesId.equals(that.mealDishesId) : that.mealDishesId != null) return false;
        if (newDishesId != null ? !newDishesId.equals(that.newDishesId) : that.newDishesId != null) return false;
        if (dishesName != null ? !dishesName.equals(that.dishesName) : that.dishesName != null) return false;
        if (dishesUnit != null ? !dishesUnit.equals(that.dishesUnit) : that.dishesUnit != null) return false;
        if (dishesNum != null ? !dishesNum.equals(that.dishesNum) : that.dishesNum != null) return false;
        if (specificationName != null ? !specificationName.equals(that.specificationName) : that.specificationName != null)
            return false;
        if (specificationId != null ? !specificationId.equals(that.specificationId) : that.specificationId != null)
            return false;
        if (oriDishesId != null ? !oriDishesId.equals(that.oriDishesId) : that.oriDishesId != null) return false;
        if (oriDishesName != null ? !oriDishesName.equals(that.oriDishesName) : that.oriDishesName != null)
            return false;
        if (oriDishesUnit != null ? !oriDishesUnit.equals(that.oriDishesUnit) : that.oriDishesUnit != null)
            return false;
        if (oriDishesNum != null ? !oriDishesNum.equals(that.oriDishesNum) : that.oriDishesNum != null) return false;
        if (oriSpecificationName != null ? !oriSpecificationName.equals(that.oriSpecificationName) : that.oriSpecificationName != null)
            return false;
        if (oriSpecificationId != null ? !oriSpecificationId.equals(that.oriSpecificationId) : that.oriSpecificationId != null)
            return false;
        if (dishesType != null ? !dishesType.equals(that.dishesType) : that.dishesType != null) return false;
        if (dishesUuid != null ? !dishesUuid.equals(that.dishesUuid) : that.dishesUuid != null) return false;
        if (dishesNewUuid != null ? !dishesNewUuid.equals(that.dishesNewUuid) : that.dishesNewUuid != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (setMealId != null ? !setMealId.equals(that.setMealId) : that.setMealId != null) return false;
        if (banquetSetmealId != null ? !banquetSetmealId.equals(that.banquetSetmealId) : that.banquetSetmealId != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dishesId != null ? dishesId.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (mealDishesId != null ? mealDishesId.hashCode() : 0);
        result = 31 * result + (newDishesId != null ? newDishesId.hashCode() : 0);
        result = 31 * result + (dishesName != null ? dishesName.hashCode() : 0);
        result = 31 * result + (dishesUnit != null ? dishesUnit.hashCode() : 0);
        result = 31 * result + (dishesNum != null ? dishesNum.hashCode() : 0);
        result = 31 * result + (specificationName != null ? specificationName.hashCode() : 0);
        result = 31 * result + (specificationId != null ? specificationId.hashCode() : 0);
        result = 31 * result + (oriDishesId != null ? oriDishesId.hashCode() : 0);
        result = 31 * result + (oriDishesName != null ? oriDishesName.hashCode() : 0);
        result = 31 * result + (oriDishesUnit != null ? oriDishesUnit.hashCode() : 0);
        result = 31 * result + (oriDishesNum != null ? oriDishesNum.hashCode() : 0);
        result = 31 * result + (oriSpecificationName != null ? oriSpecificationName.hashCode() : 0);
        result = 31 * result + (oriSpecificationId != null ? oriSpecificationId.hashCode() : 0);
        result = 31 * result + (dishesType != null ? dishesType.hashCode() : 0);
        result = 31 * result + (dishesUuid != null ? dishesUuid.hashCode() : 0);
        result = 31 * result + (dishesNewUuid != null ? dishesNewUuid.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + isAdjust;
        result = 31 * result + (setMealId != null ? setMealId.hashCode() : 0);
        result = 31 * result + (banquetSetmealId != null ? banquetSetmealId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
