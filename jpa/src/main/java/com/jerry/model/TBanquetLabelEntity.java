package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_label", schema = "banquet1125", catalog = "")
public class TBanquetLabelEntity {
    private String id;
    private String restaurantId;
    private String banquetId;
    private String label;
    private String labelName;
    private String labelClassId;
    private String labelClassName;
    private Integer sort;

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
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "labelName")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Basic
    @Column(name = "labelClassId")
    public String getLabelClassId() {
        return labelClassId;
    }

    public void setLabelClassId(String labelClassId) {
        this.labelClassId = labelClassId;
    }

    @Basic
    @Column(name = "labelClassName")
    public String getLabelClassName() {
        return labelClassName;
    }

    public void setLabelClassName(String labelClassName) {
        this.labelClassName = labelClassName;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetLabelEntity that = (TBanquetLabelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (labelName != null ? !labelName.equals(that.labelName) : that.labelName != null) return false;
        if (labelClassId != null ? !labelClassId.equals(that.labelClassId) : that.labelClassId != null) return false;
        if (labelClassName != null ? !labelClassName.equals(that.labelClassName) : that.labelClassName != null)
            return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (labelName != null ? labelName.hashCode() : 0);
        result = 31 * result + (labelClassId != null ? labelClassId.hashCode() : 0);
        result = 31 * result + (labelClassName != null ? labelClassName.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
