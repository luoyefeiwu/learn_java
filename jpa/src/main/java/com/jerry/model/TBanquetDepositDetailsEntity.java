package com.jerry.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_deposit_details", schema = "banquet1125", catalog = "")
public class TBanquetDepositDetailsEntity {
    private String detailsId;
    private String restaurantId;
    private String banquetId;
    private Integer amount;
    private Integer amountOut;
    private String payType;
    private String receiptId;
    private Date payTime;
    private String payee;
    private String payeeId;
    private String drawee;
    private String draweeId;
    private String depositType;
    private Integer financeConfirmed;
    private Timestamp confirmDate;
    private Integer printNumber;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;
    private int type;

    @Id
    @Column(name = "detailsId")
    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
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
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "amount_out")
    public Integer getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(Integer amountOut) {
        this.amountOut = amountOut;
    }

    @Basic
    @Column(name = "payType")
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "receiptId")
    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
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
    @Column(name = "drawee")
    public String getDrawee() {
        return drawee;
    }

    public void setDrawee(String drawee) {
        this.drawee = drawee;
    }

    @Basic
    @Column(name = "draweeId")
    public String getDraweeId() {
        return draweeId;
    }

    public void setDraweeId(String draweeId) {
        this.draweeId = draweeId;
    }

    @Basic
    @Column(name = "depositType")
    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    @Basic
    @Column(name = "financeConfirmed")
    public Integer getFinanceConfirmed() {
        return financeConfirmed;
    }

    public void setFinanceConfirmed(Integer financeConfirmed) {
        this.financeConfirmed = financeConfirmed;
    }

    @Basic
    @Column(name = "ConfirmDate")
    public Timestamp getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Timestamp confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Basic
    @Column(name = "printNumber")
    public Integer getPrintNumber() {
        return printNumber;
    }

    public void setPrintNumber(Integer printNumber) {
        this.printNumber = printNumber;
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

    @Basic
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "updateUserId")
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "updateUser")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "type")
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

        TBanquetDepositDetailsEntity that = (TBanquetDepositDetailsEntity) o;

        if (type != that.type) return false;
        if (detailsId != null ? !detailsId.equals(that.detailsId) : that.detailsId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (amountOut != null ? !amountOut.equals(that.amountOut) : that.amountOut != null) return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (receiptId != null ? !receiptId.equals(that.receiptId) : that.receiptId != null) return false;
        if (payTime != null ? !payTime.equals(that.payTime) : that.payTime != null) return false;
        if (payee != null ? !payee.equals(that.payee) : that.payee != null) return false;
        if (payeeId != null ? !payeeId.equals(that.payeeId) : that.payeeId != null) return false;
        if (drawee != null ? !drawee.equals(that.drawee) : that.drawee != null) return false;
        if (draweeId != null ? !draweeId.equals(that.draweeId) : that.draweeId != null) return false;
        if (depositType != null ? !depositType.equals(that.depositType) : that.depositType != null) return false;
        if (financeConfirmed != null ? !financeConfirmed.equals(that.financeConfirmed) : that.financeConfirmed != null)
            return false;
        if (confirmDate != null ? !confirmDate.equals(that.confirmDate) : that.confirmDate != null) return false;
        if (printNumber != null ? !printNumber.equals(that.printNumber) : that.printNumber != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = detailsId != null ? detailsId.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (amountOut != null ? amountOut.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (receiptId != null ? receiptId.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (payee != null ? payee.hashCode() : 0);
        result = 31 * result + (payeeId != null ? payeeId.hashCode() : 0);
        result = 31 * result + (drawee != null ? drawee.hashCode() : 0);
        result = 31 * result + (draweeId != null ? draweeId.hashCode() : 0);
        result = 31 * result + (depositType != null ? depositType.hashCode() : 0);
        result = 31 * result + (financeConfirmed != null ? financeConfirmed.hashCode() : 0);
        result = 31 * result + (confirmDate != null ? confirmDate.hashCode() : 0);
        result = 31 * result + (printNumber != null ? printNumber.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }
}
