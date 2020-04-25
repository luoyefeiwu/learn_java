package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_order_field", schema = "banquet1125", catalog = "")
public class TBanquetOrderFieldEntity {
    private String fieldId;
    private Integer orderStage;
    private String fieldKey;
    private String fieldName;
    private Integer fieldType;
    private String tableName;
    private String tableSelectKey;
    private String tableSelectValue;
    private Integer isValid;
    private Integer orderPostion;

    @Id
    @Column(name = "fieldId")
    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "orderStage")
    public Integer getOrderStage() {
        return orderStage;
    }

    public void setOrderStage(Integer orderStage) {
        this.orderStage = orderStage;
    }

    @Basic
    @Column(name = "fieldKey")
    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    @Basic
    @Column(name = "fieldName")
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "fieldType")
    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    @Basic
    @Column(name = "tableName")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "tableSelectKey")
    public String getTableSelectKey() {
        return tableSelectKey;
    }

    public void setTableSelectKey(String tableSelectKey) {
        this.tableSelectKey = tableSelectKey;
    }

    @Basic
    @Column(name = "tableSelectValue")
    public String getTableSelectValue() {
        return tableSelectValue;
    }

    public void setTableSelectValue(String tableSelectValue) {
        this.tableSelectValue = tableSelectValue;
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
    @Column(name = "orderPostion")
    public Integer getOrderPostion() {
        return orderPostion;
    }

    public void setOrderPostion(Integer orderPostion) {
        this.orderPostion = orderPostion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetOrderFieldEntity that = (TBanquetOrderFieldEntity) o;

        if (fieldId != null ? !fieldId.equals(that.fieldId) : that.fieldId != null) return false;
        if (orderStage != null ? !orderStage.equals(that.orderStage) : that.orderStage != null) return false;
        if (fieldKey != null ? !fieldKey.equals(that.fieldKey) : that.fieldKey != null) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (fieldType != null ? !fieldType.equals(that.fieldType) : that.fieldType != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableSelectKey != null ? !tableSelectKey.equals(that.tableSelectKey) : that.tableSelectKey != null)
            return false;
        if (tableSelectValue != null ? !tableSelectValue.equals(that.tableSelectValue) : that.tableSelectValue != null)
            return false;
        if (isValid != null ? !isValid.equals(that.isValid) : that.isValid != null) return false;
        if (orderPostion != null ? !orderPostion.equals(that.orderPostion) : that.orderPostion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fieldId != null ? fieldId.hashCode() : 0;
        result = 31 * result + (orderStage != null ? orderStage.hashCode() : 0);
        result = 31 * result + (fieldKey != null ? fieldKey.hashCode() : 0);
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (fieldType != null ? fieldType.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (tableSelectKey != null ? tableSelectKey.hashCode() : 0);
        result = 31 * result + (tableSelectValue != null ? tableSelectValue.hashCode() : 0);
        result = 31 * result + (isValid != null ? isValid.hashCode() : 0);
        result = 31 * result + (orderPostion != null ? orderPostion.hashCode() : 0);
        return result;
    }
}
