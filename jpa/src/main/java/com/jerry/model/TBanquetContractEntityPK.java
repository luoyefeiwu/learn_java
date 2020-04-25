package com.jerry.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TBanquetContractEntityPK implements Serializable {
    private String banquetId;
    private int type;

    @Column(name = "banquetId")
    @Id
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Column(name = "type")
    @Id
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetContractEntityPK that = (TBanquetContractEntityPK) o;

        if (type != that.type) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = banquetId != null ? banquetId.hashCode() : 0;
        result = 31 * result + type;
        return result;
    }
}
