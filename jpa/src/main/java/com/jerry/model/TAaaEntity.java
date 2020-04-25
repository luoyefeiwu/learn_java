package com.jerry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_aaa", schema = "banquet1125", catalog = "")
public class TAaaEntity {
    private String banquetId;

    @Id
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAaaEntity that = (TAaaEntity) o;

        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return banquetId != null ? banquetId.hashCode() : 0;
    }
}
