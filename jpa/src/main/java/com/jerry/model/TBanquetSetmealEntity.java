package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_setmeal", schema = "banquet1125", catalog = "")
public class TBanquetSetmealEntity {
    private String id;
    private String banquetId;
    private String orderId;
    private String restaurantId;
    private String setmealId;
    private String setmealName;
    private Integer setmealCurPrice;
    private Integer setmealOriPrice;
    private Integer adjustDishNum;
    private int contractGuaTables;
    private int contractSpareTables;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "restaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "setmealId")
    public String getSetmealId() {
        return setmealId;
    }

    public void setSetmealId(String setmealId) {
        this.setmealId = setmealId;
    }

    @Basic
    @Column(name = "setmealName")
    public String getSetmealName() {
        return setmealName;
    }

    public void setSetmealName(String setmealName) {
        this.setmealName = setmealName;
    }

    @Basic
    @Column(name = "setmealCurPrice")
    public Integer getSetmealCurPrice() {
        return setmealCurPrice;
    }

    public void setSetmealCurPrice(Integer setmealCurPrice) {
        this.setmealCurPrice = setmealCurPrice;
    }

    @Basic
    @Column(name = "setmealOriPrice")
    public Integer getSetmealOriPrice() {
        return setmealOriPrice;
    }

    public void setSetmealOriPrice(Integer setmealOriPrice) {
        this.setmealOriPrice = setmealOriPrice;
    }

    @Basic
    @Column(name = "adjustDishNum")
    public Integer getAdjustDishNum() {
        return adjustDishNum;
    }

    public void setAdjustDishNum(Integer adjustDishNum) {
        this.adjustDishNum = adjustDishNum;
    }

    @Basic
    @Column(name = "contractGuaTables")
    public int getContractGuaTables() {
        return contractGuaTables;
    }

    public void setContractGuaTables(int contractGuaTables) {
        this.contractGuaTables = contractGuaTables;
    }

    @Basic
    @Column(name = "contractSpareTables")
    public int getContractSpareTables() {
        return contractSpareTables;
    }

    public void setContractSpareTables(int contractSpareTables) {
        this.contractSpareTables = contractSpareTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetSetmealEntity that = (TBanquetSetmealEntity) o;

        if (contractGuaTables != that.contractGuaTables) return false;
        if (contractSpareTables != that.contractSpareTables) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (setmealId != null ? !setmealId.equals(that.setmealId) : that.setmealId != null) return false;
        if (setmealName != null ? !setmealName.equals(that.setmealName) : that.setmealName != null) return false;
        if (setmealCurPrice != null ? !setmealCurPrice.equals(that.setmealCurPrice) : that.setmealCurPrice != null)
            return false;
        if (setmealOriPrice != null ? !setmealOriPrice.equals(that.setmealOriPrice) : that.setmealOriPrice != null)
            return false;
        if (adjustDishNum != null ? !adjustDishNum.equals(that.adjustDishNum) : that.adjustDishNum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (setmealId != null ? setmealId.hashCode() : 0);
        result = 31 * result + (setmealName != null ? setmealName.hashCode() : 0);
        result = 31 * result + (setmealCurPrice != null ? setmealCurPrice.hashCode() : 0);
        result = 31 * result + (setmealOriPrice != null ? setmealOriPrice.hashCode() : 0);
        result = 31 * result + (adjustDishNum != null ? adjustDishNum.hashCode() : 0);
        result = 31 * result + contractGuaTables;
        result = 31 * result + contractSpareTables;
        return result;
    }
}
