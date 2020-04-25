package com.jerry.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_snapshot", schema = "banquet1125", catalog = "")
public class TBanquetSnapshotEntity {
    private String id;
    private String banquetId;
    private Integer orderStatus;
    private Timestamp nicheStartTime;
    private String nicheType;
    private String nicheTypeName;
    private String intentMerchMan;
    private String intentMerchManName;
    private String intentMan;
    private String intentManName;
    private String linkman;
    private String banquetOrder;
    private String banquetDesk;
    private String setmeal;
    private String facility;
    private BigDecimal deposit;
    private BigDecimal contractFinalAmount;
    private String contractGuaTables;
    private String contractSpareTables;
    private String banquetContract;
    private String banquetService;
    private String discardReasons;
    private Integer sequence;
    private Timestamp handleTime;
    private String handleUser;
    private String handleUserId;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "orderStatus")
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "nicheStartTime")
    public Timestamp getNicheStartTime() {
        return nicheStartTime;
    }

    public void setNicheStartTime(Timestamp nicheStartTime) {
        this.nicheStartTime = nicheStartTime;
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
    @Column(name = "nicheTypeName")
    public String getNicheTypeName() {
        return nicheTypeName;
    }

    public void setNicheTypeName(String nicheTypeName) {
        this.nicheTypeName = nicheTypeName;
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
    @Column(name = "intentMerchManName")
    public String getIntentMerchManName() {
        return intentMerchManName;
    }

    public void setIntentMerchManName(String intentMerchManName) {
        this.intentMerchManName = intentMerchManName;
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
    @Column(name = "intentManName")
    public String getIntentManName() {
        return intentManName;
    }

    public void setIntentManName(String intentManName) {
        this.intentManName = intentManName;
    }

    @Basic
    @Column(name = "linkman")
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Basic
    @Column(name = "banquetOrder")
    public String getBanquetOrder() {
        return banquetOrder;
    }

    public void setBanquetOrder(String banquetOrder) {
        this.banquetOrder = banquetOrder;
    }

    @Basic
    @Column(name = "banquetDesk")
    public String getBanquetDesk() {
        return banquetDesk;
    }

    public void setBanquetDesk(String banquetDesk) {
        this.banquetDesk = banquetDesk;
    }

    @Basic
    @Column(name = "setmeal")
    public String getSetmeal() {
        return setmeal;
    }

    public void setSetmeal(String setmeal) {
        this.setmeal = setmeal;
    }

    @Basic
    @Column(name = "facility")
    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
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
    @Column(name = "contractFinalAmount")
    public BigDecimal getContractFinalAmount() {
        return contractFinalAmount;
    }

    public void setContractFinalAmount(BigDecimal contractFinalAmount) {
        this.contractFinalAmount = contractFinalAmount;
    }

    @Basic
    @Column(name = "contractGuaTables")
    public String getContractGuaTables() {
        return contractGuaTables;
    }

    public void setContractGuaTables(String contractGuaTables) {
        this.contractGuaTables = contractGuaTables;
    }

    @Basic
    @Column(name = "contractSpareTables")
    public String getContractSpareTables() {
        return contractSpareTables;
    }

    public void setContractSpareTables(String contractSpareTables) {
        this.contractSpareTables = contractSpareTables;
    }

    @Basic
    @Column(name = "banquetContract")
    public String getBanquetContract() {
        return banquetContract;
    }

    public void setBanquetContract(String banquetContract) {
        this.banquetContract = banquetContract;
    }

    @Basic
    @Column(name = "banquetService")
    public String getBanquetService() {
        return banquetService;
    }

    public void setBanquetService(String banquetService) {
        this.banquetService = banquetService;
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
    @Column(name = "sequence")
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "handleTime")
    public Timestamp getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Timestamp handleTime) {
        this.handleTime = handleTime;
    }

    @Basic
    @Column(name = "handleUser")
    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }

    @Basic
    @Column(name = "handleUserId")
    public String getHandleUserId() {
        return handleUserId;
    }

    public void setHandleUserId(String handleUserId) {
        this.handleUserId = handleUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetSnapshotEntity that = (TBanquetSnapshotEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (nicheStartTime != null ? !nicheStartTime.equals(that.nicheStartTime) : that.nicheStartTime != null)
            return false;
        if (nicheType != null ? !nicheType.equals(that.nicheType) : that.nicheType != null) return false;
        if (nicheTypeName != null ? !nicheTypeName.equals(that.nicheTypeName) : that.nicheTypeName != null)
            return false;
        if (intentMerchMan != null ? !intentMerchMan.equals(that.intentMerchMan) : that.intentMerchMan != null)
            return false;
        if (intentMerchManName != null ? !intentMerchManName.equals(that.intentMerchManName) : that.intentMerchManName != null)
            return false;
        if (intentMan != null ? !intentMan.equals(that.intentMan) : that.intentMan != null) return false;
        if (intentManName != null ? !intentManName.equals(that.intentManName) : that.intentManName != null)
            return false;
        if (linkman != null ? !linkman.equals(that.linkman) : that.linkman != null) return false;
        if (banquetOrder != null ? !banquetOrder.equals(that.banquetOrder) : that.banquetOrder != null) return false;
        if (banquetDesk != null ? !banquetDesk.equals(that.banquetDesk) : that.banquetDesk != null) return false;
        if (setmeal != null ? !setmeal.equals(that.setmeal) : that.setmeal != null) return false;
        if (facility != null ? !facility.equals(that.facility) : that.facility != null) return false;
        if (deposit != null ? !deposit.equals(that.deposit) : that.deposit != null) return false;
        if (contractFinalAmount != null ? !contractFinalAmount.equals(that.contractFinalAmount) : that.contractFinalAmount != null)
            return false;
        if (contractGuaTables != null ? !contractGuaTables.equals(that.contractGuaTables) : that.contractGuaTables != null)
            return false;
        if (contractSpareTables != null ? !contractSpareTables.equals(that.contractSpareTables) : that.contractSpareTables != null)
            return false;
        if (banquetContract != null ? !banquetContract.equals(that.banquetContract) : that.banquetContract != null)
            return false;
        if (banquetService != null ? !banquetService.equals(that.banquetService) : that.banquetService != null)
            return false;
        if (discardReasons != null ? !discardReasons.equals(that.discardReasons) : that.discardReasons != null)
            return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;
        if (handleTime != null ? !handleTime.equals(that.handleTime) : that.handleTime != null) return false;
        if (handleUser != null ? !handleUser.equals(that.handleUser) : that.handleUser != null) return false;
        if (handleUserId != null ? !handleUserId.equals(that.handleUserId) : that.handleUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (nicheStartTime != null ? nicheStartTime.hashCode() : 0);
        result = 31 * result + (nicheType != null ? nicheType.hashCode() : 0);
        result = 31 * result + (nicheTypeName != null ? nicheTypeName.hashCode() : 0);
        result = 31 * result + (intentMerchMan != null ? intentMerchMan.hashCode() : 0);
        result = 31 * result + (intentMerchManName != null ? intentMerchManName.hashCode() : 0);
        result = 31 * result + (intentMan != null ? intentMan.hashCode() : 0);
        result = 31 * result + (intentManName != null ? intentManName.hashCode() : 0);
        result = 31 * result + (linkman != null ? linkman.hashCode() : 0);
        result = 31 * result + (banquetOrder != null ? banquetOrder.hashCode() : 0);
        result = 31 * result + (banquetDesk != null ? banquetDesk.hashCode() : 0);
        result = 31 * result + (setmeal != null ? setmeal.hashCode() : 0);
        result = 31 * result + (facility != null ? facility.hashCode() : 0);
        result = 31 * result + (deposit != null ? deposit.hashCode() : 0);
        result = 31 * result + (contractFinalAmount != null ? contractFinalAmount.hashCode() : 0);
        result = 31 * result + (contractGuaTables != null ? contractGuaTables.hashCode() : 0);
        result = 31 * result + (contractSpareTables != null ? contractSpareTables.hashCode() : 0);
        result = 31 * result + (banquetContract != null ? banquetContract.hashCode() : 0);
        result = 31 * result + (banquetService != null ? banquetService.hashCode() : 0);
        result = 31 * result + (discardReasons != null ? discardReasons.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        result = 31 * result + (handleTime != null ? handleTime.hashCode() : 0);
        result = 31 * result + (handleUser != null ? handleUser.hashCode() : 0);
        result = 31 * result + (handleUserId != null ? handleUserId.hashCode() : 0);
        return result;
    }
}
