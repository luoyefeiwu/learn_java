package com.jerry.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet")
public class TBanquet {
    private String banquetId;
    private String restaurantId;
    private String restaurantName;
    private String nicheSource;
    private String nicheType;
    private String nicheTitle;
    private Date nicheStartTime;
    private Date nicheEndTime;
    private String intentMan;
    private String intentMerchMan;
    private Integer intentPlanTables;
    private Integer intentBudgetPer;
    private String intentRemark;
    private String priceSetmealId;
    private String priceSetmealName;
    private Integer priceSetmealCur;
    private Integer priceSetmealOri;
    private Integer priceAdjustDishNum;
    private Integer priceWine;
    private Integer priceAllocAmount;
    private Integer priceServiceCharge;
    private String priceServiceType;
    private String priceInvoiceType;
    private String priceRemark;
    private String priceAgrDiscType;
    private BigDecimal contractAgrDiscounts;
    private BigDecimal contractAfAmount;
    private BigDecimal contractFinalAmount;
    private BigDecimal deposit;
    private BigDecimal depositConfirmed;
    private Integer eoCount;
    private Integer contractGuaTables;
    private Integer contractSpareTables;
    private String contractPayType;
    private Integer orderStage;
    private Timestamp orderStageDate;
    private int orderStatus;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;
    private Integer receivableAmount;
    private Integer discountAmount;
    private Integer collectionTotalAmount;
    private Integer unpaidAmount;
    private String discardReasons;
    private String discardCompetitor;
    private String discardRemarks;
    private Timestamp signContractDate;
    private String etiquetteDrinksCon;
    private Timestamp cancelOrderDate;
    private Timestamp competeFailureDate;
    private BigDecimal depositFacilityConfirmed;
    private BigDecimal depositFacility;
    private int facility;
    private int facilityAloneSigning;
    private Integer synchroErpType;
    private Integer confirmLockTable;
    private Integer consumption;

    @Id
    @Column(name = "banquetId")
    public String getBanquetId() {
        return banquetId;
    }

    public void setBanquetId(String banquetId) {
        this.banquetId = banquetId;
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
    @Column(name = "restaurantName")
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Basic
    @Column(name = "nicheSource")
    public String getNicheSource() {
        return nicheSource;
    }

    public void setNicheSource(String nicheSource) {
        this.nicheSource = nicheSource;
    }

    @Basic
    @Column(name = "nicheType")
    public String getNicheType() {
        return nicheType;
    }

    public void setNicheType(String nicheType) {
        this.nicheType = nicheType;
    }

    @Basic
    @Column(name = "nicheTitle")
    public String getNicheTitle() {
        return nicheTitle;
    }

    public void setNicheTitle(String nicheTitle) {
        this.nicheTitle = nicheTitle;
    }

    @Basic
    @Column(name = "nicheStartTime")
    public Date getNicheStartTime() {
        return nicheStartTime;
    }

    public void setNicheStartTime(Date nicheStartTime) {
        this.nicheStartTime = nicheStartTime;
    }

    @Basic
    @Column(name = "nicheEndTime")
    public Date getNicheEndTime() {
        return nicheEndTime;
    }

    public void setNicheEndTime(Date nicheEndTime) {
        this.nicheEndTime = nicheEndTime;
    }

    @Basic
    @Column(name = "intentMan")
    public String getIntentMan() {
        return intentMan;
    }

    public void setIntentMan(String intentMan) {
        this.intentMan = intentMan;
    }

    @Basic
    @Column(name = "intentMerchMan")
    public String getIntentMerchMan() {
        return intentMerchMan;
    }

    public void setIntentMerchMan(String intentMerchMan) {
        this.intentMerchMan = intentMerchMan;
    }

    @Basic
    @Column(name = "intentPlanTables")
    public Integer getIntentPlanTables() {
        return intentPlanTables;
    }

    public void setIntentPlanTables(Integer intentPlanTables) {
        this.intentPlanTables = intentPlanTables;
    }

    @Basic
    @Column(name = "intentBudgetPer")
    public Integer getIntentBudgetPer() {
        return intentBudgetPer;
    }

    public void setIntentBudgetPer(Integer intentBudgetPer) {
        this.intentBudgetPer = intentBudgetPer;
    }

    @Basic
    @Column(name = "intentRemark")
    public String getIntentRemark() {
        return intentRemark;
    }

    public void setIntentRemark(String intentRemark) {
        this.intentRemark = intentRemark;
    }

    @Basic
    @Column(name = "priceSetmealId")
    public String getPriceSetmealId() {
        return priceSetmealId;
    }

    public void setPriceSetmealId(String priceSetmealId) {
        this.priceSetmealId = priceSetmealId;
    }

    @Basic
    @Column(name = "priceSetmealName")
    public String getPriceSetmealName() {
        return priceSetmealName;
    }

    public void setPriceSetmealName(String priceSetmealName) {
        this.priceSetmealName = priceSetmealName;
    }

    @Basic
    @Column(name = "priceSetmealCur")
    public Integer getPriceSetmealCur() {
        return priceSetmealCur;
    }

    public void setPriceSetmealCur(Integer priceSetmealCur) {
        this.priceSetmealCur = priceSetmealCur;
    }

    @Basic
    @Column(name = "priceSetmealOri")
    public Integer getPriceSetmealOri() {
        return priceSetmealOri;
    }

    public void setPriceSetmealOri(Integer priceSetmealOri) {
        this.priceSetmealOri = priceSetmealOri;
    }

    @Basic
    @Column(name = "priceAdjustDishNum")
    public Integer getPriceAdjustDishNum() {
        return priceAdjustDishNum;
    }

    public void setPriceAdjustDishNum(Integer priceAdjustDishNum) {
        this.priceAdjustDishNum = priceAdjustDishNum;
    }

    @Basic
    @Column(name = "priceWine")
    public Integer getPriceWine() {
        return priceWine;
    }

    public void setPriceWine(Integer priceWine) {
        this.priceWine = priceWine;
    }

    @Basic
    @Column(name = "priceAllocAmount")
    public Integer getPriceAllocAmount() {
        return priceAllocAmount;
    }

    public void setPriceAllocAmount(Integer priceAllocAmount) {
        this.priceAllocAmount = priceAllocAmount;
    }

    @Basic
    @Column(name = "priceServiceCharge")
    public Integer getPriceServiceCharge() {
        return priceServiceCharge;
    }

    public void setPriceServiceCharge(Integer priceServiceCharge) {
        this.priceServiceCharge = priceServiceCharge;
    }

    @Basic
    @Column(name = "priceServiceType")
    public String getPriceServiceType() {
        return priceServiceType;
    }

    public void setPriceServiceType(String priceServiceType) {
        this.priceServiceType = priceServiceType;
    }

    @Basic
    @Column(name = "priceInvoiceType")
    public String getPriceInvoiceType() {
        return priceInvoiceType;
    }

    public void setPriceInvoiceType(String priceInvoiceType) {
        this.priceInvoiceType = priceInvoiceType;
    }

    @Basic
    @Column(name = "priceRemark")
    public String getPriceRemark() {
        return priceRemark;
    }

    public void setPriceRemark(String priceRemark) {
        this.priceRemark = priceRemark;
    }

    @Basic
    @Column(name = "priceAgrDiscType")
    public String getPriceAgrDiscType() {
        return priceAgrDiscType;
    }

    public void setPriceAgrDiscType(String priceAgrDiscType) {
        this.priceAgrDiscType = priceAgrDiscType;
    }

    @Basic
    @Column(name = "contractAgrDiscounts")
    public BigDecimal getContractAgrDiscounts() {
        return contractAgrDiscounts;
    }

    public void setContractAgrDiscounts(BigDecimal contractAgrDiscounts) {
        this.contractAgrDiscounts = contractAgrDiscounts;
    }

    @Basic
    @Column(name = "contractAfAmount")
    public BigDecimal getContractAfAmount() {
        return contractAfAmount;
    }

    public void setContractAfAmount(BigDecimal contractAfAmount) {
        this.contractAfAmount = contractAfAmount;
    }

    @Basic
    @Column(name = "contractFinalAmount")
    public BigDecimal getContractFinalAmount() {
        return contractFinalAmount;
    }

    public void setContractFinalAmount(BigDecimal contractFinalAmount) {
        this.contractFinalAmount = contractFinalAmount;
    }

    @Basic
    @Column(name = "deposit")
    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Basic
    @Column(name = "depositConfirmed")
    public BigDecimal getDepositConfirmed() {
        return depositConfirmed;
    }

    public void setDepositConfirmed(BigDecimal depositConfirmed) {
        this.depositConfirmed = depositConfirmed;
    }

    @Basic
    @Column(name = "eoCount")
    public Integer getEoCount() {
        return eoCount;
    }

    public void setEoCount(Integer eoCount) {
        this.eoCount = eoCount;
    }

    @Basic
    @Column(name = "contractGuaTables")
    public Integer getContractGuaTables() {
        return contractGuaTables;
    }

    public void setContractGuaTables(Integer contractGuaTables) {
        this.contractGuaTables = contractGuaTables;
    }

    @Basic
    @Column(name = "contractSpareTables")
    public Integer getContractSpareTables() {
        return contractSpareTables;
    }

    public void setContractSpareTables(Integer contractSpareTables) {
        this.contractSpareTables = contractSpareTables;
    }

    @Basic
    @Column(name = "contractPayType")
    public String getContractPayType() {
        return contractPayType;
    }

    public void setContractPayType(String contractPayType) {
        this.contractPayType = contractPayType;
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
    @Column(name = "orderStageDate")
    public Timestamp getOrderStageDate() {
        return orderStageDate;
    }

    public void setOrderStageDate(Timestamp orderStageDate) {
        this.orderStageDate = orderStageDate;
    }

    @Basic
    @Column(name = "orderStatus")
    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
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
    @Column(name = "receivableAmount")
    public Integer getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Integer receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    @Basic
    @Column(name = "discountAmount")
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "collectionTotalAmount")
    public Integer getCollectionTotalAmount() {
        return collectionTotalAmount;
    }

    public void setCollectionTotalAmount(Integer collectionTotalAmount) {
        this.collectionTotalAmount = collectionTotalAmount;
    }

    @Basic
    @Column(name = "unpaidAmount")
    public Integer getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(Integer unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    @Basic
    @Column(name = "discardReasons")
    public String getDiscardReasons() {
        return discardReasons;
    }

    public void setDiscardReasons(String discardReasons) {
        this.discardReasons = discardReasons;
    }

    @Basic
    @Column(name = "discardCompetitor")
    public String getDiscardCompetitor() {
        return discardCompetitor;
    }

    public void setDiscardCompetitor(String discardCompetitor) {
        this.discardCompetitor = discardCompetitor;
    }

    @Basic
    @Column(name = "discardRemarks")
    public String getDiscardRemarks() {
        return discardRemarks;
    }

    public void setDiscardRemarks(String discardRemarks) {
        this.discardRemarks = discardRemarks;
    }

    @Basic
    @Column(name = "signContractDate")
    public Timestamp getSignContractDate() {
        return signContractDate;
    }

    public void setSignContractDate(Timestamp signContractDate) {
        this.signContractDate = signContractDate;
    }

    @Basic
    @Column(name = "etiquetteDrinksCon")
    public String getEtiquetteDrinksCon() {
        return etiquetteDrinksCon;
    }

    public void setEtiquetteDrinksCon(String etiquetteDrinksCon) {
        this.etiquetteDrinksCon = etiquetteDrinksCon;
    }

    @Basic
    @Column(name = "cancelOrderDate")
    public Timestamp getCancelOrderDate() {
        return cancelOrderDate;
    }

    public void setCancelOrderDate(Timestamp cancelOrderDate) {
        this.cancelOrderDate = cancelOrderDate;
    }

    @Basic
    @Column(name = "competeFailureDate")
    public Timestamp getCompeteFailureDate() {
        return competeFailureDate;
    }

    public void setCompeteFailureDate(Timestamp competeFailureDate) {
        this.competeFailureDate = competeFailureDate;
    }

    @Basic
    @Column(name = "depositFacilityConfirmed")
    public BigDecimal getDepositFacilityConfirmed() {
        return depositFacilityConfirmed;
    }

    public void setDepositFacilityConfirmed(BigDecimal depositFacilityConfirmed) {
        this.depositFacilityConfirmed = depositFacilityConfirmed;
    }

    @Basic
    @Column(name = "depositFacility")
    public BigDecimal getDepositFacility() {
        return depositFacility;
    }

    public void setDepositFacility(BigDecimal depositFacility) {
        this.depositFacility = depositFacility;
    }

    @Basic
    @Column(name = "facility")
    public int getFacility() {
        return facility;
    }

    public void setFacility(int facility) {
        this.facility = facility;
    }

    @Basic
    @Column(name = "facilityAloneSigning")
    public int getFacilityAloneSigning() {
        return facilityAloneSigning;
    }

    public void setFacilityAloneSigning(int facilityAloneSigning) {
        this.facilityAloneSigning = facilityAloneSigning;
    }

    @Basic
    @Column(name = "synchroErpType")
    public Integer getSynchroErpType() {
        return synchroErpType;
    }

    public void setSynchroErpType(Integer synchroErpType) {
        this.synchroErpType = synchroErpType;
    }

    @Basic
    @Column(name = "confirmLockTable")
    public Integer getConfirmLockTable() {
        return confirmLockTable;
    }

    public void setConfirmLockTable(Integer confirmLockTable) {
        this.confirmLockTable = confirmLockTable;
    }

    @Basic
    @Column(name = "consumption")
    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquet tBanquet = (TBanquet) o;

        if (orderStatus != tBanquet.orderStatus) return false;
        if (facility != tBanquet.facility) return false;
        if (facilityAloneSigning != tBanquet.facilityAloneSigning) return false;
        if (banquetId != null ? !banquetId.equals(tBanquet.banquetId) : tBanquet.banquetId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(tBanquet.restaurantId) : tBanquet.restaurantId != null)
            return false;
        if (restaurantName != null ? !restaurantName.equals(tBanquet.restaurantName) : tBanquet.restaurantName != null)
            return false;
        if (nicheSource != null ? !nicheSource.equals(tBanquet.nicheSource) : tBanquet.nicheSource != null)
            return false;
        if (nicheType != null ? !nicheType.equals(tBanquet.nicheType) : tBanquet.nicheType != null) return false;
        if (nicheTitle != null ? !nicheTitle.equals(tBanquet.nicheTitle) : tBanquet.nicheTitle != null) return false;
        if (nicheStartTime != null ? !nicheStartTime.equals(tBanquet.nicheStartTime) : tBanquet.nicheStartTime != null)
            return false;
        if (nicheEndTime != null ? !nicheEndTime.equals(tBanquet.nicheEndTime) : tBanquet.nicheEndTime != null)
            return false;
        if (intentMan != null ? !intentMan.equals(tBanquet.intentMan) : tBanquet.intentMan != null) return false;
        if (intentMerchMan != null ? !intentMerchMan.equals(tBanquet.intentMerchMan) : tBanquet.intentMerchMan != null)
            return false;
        if (intentPlanTables != null ? !intentPlanTables.equals(tBanquet.intentPlanTables) : tBanquet.intentPlanTables != null)
            return false;
        if (intentBudgetPer != null ? !intentBudgetPer.equals(tBanquet.intentBudgetPer) : tBanquet.intentBudgetPer != null)
            return false;
        if (intentRemark != null ? !intentRemark.equals(tBanquet.intentRemark) : tBanquet.intentRemark != null)
            return false;
        if (priceSetmealId != null ? !priceSetmealId.equals(tBanquet.priceSetmealId) : tBanquet.priceSetmealId != null)
            return false;
        if (priceSetmealName != null ? !priceSetmealName.equals(tBanquet.priceSetmealName) : tBanquet.priceSetmealName != null)
            return false;
        if (priceSetmealCur != null ? !priceSetmealCur.equals(tBanquet.priceSetmealCur) : tBanquet.priceSetmealCur != null)
            return false;
        if (priceSetmealOri != null ? !priceSetmealOri.equals(tBanquet.priceSetmealOri) : tBanquet.priceSetmealOri != null)
            return false;
        if (priceAdjustDishNum != null ? !priceAdjustDishNum.equals(tBanquet.priceAdjustDishNum) : tBanquet.priceAdjustDishNum != null)
            return false;
        if (priceWine != null ? !priceWine.equals(tBanquet.priceWine) : tBanquet.priceWine != null) return false;
        if (priceAllocAmount != null ? !priceAllocAmount.equals(tBanquet.priceAllocAmount) : tBanquet.priceAllocAmount != null)
            return false;
        if (priceServiceCharge != null ? !priceServiceCharge.equals(tBanquet.priceServiceCharge) : tBanquet.priceServiceCharge != null)
            return false;
        if (priceServiceType != null ? !priceServiceType.equals(tBanquet.priceServiceType) : tBanquet.priceServiceType != null)
            return false;
        if (priceInvoiceType != null ? !priceInvoiceType.equals(tBanquet.priceInvoiceType) : tBanquet.priceInvoiceType != null)
            return false;
        if (priceRemark != null ? !priceRemark.equals(tBanquet.priceRemark) : tBanquet.priceRemark != null)
            return false;
        if (priceAgrDiscType != null ? !priceAgrDiscType.equals(tBanquet.priceAgrDiscType) : tBanquet.priceAgrDiscType != null)
            return false;
        if (contractAgrDiscounts != null ? !contractAgrDiscounts.equals(tBanquet.contractAgrDiscounts) : tBanquet.contractAgrDiscounts != null)
            return false;
        if (contractAfAmount != null ? !contractAfAmount.equals(tBanquet.contractAfAmount) : tBanquet.contractAfAmount != null)
            return false;
        if (contractFinalAmount != null ? !contractFinalAmount.equals(tBanquet.contractFinalAmount) : tBanquet.contractFinalAmount != null)
            return false;
        if (deposit != null ? !deposit.equals(tBanquet.deposit) : tBanquet.deposit != null) return false;
        if (depositConfirmed != null ? !depositConfirmed.equals(tBanquet.depositConfirmed) : tBanquet.depositConfirmed != null)
            return false;
        if (eoCount != null ? !eoCount.equals(tBanquet.eoCount) : tBanquet.eoCount != null) return false;
        if (contractGuaTables != null ? !contractGuaTables.equals(tBanquet.contractGuaTables) : tBanquet.contractGuaTables != null)
            return false;
        if (contractSpareTables != null ? !contractSpareTables.equals(tBanquet.contractSpareTables) : tBanquet.contractSpareTables != null)
            return false;
        if (contractPayType != null ? !contractPayType.equals(tBanquet.contractPayType) : tBanquet.contractPayType != null)
            return false;
        if (orderStage != null ? !orderStage.equals(tBanquet.orderStage) : tBanquet.orderStage != null) return false;
        if (orderStageDate != null ? !orderStageDate.equals(tBanquet.orderStageDate) : tBanquet.orderStageDate != null)
            return false;
        if (createTime != null ? !createTime.equals(tBanquet.createTime) : tBanquet.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(tBanquet.createUserId) : tBanquet.createUserId != null)
            return false;
        if (createUser != null ? !createUser.equals(tBanquet.createUser) : tBanquet.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(tBanquet.updateTime) : tBanquet.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(tBanquet.updateUserId) : tBanquet.updateUserId != null)
            return false;
        if (updateUser != null ? !updateUser.equals(tBanquet.updateUser) : tBanquet.updateUser != null) return false;
        if (receivableAmount != null ? !receivableAmount.equals(tBanquet.receivableAmount) : tBanquet.receivableAmount != null)
            return false;
        if (discountAmount != null ? !discountAmount.equals(tBanquet.discountAmount) : tBanquet.discountAmount != null)
            return false;
        if (collectionTotalAmount != null ? !collectionTotalAmount.equals(tBanquet.collectionTotalAmount) : tBanquet.collectionTotalAmount != null)
            return false;
        if (unpaidAmount != null ? !unpaidAmount.equals(tBanquet.unpaidAmount) : tBanquet.unpaidAmount != null)
            return false;
        if (discardReasons != null ? !discardReasons.equals(tBanquet.discardReasons) : tBanquet.discardReasons != null)
            return false;
        if (discardCompetitor != null ? !discardCompetitor.equals(tBanquet.discardCompetitor) : tBanquet.discardCompetitor != null)
            return false;
        if (discardRemarks != null ? !discardRemarks.equals(tBanquet.discardRemarks) : tBanquet.discardRemarks != null)
            return false;
        if (signContractDate != null ? !signContractDate.equals(tBanquet.signContractDate) : tBanquet.signContractDate != null)
            return false;
        if (etiquetteDrinksCon != null ? !etiquetteDrinksCon.equals(tBanquet.etiquetteDrinksCon) : tBanquet.etiquetteDrinksCon != null)
            return false;
        if (cancelOrderDate != null ? !cancelOrderDate.equals(tBanquet.cancelOrderDate) : tBanquet.cancelOrderDate != null)
            return false;
        if (competeFailureDate != null ? !competeFailureDate.equals(tBanquet.competeFailureDate) : tBanquet.competeFailureDate != null)
            return false;
        if (depositFacilityConfirmed != null ? !depositFacilityConfirmed.equals(tBanquet.depositFacilityConfirmed) : tBanquet.depositFacilityConfirmed != null)
            return false;
        if (depositFacility != null ? !depositFacility.equals(tBanquet.depositFacility) : tBanquet.depositFacility != null)
            return false;
        if (synchroErpType != null ? !synchroErpType.equals(tBanquet.synchroErpType) : tBanquet.synchroErpType != null)
            return false;
        if (confirmLockTable != null ? !confirmLockTable.equals(tBanquet.confirmLockTable) : tBanquet.confirmLockTable != null)
            return false;
        if (consumption != null ? !consumption.equals(tBanquet.consumption) : tBanquet.consumption != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = banquetId != null ? banquetId.hashCode() : 0;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (restaurantName != null ? restaurantName.hashCode() : 0);
        result = 31 * result + (nicheSource != null ? nicheSource.hashCode() : 0);
        result = 31 * result + (nicheType != null ? nicheType.hashCode() : 0);
        result = 31 * result + (nicheTitle != null ? nicheTitle.hashCode() : 0);
        result = 31 * result + (nicheStartTime != null ? nicheStartTime.hashCode() : 0);
        result = 31 * result + (nicheEndTime != null ? nicheEndTime.hashCode() : 0);
        result = 31 * result + (intentMan != null ? intentMan.hashCode() : 0);
        result = 31 * result + (intentMerchMan != null ? intentMerchMan.hashCode() : 0);
        result = 31 * result + (intentPlanTables != null ? intentPlanTables.hashCode() : 0);
        result = 31 * result + (intentBudgetPer != null ? intentBudgetPer.hashCode() : 0);
        result = 31 * result + (intentRemark != null ? intentRemark.hashCode() : 0);
        result = 31 * result + (priceSetmealId != null ? priceSetmealId.hashCode() : 0);
        result = 31 * result + (priceSetmealName != null ? priceSetmealName.hashCode() : 0);
        result = 31 * result + (priceSetmealCur != null ? priceSetmealCur.hashCode() : 0);
        result = 31 * result + (priceSetmealOri != null ? priceSetmealOri.hashCode() : 0);
        result = 31 * result + (priceAdjustDishNum != null ? priceAdjustDishNum.hashCode() : 0);
        result = 31 * result + (priceWine != null ? priceWine.hashCode() : 0);
        result = 31 * result + (priceAllocAmount != null ? priceAllocAmount.hashCode() : 0);
        result = 31 * result + (priceServiceCharge != null ? priceServiceCharge.hashCode() : 0);
        result = 31 * result + (priceServiceType != null ? priceServiceType.hashCode() : 0);
        result = 31 * result + (priceInvoiceType != null ? priceInvoiceType.hashCode() : 0);
        result = 31 * result + (priceRemark != null ? priceRemark.hashCode() : 0);
        result = 31 * result + (priceAgrDiscType != null ? priceAgrDiscType.hashCode() : 0);
        result = 31 * result + (contractAgrDiscounts != null ? contractAgrDiscounts.hashCode() : 0);
        result = 31 * result + (contractAfAmount != null ? contractAfAmount.hashCode() : 0);
        result = 31 * result + (contractFinalAmount != null ? contractFinalAmount.hashCode() : 0);
        result = 31 * result + (deposit != null ? deposit.hashCode() : 0);
        result = 31 * result + (depositConfirmed != null ? depositConfirmed.hashCode() : 0);
        result = 31 * result + (eoCount != null ? eoCount.hashCode() : 0);
        result = 31 * result + (contractGuaTables != null ? contractGuaTables.hashCode() : 0);
        result = 31 * result + (contractSpareTables != null ? contractSpareTables.hashCode() : 0);
        result = 31 * result + (contractPayType != null ? contractPayType.hashCode() : 0);
        result = 31 * result + (orderStage != null ? orderStage.hashCode() : 0);
        result = 31 * result + (orderStageDate != null ? orderStageDate.hashCode() : 0);
        result = 31 * result + orderStatus;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (receivableAmount != null ? receivableAmount.hashCode() : 0);
        result = 31 * result + (discountAmount != null ? discountAmount.hashCode() : 0);
        result = 31 * result + (collectionTotalAmount != null ? collectionTotalAmount.hashCode() : 0);
        result = 31 * result + (unpaidAmount != null ? unpaidAmount.hashCode() : 0);
        result = 31 * result + (discardReasons != null ? discardReasons.hashCode() : 0);
        result = 31 * result + (discardCompetitor != null ? discardCompetitor.hashCode() : 0);
        result = 31 * result + (discardRemarks != null ? discardRemarks.hashCode() : 0);
        result = 31 * result + (signContractDate != null ? signContractDate.hashCode() : 0);
        result = 31 * result + (etiquetteDrinksCon != null ? etiquetteDrinksCon.hashCode() : 0);
        result = 31 * result + (cancelOrderDate != null ? cancelOrderDate.hashCode() : 0);
        result = 31 * result + (competeFailureDate != null ? competeFailureDate.hashCode() : 0);
        result = 31 * result + (depositFacilityConfirmed != null ? depositFacilityConfirmed.hashCode() : 0);
        result = 31 * result + (depositFacility != null ? depositFacility.hashCode() : 0);
        result = 31 * result + facility;
        result = 31 * result + facilityAloneSigning;
        result = 31 * result + (synchroErpType != null ? synchroErpType.hashCode() : 0);
        result = 31 * result + (confirmLockTable != null ? confirmLockTable.hashCode() : 0);
        result = 31 * result + (consumption != null ? consumption.hashCode() : 0);
        return result;
    }
}