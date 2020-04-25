package com.jerry.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_contract", schema = "banquet1125", catalog = "")
@IdClass(TBanquetContractEntityPK.class)
public class TBanquetContractEntity {
    private String banquetId;
    private String finishReDeposit;
    private String breakReDeposit;
    private Integer reDepositAmount;
    private String depositRemark;
    private String paymentMethod;
    private String settlementMethod;
    private Integer settlePeriod;
    private Integer firstPayment;
    private Date firstPaymentDate;
    private Integer finalPayment;
    private Date finalPaymentDate;
    private String guarantor;
    private String guaranteExplain;
    private String custsigner;
    private String shopSigner;
    private String contractNumber;
    private String invoiceType;
    private Integer invoiceAmount;
    private String invoicePayee;
    private String invoicePayeeTel;
    private String payeeAddress;
    private String zipCode;
    private String company;
    private String taxpayerNum;
    private String registerAddress;
    private String registerTel;
    private String openingBank;
    private String accountNumber;
    private int type;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;

    @Id
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
    }

    @Basic
    @Column(name = "finishReDeposit")
    public String getFinishReDeposit() {
        return finishReDeposit;
    }

    public void setFinishReDeposit(String finishReDeposit) {
        this.finishReDeposit = finishReDeposit;
    }

    @Basic
    @Column(name = "breakReDeposit")
    public String getBreakReDeposit() {
        return breakReDeposit;
    }

    public void setBreakReDeposit(String breakReDeposit) {
        this.breakReDeposit = breakReDeposit;
    }

    @Basic
    @Column(name = "reDepositAmount")
    public Integer getReDepositAmount() {
        return reDepositAmount;
    }

    public void setReDepositAmount(Integer reDepositAmount) {
        this.reDepositAmount = reDepositAmount;
    }

    @Basic
    @Column(name = "depositRemark")
    public String getDepositRemark() {
        return depositRemark;
    }

    public void setDepositRemark(String depositRemark) {
        this.depositRemark = depositRemark;
    }

    @Basic
    @Column(name = "paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Basic
    @Column(name = "settlementMethod")
    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    @Basic
    @Column(name = "settlePeriod")
    public Integer getSettlePeriod() {
        return settlePeriod;
    }

    public void setSettlePeriod(Integer settlePeriod) {
        this.settlePeriod = settlePeriod;
    }

    @Basic
    @Column(name = "firstPayment")
    public Integer getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(Integer firstPayment) {
        this.firstPayment = firstPayment;
    }

    @Basic
    @Column(name = "firstPaymentDate")
    public Date getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public void setFirstPaymentDate(Date firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }

    @Basic
    @Column(name = "finalPayment")
    public Integer getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(Integer finalPayment) {
        this.finalPayment = finalPayment;
    }

    @Basic
    @Column(name = "finalPaymentDate")
    public Date getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public void setFinalPaymentDate(Date finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    @Basic
    @Column(name = "guarantor")
    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    @Basic
    @Column(name = "guaranteExplain")
    public String getGuaranteExplain() {
        return guaranteExplain;
    }

    public void setGuaranteExplain(String guaranteExplain) {
        this.guaranteExplain = guaranteExplain;
    }

    @Basic
    @Column(name = "custsigner")
    public String getCustsigner() {
        return custsigner;
    }

    public void setCustsigner(String custsigner) {
        this.custsigner = custsigner;
    }

    @Basic
    @Column(name = "shopSigner")
    public String getShopSigner() {
        return shopSigner;
    }

    public void setShopSigner(String shopSigner) {
        this.shopSigner = shopSigner;
    }

    @Basic
    @Column(name = "contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Basic
    @Column(name = "invoiceType")
    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Basic
    @Column(name = "invoiceAmount")
    public Integer getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Integer invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Basic
    @Column(name = "invoicePayee")
    public String getInvoicePayee() {
        return invoicePayee;
    }

    public void setInvoicePayee(String invoicePayee) {
        this.invoicePayee = invoicePayee;
    }

    @Basic
    @Column(name = "invoicePayeeTel")
    public String getInvoicePayeeTel() {
        return invoicePayeeTel;
    }

    public void setInvoicePayeeTel(String invoicePayeeTel) {
        this.invoicePayeeTel = invoicePayeeTel;
    }

    @Basic
    @Column(name = "payeeAddress")
    public String getPayeeAddress() {
        return payeeAddress;
    }

    public void setPayeeAddress(String payeeAddress) {
        this.payeeAddress = payeeAddress;
    }

    @Basic
    @Column(name = "zipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "taxpayerNum")
    public String getTaxpayerNum() {
        return taxpayerNum;
    }

    public void setTaxpayerNum(String taxpayerNum) {
        this.taxpayerNum = taxpayerNum;
    }

    @Basic
    @Column(name = "registerAddress")
    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    @Basic
    @Column(name = "registerTel")
    public String getRegisterTel() {
        return registerTel;
    }

    public void setRegisterTel(String registerTel) {
        this.registerTel = registerTel;
    }

    @Basic
    @Column(name = "openingBank")
    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    @Basic
    @Column(name = "accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Id
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetContractEntity that = (TBanquetContractEntity) o;

        if (type != that.type) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (finishReDeposit != null ? !finishReDeposit.equals(that.finishReDeposit) : that.finishReDeposit != null)
            return false;
        if (breakReDeposit != null ? !breakReDeposit.equals(that.breakReDeposit) : that.breakReDeposit != null)
            return false;
        if (reDepositAmount != null ? !reDepositAmount.equals(that.reDepositAmount) : that.reDepositAmount != null)
            return false;
        if (depositRemark != null ? !depositRemark.equals(that.depositRemark) : that.depositRemark != null)
            return false;
        if (paymentMethod != null ? !paymentMethod.equals(that.paymentMethod) : that.paymentMethod != null)
            return false;
        if (settlementMethod != null ? !settlementMethod.equals(that.settlementMethod) : that.settlementMethod != null)
            return false;
        if (settlePeriod != null ? !settlePeriod.equals(that.settlePeriod) : that.settlePeriod != null) return false;
        if (firstPayment != null ? !firstPayment.equals(that.firstPayment) : that.firstPayment != null) return false;
        if (firstPaymentDate != null ? !firstPaymentDate.equals(that.firstPaymentDate) : that.firstPaymentDate != null)
            return false;
        if (finalPayment != null ? !finalPayment.equals(that.finalPayment) : that.finalPayment != null) return false;
        if (finalPaymentDate != null ? !finalPaymentDate.equals(that.finalPaymentDate) : that.finalPaymentDate != null)
            return false;
        if (guarantor != null ? !guarantor.equals(that.guarantor) : that.guarantor != null) return false;
        if (guaranteExplain != null ? !guaranteExplain.equals(that.guaranteExplain) : that.guaranteExplain != null)
            return false;
        if (custsigner != null ? !custsigner.equals(that.custsigner) : that.custsigner != null) return false;
        if (shopSigner != null ? !shopSigner.equals(that.shopSigner) : that.shopSigner != null) return false;
        if (contractNumber != null ? !contractNumber.equals(that.contractNumber) : that.contractNumber != null)
            return false;
        if (invoiceType != null ? !invoiceType.equals(that.invoiceType) : that.invoiceType != null) return false;
        if (invoiceAmount != null ? !invoiceAmount.equals(that.invoiceAmount) : that.invoiceAmount != null)
            return false;
        if (invoicePayee != null ? !invoicePayee.equals(that.invoicePayee) : that.invoicePayee != null) return false;
        if (invoicePayeeTel != null ? !invoicePayeeTel.equals(that.invoicePayeeTel) : that.invoicePayeeTel != null)
            return false;
        if (payeeAddress != null ? !payeeAddress.equals(that.payeeAddress) : that.payeeAddress != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (taxpayerNum != null ? !taxpayerNum.equals(that.taxpayerNum) : that.taxpayerNum != null) return false;
        if (registerAddress != null ? !registerAddress.equals(that.registerAddress) : that.registerAddress != null)
            return false;
        if (registerTel != null ? !registerTel.equals(that.registerTel) : that.registerTel != null) return false;
        if (openingBank != null ? !openingBank.equals(that.openingBank) : that.openingBank != null) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
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
        int result = banquetId != null ? banquetId.hashCode() : 0;
        result = 31 * result + (finishReDeposit != null ? finishReDeposit.hashCode() : 0);
        result = 31 * result + (breakReDeposit != null ? breakReDeposit.hashCode() : 0);
        result = 31 * result + (reDepositAmount != null ? reDepositAmount.hashCode() : 0);
        result = 31 * result + (depositRemark != null ? depositRemark.hashCode() : 0);
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        result = 31 * result + (settlementMethod != null ? settlementMethod.hashCode() : 0);
        result = 31 * result + (settlePeriod != null ? settlePeriod.hashCode() : 0);
        result = 31 * result + (firstPayment != null ? firstPayment.hashCode() : 0);
        result = 31 * result + (firstPaymentDate != null ? firstPaymentDate.hashCode() : 0);
        result = 31 * result + (finalPayment != null ? finalPayment.hashCode() : 0);
        result = 31 * result + (finalPaymentDate != null ? finalPaymentDate.hashCode() : 0);
        result = 31 * result + (guarantor != null ? guarantor.hashCode() : 0);
        result = 31 * result + (guaranteExplain != null ? guaranteExplain.hashCode() : 0);
        result = 31 * result + (custsigner != null ? custsigner.hashCode() : 0);
        result = 31 * result + (shopSigner != null ? shopSigner.hashCode() : 0);
        result = 31 * result + (contractNumber != null ? contractNumber.hashCode() : 0);
        result = 31 * result + (invoiceType != null ? invoiceType.hashCode() : 0);
        result = 31 * result + (invoiceAmount != null ? invoiceAmount.hashCode() : 0);
        result = 31 * result + (invoicePayee != null ? invoicePayee.hashCode() : 0);
        result = 31 * result + (invoicePayeeTel != null ? invoicePayeeTel.hashCode() : 0);
        result = 31 * result + (payeeAddress != null ? payeeAddress.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (taxpayerNum != null ? taxpayerNum.hashCode() : 0);
        result = 31 * result + (registerAddress != null ? registerAddress.hashCode() : 0);
        result = 31 * result + (registerTel != null ? registerTel.hashCode() : 0);
        result = 31 * result + (openingBank != null ? openingBank.hashCode() : 0);
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
