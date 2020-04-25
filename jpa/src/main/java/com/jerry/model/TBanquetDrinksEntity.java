package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_drinks", schema = "banquet1125", catalog = "")
public class TBanquetDrinksEntity {
    private String drinksId;
    private String banquetId;
    private String dishesNum;
    private String dishesName;
    private Integer curPrice;
    private Integer oriPrice;
    private String dishesUnitId;
    private String dishesUnit;
    private String dishesId;
    private String orderId;
    private String drinksType;
    private Integer totalPrice;
    private String remark;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;

    @Id
    @Column(name = "drinksId")
    public String getDrinksId() {
        return drinksId;
    }

    public void setDrinksId(String drinksId) {
        this.drinksId = drinksId;
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
    @Column(name = "dishesNum")
    public String getDishesNum() {
        return dishesNum;
    }

    public void setDishesNum(String dishesNum) {
        this.dishesNum = dishesNum;
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
    @Column(name = "curPrice")
    public Integer getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(Integer curPrice) {
        this.curPrice = curPrice;
    }

    @Basic
    @Column(name = "oriPrice")
    public Integer getOriPrice() {
        return oriPrice;
    }

    public void setOriPrice(Integer oriPrice) {
        this.oriPrice = oriPrice;
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
    @Column(name = "dishesUnit")
    public String getDishesUnit() {
        return dishesUnit;
    }

    public void setDishesUnit(String dishesUnit) {
        this.dishesUnit = dishesUnit;
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
    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "drinksType")
    public String getDrinksType() {
        return drinksType;
    }

    public void setDrinksType(String drinksType) {
        this.drinksType = drinksType;
    }

    @Basic
    @Column(name = "totalPrice")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

        TBanquetDrinksEntity that = (TBanquetDrinksEntity) o;

        if (drinksId != null ? !drinksId.equals(that.drinksId) : that.drinksId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (dishesNum != null ? !dishesNum.equals(that.dishesNum) : that.dishesNum != null) return false;
        if (dishesName != null ? !dishesName.equals(that.dishesName) : that.dishesName != null) return false;
        if (curPrice != null ? !curPrice.equals(that.curPrice) : that.curPrice != null) return false;
        if (oriPrice != null ? !oriPrice.equals(that.oriPrice) : that.oriPrice != null) return false;
        if (dishesUnitId != null ? !dishesUnitId.equals(that.dishesUnitId) : that.dishesUnitId != null) return false;
        if (dishesUnit != null ? !dishesUnit.equals(that.dishesUnit) : that.dishesUnit != null) return false;
        if (dishesId != null ? !dishesId.equals(that.dishesId) : that.dishesId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (drinksType != null ? !drinksType.equals(that.drinksType) : that.drinksType != null) return false;
        if (totalPrice != null ? !totalPrice.equals(that.totalPrice) : that.totalPrice != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
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
        int result = drinksId != null ? drinksId.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (dishesNum != null ? dishesNum.hashCode() : 0);
        result = 31 * result + (dishesName != null ? dishesName.hashCode() : 0);
        result = 31 * result + (curPrice != null ? curPrice.hashCode() : 0);
        result = 31 * result + (oriPrice != null ? oriPrice.hashCode() : 0);
        result = 31 * result + (dishesUnitId != null ? dishesUnitId.hashCode() : 0);
        result = 31 * result + (dishesUnit != null ? dishesUnit.hashCode() : 0);
        result = 31 * result + (dishesId != null ? dishesId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (drinksType != null ? drinksType.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
