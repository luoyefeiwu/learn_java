package com.jerry.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_deposit_refund", schema = "banquet1125", catalog = "")
public class TBanquetDepositRefundEntity {
    private String refundId;
    private String restaurantId;
    private String banquetId;
    private String detailsIdIn;
    private Integer depositSlip;
    private Integer amountIn;
    private Date payTime;
    private Integer amountOut;
    private Integer reservationMoneyType;
    private Timestamp refundTime;
    private String payee;
    private String payeeId;
    private String refundUser;
    private String refundUserId;
    private String remark;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;

    @Id
    @Column(name = "refundId")
    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
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
    @Column(name = "detailsId_In")
    public String getDetailsIdIn() {
        return detailsIdIn;
    }

    public void setDetailsIdIn(String detailsIdIn) {
        this.detailsIdIn = detailsIdIn;
    }

    @Basic
    @Column(name = "depositSlip")
    public Integer getDepositSlip() {
        return depositSlip;
    }

    public void setDepositSlip(Integer depositSlip) {
        this.depositSlip = depositSlip;
    }

    @Basic
    @Column(name = "amount_In")
    public Integer getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(Integer amountIn) {
        this.amountIn = amountIn;
    }

    @Basic
    @Column(name = "payTime")
    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "amount_Out")
    public Integer getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(Integer amountOut) {
        this.amountOut = amountOut;
    }

    @Basic
    @Column(name = "reservationMoneyType")
    public Integer getReservationMoneyType() {
        return reservationMoneyType;
    }

    public void setReservationMoneyType(Integer reservationMoneyType) {
        this.reservationMoneyType = reservationMoneyType;
    }

    @Basic
    @Column(name = "refundTime")
    public Timestamp getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Timestamp refundTime) {
        this.refundTime = refundTime;
    }

    @Basic
    @Column(name = "payee")
    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    @Basic
    @Column(name = "payeeId")
    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    @Basic
    @Column(name = "refundUser")
    public String getRefundUser() {
        return refundUser;
    }

    public void setRefundUser(String refundUser) {
        this.refundUser = refundUser;
    }

    @Basic
    @Column(name = "refundUserId")
    public String getRefundUserId() {
        return refundUserId;
    }

    public void setRefundUserId(String refundUserId) {
        this.refundUserId = refundUserId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetDepositRefundEntity that = (TBanquetDepositRefundEntity) o;

        if (refundId != null ? !refundId.equals(that.refundId) : that.refundId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (detailsIdIn != null ? !detailsIdIn.equals(that.detailsIdIn) : that.detailsIdIn != null) return false;
        if (depositSlip != null ? !depositSlip.equals(that.depositSlip) : that.depositSlip != null) return false;
        if (amountIn != null ? !amountIn.equals(that.amountIn) : that.amountIn != null) return false;
        if (payTime != null ? !payTime.equals(that.payTime) : that.payTime != null) return false;
        if (amountOut != null ? !amountOut.equals(that.amountOut) : that.amountOut != null) return false;
        if (reservationMoneyType != null ? !reservationMoneyType.equals(that.reservationMoneyType) : that.reservationMoneyType != null)
            return false;
        if (refundTime != null ? !refundTime.equals(that.refundTime) : that.refundTime != null) return false;
        if (payee != null ? !payee.equals(that.payee) : that.payee != null) return false;
        if (payeeId != null ? !payeeId.equals(that.payeeId) : that.payeeId != null) return false;
        if (refundUser != null ? !refundUser.equals(that.refundUser) : that.refundUser != null) return false;
        if (refundUserId != null ? !refundUserId.equals(that.refundUserId) : that.refundUserId != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refundId != null ? refundId.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (detailsIdIn != null ? detailsIdIn.hashCode() : 0);
        result = 31 * result + (depositSlip != null ? depositSlip.hashCode() : 0);
        result = 31 * result + (amountIn != null ? amountIn.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (amountOut != null ? amountOut.hashCode() : 0);
        result = 31 * result + (reservationMoneyType != null ? reservationMoneyType.hashCode() : 0);
        result = 31 * result + (refundTime != null ? refundTime.hashCode() : 0);
        result = 31 * result + (payee != null ? payee.hashCode() : 0);
        result = 31 * result + (payeeId != null ? payeeId.hashCode() : 0);
        result = 31 * result + (refundUser != null ? refundUser.hashCode() : 0);
        result = 31 * result + (refundUserId != null ? refundUserId.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        return result;
    }
}
