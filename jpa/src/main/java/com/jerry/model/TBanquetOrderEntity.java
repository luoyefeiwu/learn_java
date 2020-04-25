package com.jerry.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_order", schema = "banquet1125", catalog = "")
public class TBanquetOrderEntity {
    private String orderId;
    private String banquetId;
    private Date eatDate;
    private String arriveTime;
    private int segmentType;
    private Timestamp openDeskTime;
    private Integer peopleNumTotal;
    private String deskRemark;
    private String drinkRemark;
    private String setmalRemark;
    private String remark;
    private String facilityRemark;
    private Integer peopleNum;
    private String priceServiceType;
    private Integer intentPlanTables;
    private BigDecimal preferential;
    private Integer preferentialType;
    private Integer contractSpareTables;
    private Integer contractGuaTables;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;
    private String baseFacilityRemark;

    @Id
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
    @Column(name = "eatDate")
    public Date getEatDate() {
        return eatDate;
    }

    public void setEatDate(Date eatDate) {
        this.eatDate = eatDate;
    }

    @Basic
    @Column(name = "arriveTime")
    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Basic
    @Column(name = "segmentType")
    public int getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(int segmentType) {
        this.segmentType = segmentType;
    }

    @Basic
    @Column(name = "openDeskTime")
    public Timestamp getOpenDeskTime() {
        return openDeskTime;
    }

    public void setOpenDeskTime(Timestamp openDeskTime) {
        this.openDeskTime = openDeskTime;
    }

    @Basic
    @Column(name = "peopleNumTotal")
    public Integer getPeopleNumTotal() {
        return peopleNumTotal;
    }

    public void setPeopleNumTotal(Integer peopleNumTotal) {
        this.peopleNumTotal = peopleNumTotal;
    }

    @Basic
    @Column(name = "deskRemark")
    public String getDeskRemark() {
        return deskRemark;
    }

    public void setDeskRemark(String deskRemark) {
        this.deskRemark = deskRemark;
    }

    @Basic
    @Column(name = "drinkRemark")
    public String getDrinkRemark() {
        return drinkRemark;
    }

    public void setDrinkRemark(String drinkRemark) {
        this.drinkRemark = drinkRemark;
    }

    @Basic
    @Column(name = "setmalRemark")
    public String getSetmalRemark() {
        return setmalRemark;
    }

    public void setSetmalRemark(String setmalRemark) {
        this.setmalRemark = setmalRemark;
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
    @Column(name = "facilityRemark")
    public String getFacilityRemark() {
        return facilityRemark;
    }

    public void setFacilityRemark(String facilityRemark) {
        this.facilityRemark = facilityRemark;
    }

    @Basic
    @Column(name = "peopleNum")
    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    @Basic
    @Column(name = "priceServiceType")
    public String getPriceServiceType() {
        return priceServiceType;
    }

    public void setPriceServiceType(String priceServiceType) {
        this.priceServiceType = priceServiceType;
    }

    @Basic
    @Column(name = "intentPlanTables")
    public Integer getIntentPlanTables() {
        return intentPlanTables;
    }

    public void setIntentPlanTables(Integer intentPlanTables) {
        this.intentPlanTables = intentPlanTables;
    }

    @Basic
    @Column(name = "preferential")
    public BigDecimal getPreferential() {
        return preferential;
    }

    public void setPreferential(BigDecimal preferential) {
        this.preferential = preferential;
    }

    @Basic
    @Column(name = "preferentialType")
    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    @Basic
    @Column(name = "contractSpareTables")
    public Integer getContractSpareTables() {
        return contractSpareTables;
    }

    public void setContractSpareTables(Integer contractSpareTables) {
        this.contractSpareTables = contractSpareTables;
    }

    @Basic
    @Column(name = "contractGuaTables")
    public Integer getContractGuaTables() {
        return contractGuaTables;
    }

    public void setContractGuaTables(Integer contractGuaTables) {
        this.contractGuaTables = contractGuaTables;
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

    @Basic
    @Column(name = "baseFacilityRemark")
    public String getBaseFacilityRemark() {
        return baseFacilityRemark;
    }

    public void setBaseFacilityRemark(String baseFacilityRemark) {
        this.baseFacilityRemark = baseFacilityRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetOrderEntity that = (TBanquetOrderEntity) o;

        if (segmentType != that.segmentType) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (eatDate != null ? !eatDate.equals(that.eatDate) : that.eatDate != null) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;
        if (openDeskTime != null ? !openDeskTime.equals(that.openDeskTime) : that.openDeskTime != null) return false;
        if (peopleNumTotal != null ? !peopleNumTotal.equals(that.peopleNumTotal) : that.peopleNumTotal != null)
            return false;
        if (deskRemark != null ? !deskRemark.equals(that.deskRemark) : that.deskRemark != null) return false;
        if (drinkRemark != null ? !drinkRemark.equals(that.drinkRemark) : that.drinkRemark != null) return false;
        if (setmalRemark != null ? !setmalRemark.equals(that.setmalRemark) : that.setmalRemark != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (facilityRemark != null ? !facilityRemark.equals(that.facilityRemark) : that.facilityRemark != null)
            return false;
        if (peopleNum != null ? !peopleNum.equals(that.peopleNum) : that.peopleNum != null) return false;
        if (priceServiceType != null ? !priceServiceType.equals(that.priceServiceType) : that.priceServiceType != null)
            return false;
        if (intentPlanTables != null ? !intentPlanTables.equals(that.intentPlanTables) : that.intentPlanTables != null)
            return false;
        if (preferential != null ? !preferential.equals(that.preferential) : that.preferential != null) return false;
        if (preferentialType != null ? !preferentialType.equals(that.preferentialType) : that.preferentialType != null)
            return false;
        if (contractSpareTables != null ? !contractSpareTables.equals(that.contractSpareTables) : that.contractSpareTables != null)
            return false;
        if (contractGuaTables != null ? !contractGuaTables.equals(that.contractGuaTables) : that.contractGuaTables != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (baseFacilityRemark != null ? !baseFacilityRemark.equals(that.baseFacilityRemark) : that.baseFacilityRemark != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (eatDate != null ? eatDate.hashCode() : 0);
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        result = 31 * result + segmentType;
        result = 31 * result + (openDeskTime != null ? openDeskTime.hashCode() : 0);
        result = 31 * result + (peopleNumTotal != null ? peopleNumTotal.hashCode() : 0);
        result = 31 * result + (deskRemark != null ? deskRemark.hashCode() : 0);
        result = 31 * result + (drinkRemark != null ? drinkRemark.hashCode() : 0);
        result = 31 * result + (setmalRemark != null ? setmalRemark.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (facilityRemark != null ? facilityRemark.hashCode() : 0);
        result = 31 * result + (peopleNum != null ? peopleNum.hashCode() : 0);
        result = 31 * result + (priceServiceType != null ? priceServiceType.hashCode() : 0);
        result = 31 * result + (intentPlanTables != null ? intentPlanTables.hashCode() : 0);
        result = 31 * result + (preferential != null ? preferential.hashCode() : 0);
        result = 31 * result + (preferentialType != null ? preferentialType.hashCode() : 0);
        result = 31 * result + (contractSpareTables != null ? contractSpareTables.hashCode() : 0);
        result = 31 * result + (contractGuaTables != null ? contractGuaTables.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (baseFacilityRemark != null ? baseFacilityRemark.hashCode() : 0);
        return result;
    }
}
