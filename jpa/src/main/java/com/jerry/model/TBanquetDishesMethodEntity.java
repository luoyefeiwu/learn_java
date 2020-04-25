package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_dishes_method", schema = "banquet1125", catalog = "")
public class TBanquetDishesMethodEntity {
    private String dishesMethodId;
    private String dishUuid;
    private String dishId;
    private String banquetId;
    private String methodTypeId;
    private String methodTypeName;
    private String methodId;
    private String methodName;
    private Timestamp createDate;
    private Timestamp updateDate;

    @Id
    @Column(name = "dishesMethodID")
    public String getDishesMethodId() {
        return dishesMethodId;
    }

    public void setDishesMethodId(String dishesMethodId) {
        this.dishesMethodId = dishesMethodId;
    }

    @Basic
    @Column(name = "dishUUID")
    public String getDishUuid() {
        return dishUuid;
    }

    public void setDishUuid(String dishUuid) {
        this.dishUuid = dishUuid;
    }

    @Basic
    @Column(name = "dishID")
    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    @Basic
    @Column(name = "banquetID")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Basic
    @Column(name = "methodTypeID")
    public String getMethodTypeId() {
        return methodTypeId;
    }

    public void setMethodTypeId(String methodTypeId) {
        this.methodTypeId = methodTypeId;
    }

    @Basic
    @Column(name = "methodTypeName")
    public String getMethodTypeName() {
        return methodTypeName;
    }

    public void setMethodTypeName(String methodTypeName) {
        this.methodTypeName = methodTypeName;
    }

    @Basic
    @Column(name = "methodID")
    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    @Basic
    @Column(name = "methodName")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Basic
    @Column(name = "createDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "updateDate")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetDishesMethodEntity that = (TBanquetDishesMethodEntity) o;

        if (dishesMethodId != null ? !dishesMethodId.equals(that.dishesMethodId) : that.dishesMethodId != null)
            return false;
        if (dishUuid != null ? !dishUuid.equals(that.dishUuid) : that.dishUuid != null) return false;
        if (dishId != null ? !dishId.equals(that.dishId) : that.dishId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (methodTypeId != null ? !methodTypeId.equals(that.methodTypeId) : that.methodTypeId != null) return false;
        if (methodTypeName != null ? !methodTypeName.equals(that.methodTypeName) : that.methodTypeName != null)
            return false;
        if (methodId != null ? !methodId.equals(that.methodId) : that.methodId != null) return false;
        if (methodName != null ? !methodName.equals(that.methodName) : that.methodName != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dishesMethodId != null ? dishesMethodId.hashCode() : 0;
        result = 31 * result + (dishUuid != null ? dishUuid.hashCode() : 0);
        result = 31 * result + (dishId != null ? dishId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (methodTypeId != null ? methodTypeId.hashCode() : 0);
        result = 31 * result + (methodTypeName != null ? methodTypeName.hashCode() : 0);
        result = 31 * result + (methodId != null ? methodId.hashCode() : 0);
        result = 31 * result + (methodName != null ? methodName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }
}
