package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_messagemodel", schema = "banquet1125", catalog = "")
public class TBanquetMessagemodelEntity {
    private String id;
    private String restaurantId;
    private String restaurantName;
    private String basicsInfo;
    private String nicheInfo;
    private String intentInfo;
    private String untableInfo;
    private String depositInfo;
    private String prepareInfo;
    private String routeInfo;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer reserveType;
    private Integer routeType;

    @Id
    @Column(name = "id")
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
    @Column(name = "restaurantName")
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Basic
    @Column(name = "basicsInfo")
    public String getBasicsInfo() {
        return basicsInfo;
    }

    public void setBasicsInfo(String basicsInfo) {
        this.basicsInfo = basicsInfo;
    }

    @Basic
    @Column(name = "nicheInfo")
    public String getNicheInfo() {
        return nicheInfo;
    }

    public void setNicheInfo(String nicheInfo) {
        this.nicheInfo = nicheInfo;
    }

    @Basic
    @Column(name = "intentInfo")
    public String getIntentInfo() {
        return intentInfo;
    }

    public void setIntentInfo(String intentInfo) {
        this.intentInfo = intentInfo;
    }

    @Basic
    @Column(name = "untableInfo")
    public String getUntableInfo() {
        return untableInfo;
    }

    public void setUntableInfo(String untableInfo) {
        this.untableInfo = untableInfo;
    }

    @Basic
    @Column(name = "depositInfo")
    public String getDepositInfo() {
        return depositInfo;
    }

    public void setDepositInfo(String depositInfo) {
        this.depositInfo = depositInfo;
    }

    @Basic
    @Column(name = "prepareInfo")
    public String getPrepareInfo() {
        return prepareInfo;
    }

    public void setPrepareInfo(String prepareInfo) {
        this.prepareInfo = prepareInfo;
    }

    @Basic
    @Column(name = "routeInfo")
    public String getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(String routeInfo) {
        this.routeInfo = routeInfo;
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
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "reserveType")
    public Integer getReserveType() {
        return reserveType;
    }

    public void setReserveType(Integer reserveType) {
        this.reserveType = reserveType;
    }

    @Basic
    @Column(name = "routeType")
    public Integer getRouteType() {
        return routeType;
    }

    public void setRouteType(Integer routeType) {
        this.routeType = routeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetMessagemodelEntity that = (TBanquetMessagemodelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (restaurantName != null ? !restaurantName.equals(that.restaurantName) : that.restaurantName != null)
            return false;
        if (basicsInfo != null ? !basicsInfo.equals(that.basicsInfo) : that.basicsInfo != null) return false;
        if (nicheInfo != null ? !nicheInfo.equals(that.nicheInfo) : that.nicheInfo != null) return false;
        if (intentInfo != null ? !intentInfo.equals(that.intentInfo) : that.intentInfo != null) return false;
        if (untableInfo != null ? !untableInfo.equals(that.untableInfo) : that.untableInfo != null) return false;
        if (depositInfo != null ? !depositInfo.equals(that.depositInfo) : that.depositInfo != null) return false;
        if (prepareInfo != null ? !prepareInfo.equals(that.prepareInfo) : that.prepareInfo != null) return false;
        if (routeInfo != null ? !routeInfo.equals(that.routeInfo) : that.routeInfo != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (reserveType != null ? !reserveType.equals(that.reserveType) : that.reserveType != null) return false;
        if (routeType != null ? !routeType.equals(that.routeType) : that.routeType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (restaurantName != null ? restaurantName.hashCode() : 0);
        result = 31 * result + (basicsInfo != null ? basicsInfo.hashCode() : 0);
        result = 31 * result + (nicheInfo != null ? nicheInfo.hashCode() : 0);
        result = 31 * result + (intentInfo != null ? intentInfo.hashCode() : 0);
        result = 31 * result + (untableInfo != null ? untableInfo.hashCode() : 0);
        result = 31 * result + (depositInfo != null ? depositInfo.hashCode() : 0);
        result = 31 * result + (prepareInfo != null ? prepareInfo.hashCode() : 0);
        result = 31 * result + (routeInfo != null ? routeInfo.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (reserveType != null ? reserveType.hashCode() : 0);
        result = 31 * result + (routeType != null ? routeType.hashCode() : 0);
        return result;
    }
}
