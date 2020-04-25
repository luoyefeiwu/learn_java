package com.jerry.model;

import javax.persistence.*;

@Entity
@Table(name = "t_banquet_service_depart", schema = "banquet1125", catalog = "")
public class TBanquetServiceDepartEntity {
    private String id;
    private String serviceId;
    private String banquetId;
    private String departId;
    private String departName;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serviceId")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
    @Column(name = "departId")
    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "departName")
    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetServiceDepartEntity that = (TBanquetServiceDepartEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (serviceId != null ? !serviceId.equals(that.serviceId) : that.serviceId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (departId != null ? !departId.equals(that.departId) : that.departId != null) return false;
        if (departName != null ? !departName.equals(that.departName) : that.departName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (serviceId != null ? serviceId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (departId != null ? departId.hashCode() : 0);
        result = 31 * result + (departName != null ? departName.hashCode() : 0);
        return result;
    }
}
