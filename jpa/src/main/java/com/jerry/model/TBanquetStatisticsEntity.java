package com.jerry.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "t_banquet_statistics", schema = "banquet1125", catalog = "")
public class TBanquetStatisticsEntity {
    private String banquetId;
    private String hallId;
    private String hallName;
    private String guestName;
    private String guestPelephone;
    private String guestStatus;
    private Date eatDate;
    private String arriveTime;
    private int segmentType;

    @Id
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Basic
    @Column(name = "hallId")
    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "hallName")
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @Basic
    @Column(name = "guestName")
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Basic
    @Column(name = "guestPelephone")
    public String getGuestPelephone() {
        return guestPelephone;
    }

    public void setGuestPelephone(String guestPelephone) {
        this.guestPelephone = guestPelephone;
    }

    @Basic
    @Column(name = "guestStatus")
    public String getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(String guestStatus) {
        this.guestStatus = guestStatus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetStatisticsEntity that = (TBanquetStatisticsEntity) o;

        if (segmentType != that.segmentType) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (hallId != null ? !hallId.equals(that.hallId) : that.hallId != null) return false;
        if (hallName != null ? !hallName.equals(that.hallName) : that.hallName != null) return false;
        if (guestName != null ? !guestName.equals(that.guestName) : that.guestName != null) return false;
        if (guestPelephone != null ? !guestPelephone.equals(that.guestPelephone) : that.guestPelephone != null)
            return false;
        if (guestStatus != null ? !guestStatus.equals(that.guestStatus) : that.guestStatus != null) return false;
        if (eatDate != null ? !eatDate.equals(that.eatDate) : that.eatDate != null) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = banquetId != null ? banquetId.hashCode() : 0;
        result = 31 * result + (hallId != null ? hallId.hashCode() : 0);
        result = 31 * result + (hallName != null ? hallName.hashCode() : 0);
        result = 31 * result + (guestName != null ? guestName.hashCode() : 0);
        result = 31 * result + (guestPelephone != null ? guestPelephone.hashCode() : 0);
        result = 31 * result + (guestStatus != null ? guestStatus.hashCode() : 0);
        result = 31 * result + (eatDate != null ? eatDate.hashCode() : 0);
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        result = 31 * result + segmentType;
        return result;
    }
}
