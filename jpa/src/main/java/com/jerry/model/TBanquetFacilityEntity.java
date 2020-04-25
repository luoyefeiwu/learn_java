package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_facility", schema = "banquet1125", catalog = "")
public class TBanquetFacilityEntity {
    private String banquetFacilityId;
    private String facilityId;
    private String banquetId;
    private Integer isValid;
    private String facilityType;
    private int type;
    private String parentId;
    private String orderId;
    private String facilityName;
    private String price;
    private int number;
    private String responDepartId;
    private String responDepartName;
    private int negotPrice;
    private int negotiable;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;

    @Id
    @Column(name = "banquetFacilityId")
    public String getBanquetFacilityId() {
        return banquetFacilityId;
    }

    public void setBanquetFacilityId(String banquetFacilityId) {
        this.banquetFacilityId = banquetFacilityId;
    }

    @Basic
    @Column(name = "facilityId")
    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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
    @Column(name = "isValid")
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    @Basic
    @Column(name = "facilityType")
    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "parentId")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    @Column(name = "facilityName")
    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "responDepartId")
    public String getResponDepartId() {
        return responDepartId;
    }

    public void setResponDepartId(String responDepartId) {
        this.responDepartId = responDepartId;
    }

    @Basic
    @Column(name = "responDepartName")
    public String getResponDepartName() {
        return responDepartName;
    }

    public void setResponDepartName(String responDepartName) {
        this.responDepartName = responDepartName;
    }

    @Basic
    @Column(name = "negotPrice")
    public int getNegotPrice() {
        return negotPrice;
    }

    public void setNegotPrice(int negotPrice) {
        this.negotPrice = negotPrice;
    }

    @Basic
    @Column(name = "negotiable")
    public int getNegotiable() {
        return negotiable;
    }

    public void setNegotiable(int negotiable) {
        this.negotiable = negotiable;
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

        TBanquetFacilityEntity that = (TBanquetFacilityEntity) o;

        if (type != that.type) return false;
        if (number != that.number) return false;
        if (negotPrice != that.negotPrice) return false;
        if (negotiable != that.negotiable) return false;
        if (banquetFacilityId != null ? !banquetFacilityId.equals(that.banquetFacilityId) : that.banquetFacilityId != null)
            return false;
        if (facilityId != null ? !facilityId.equals(that.facilityId) : that.facilityId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (isValid != null ? !isValid.equals(that.isValid) : that.isValid != null) return false;
        if (facilityType != null ? !facilityType.equals(that.facilityType) : that.facilityType != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (facilityName != null ? !facilityName.equals(that.facilityName) : that.facilityName != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (responDepartId != null ? !responDepartId.equals(that.responDepartId) : that.responDepartId != null)
            return false;
        if (responDepartName != null ? !responDepartName.equals(that.responDepartName) : that.responDepartName != null)
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
        int result = banquetFacilityId != null ? banquetFacilityId.hashCode() : 0;
        result = 31 * result + (facilityId != null ? facilityId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (isValid != null ? isValid.hashCode() : 0);
        result = 31 * result + (facilityType != null ? facilityType.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (facilityName != null ? facilityName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + number;
        result = 31 * result + (responDepartId != null ? responDepartId.hashCode() : 0);
        result = 31 * result + (responDepartName != null ? responDepartName.hashCode() : 0);
        result = 31 * result + negotPrice;
        result = 31 * result + negotiable;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
