package com.jerry.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_deposit_report", schema = "banquet1125", catalog = "")
public class TDepositReportEntity {
    private String reportId;
    private String restaurantId;
    private Date reportDay;
    private Integer amountIn;
    private Integer amountOut;
    private Integer amountLeft;
    private Timestamp createTime;

    @Id
    @Column(name = "reportId")
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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
    @Column(name = "reportDay")
    public Date getReportDay() {
        return reportDay;
    }

    public void setReportDay(Date reportDay) {
        this.reportDay = reportDay;
    }

    @Basic
    @Column(name = "amountIn")
    public Integer getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(Integer amountIn) {
        this.amountIn = amountIn;
    }

    @Basic
    @Column(name = "amountOut")
    public Integer getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(Integer amountOut) {
        this.amountOut = amountOut;
    }

    @Basic
    @Column(name = "amountLeft")
    public Integer getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(Integer amountLeft) {
        this.amountLeft = amountLeft;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDepositReportEntity that = (TDepositReportEntity) o;

        if (reportId != null ? !reportId.equals(that.reportId) : that.reportId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (reportDay != null ? !reportDay.equals(that.reportDay) : that.reportDay != null) return false;
        if (amountIn != null ? !amountIn.equals(that.amountIn) : that.amountIn != null) return false;
        if (amountOut != null ? !amountOut.equals(that.amountOut) : that.amountOut != null) return false;
        if (amountLeft != null ? !amountLeft.equals(that.amountLeft) : that.amountLeft != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId != null ? reportId.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (reportDay != null ? reportDay.hashCode() : 0);
        result = 31 * result + (amountIn != null ? amountIn.hashCode() : 0);
        result = 31 * result + (amountOut != null ? amountOut.hashCode() : 0);
        result = 31 * result + (amountLeft != null ? amountLeft.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
