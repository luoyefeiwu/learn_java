package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_phase", schema = "banquet1125", catalog = "")
public class TBanquetPhaseEntity {
    private String phaseId;
    private String banquetId;
    private Timestamp nicheCreateTime;
    private Timestamp nicheStartTime;
    private Timestamp nicheEndTime;
    private Integer nicheCycleDay;
    private Timestamp intentCreateTime;
    private Timestamp intentStartTime;
    private Timestamp intentEndTime;
    private Integer intentCycleDay;
    private Timestamp priceCreateTime;
    private Timestamp priceStartTime;
    private Timestamp priceEndTime;
    private Integer priceCycleDay;
    private Timestamp contractCreateTime;
    private Timestamp contractStartTime;
    private Timestamp contractEndTime;
    private Integer contractCycleDay;
    private Timestamp prepareCreateTime;
    private Timestamp prepareStartTime;
    private Timestamp prepareEndTime;
    private Integer prepareCycleDay;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;

    @Id
    @Column(name = "phaseId")
    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
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
    @Column(name = "nicheCreateTime")
    public Timestamp getNicheCreateTime() {
        return nicheCreateTime;
    }

    public void setNicheCreateTime(Timestamp nicheCreateTime) {
        this.nicheCreateTime = nicheCreateTime;
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
    @Column(name = "nicheEndTime")
    public Timestamp getNicheEndTime() {
        return nicheEndTime;
    }

    public void setNicheEndTime(Timestamp nicheEndTime) {
        this.nicheEndTime = nicheEndTime;
    }

    @Basic
    @Column(name = "nicheCycleDay")
    public Integer getNicheCycleDay() {
        return nicheCycleDay;
    }

    public void setNicheCycleDay(Integer nicheCycleDay) {
        this.nicheCycleDay = nicheCycleDay;
    }

    @Basic
    @Column(name = "intentCreateTime")
    public Timestamp getIntentCreateTime() {
        return intentCreateTime;
    }

    public void setIntentCreateTime(Timestamp intentCreateTime) {
        this.intentCreateTime = intentCreateTime;
    }

    @Basic
    @Column(name = "intentStartTime")
    public Timestamp getIntentStartTime() {
        return intentStartTime;
    }

    public void setIntentStartTime(Timestamp intentStartTime) {
        this.intentStartTime = intentStartTime;
    }

    @Basic
    @Column(name = "intentEndTime")
    public Timestamp getIntentEndTime() {
        return intentEndTime;
    }

    public void setIntentEndTime(Timestamp intentEndTime) {
        this.intentEndTime = intentEndTime;
    }

    @Basic
    @Column(name = "intentCycleDay")
    public Integer getIntentCycleDay() {
        return intentCycleDay;
    }

    public void setIntentCycleDay(Integer intentCycleDay) {
        this.intentCycleDay = intentCycleDay;
    }

    @Basic
    @Column(name = "priceCreateTime")
    public Timestamp getPriceCreateTime() {
        return priceCreateTime;
    }

    public void setPriceCreateTime(Timestamp priceCreateTime) {
        this.priceCreateTime = priceCreateTime;
    }

    @Basic
    @Column(name = "priceStartTime")
    public Timestamp getPriceStartTime() {
        return priceStartTime;
    }

    public void setPriceStartTime(Timestamp priceStartTime) {
        this.priceStartTime = priceStartTime;
    }

    @Basic
    @Column(name = "priceEndTime")
    public Timestamp getPriceEndTime() {
        return priceEndTime;
    }

    public void setPriceEndTime(Timestamp priceEndTime) {
        this.priceEndTime = priceEndTime;
    }

    @Basic
    @Column(name = "priceCycleDay")
    public Integer getPriceCycleDay() {
        return priceCycleDay;
    }

    public void setPriceCycleDay(Integer priceCycleDay) {
        this.priceCycleDay = priceCycleDay;
    }

    @Basic
    @Column(name = "contractCreateTime")
    public Timestamp getContractCreateTime() {
        return contractCreateTime;
    }

    public void setContractCreateTime(Timestamp contractCreateTime) {
        this.contractCreateTime = contractCreateTime;
    }

    @Basic
    @Column(name = "contractStartTime")
    public Timestamp getContractStartTime() {
        return contractStartTime;
    }

    public void setContractStartTime(Timestamp contractStartTime) {
        this.contractStartTime = contractStartTime;
    }

    @Basic
    @Column(name = "contractEndTime")
    public Timestamp getContractEndTime() {
        return contractEndTime;
    }

    public void setContractEndTime(Timestamp contractEndTime) {
        this.contractEndTime = contractEndTime;
    }

    @Basic
    @Column(name = "contractCycleDay")
    public Integer getContractCycleDay() {
        return contractCycleDay;
    }

    public void setContractCycleDay(Integer contractCycleDay) {
        this.contractCycleDay = contractCycleDay;
    }

    @Basic
    @Column(name = "prepareCreateTime")
    public Timestamp getPrepareCreateTime() {
        return prepareCreateTime;
    }

    public void setPrepareCreateTime(Timestamp prepareCreateTime) {
        this.prepareCreateTime = prepareCreateTime;
    }

    @Basic
    @Column(name = "prepareStartTime")
    public Timestamp getPrepareStartTime() {
        return prepareStartTime;
    }

    public void setPrepareStartTime(Timestamp prepareStartTime) {
        this.prepareStartTime = prepareStartTime;
    }

    @Basic
    @Column(name = "prepareEndTime")
    public Timestamp getPrepareEndTime() {
        return prepareEndTime;
    }

    public void setPrepareEndTime(Timestamp prepareEndTime) {
        this.prepareEndTime = prepareEndTime;
    }

    @Basic
    @Column(name = "prepareCycleDay")
    public Integer getPrepareCycleDay() {
        return prepareCycleDay;
    }

    public void setPrepareCycleDay(Integer prepareCycleDay) {
        this.prepareCycleDay = prepareCycleDay;
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

        TBanquetPhaseEntity that = (TBanquetPhaseEntity) o;

        if (phaseId != null ? !phaseId.equals(that.phaseId) : that.phaseId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (nicheCreateTime != null ? !nicheCreateTime.equals(that.nicheCreateTime) : that.nicheCreateTime != null)
            return false;
        if (nicheStartTime != null ? !nicheStartTime.equals(that.nicheStartTime) : that.nicheStartTime != null)
            return false;
        if (nicheEndTime != null ? !nicheEndTime.equals(that.nicheEndTime) : that.nicheEndTime != null) return false;
        if (nicheCycleDay != null ? !nicheCycleDay.equals(that.nicheCycleDay) : that.nicheCycleDay != null)
            return false;
        if (intentCreateTime != null ? !intentCreateTime.equals(that.intentCreateTime) : that.intentCreateTime != null)
            return false;
        if (intentStartTime != null ? !intentStartTime.equals(that.intentStartTime) : that.intentStartTime != null)
            return false;
        if (intentEndTime != null ? !intentEndTime.equals(that.intentEndTime) : that.intentEndTime != null)
            return false;
        if (intentCycleDay != null ? !intentCycleDay.equals(that.intentCycleDay) : that.intentCycleDay != null)
            return false;
        if (priceCreateTime != null ? !priceCreateTime.equals(that.priceCreateTime) : that.priceCreateTime != null)
            return false;
        if (priceStartTime != null ? !priceStartTime.equals(that.priceStartTime) : that.priceStartTime != null)
            return false;
        if (priceEndTime != null ? !priceEndTime.equals(that.priceEndTime) : that.priceEndTime != null) return false;
        if (priceCycleDay != null ? !priceCycleDay.equals(that.priceCycleDay) : that.priceCycleDay != null)
            return false;
        if (contractCreateTime != null ? !contractCreateTime.equals(that.contractCreateTime) : that.contractCreateTime != null)
            return false;
        if (contractStartTime != null ? !contractStartTime.equals(that.contractStartTime) : that.contractStartTime != null)
            return false;
        if (contractEndTime != null ? !contractEndTime.equals(that.contractEndTime) : that.contractEndTime != null)
            return false;
        if (contractCycleDay != null ? !contractCycleDay.equals(that.contractCycleDay) : that.contractCycleDay != null)
            return false;
        if (prepareCreateTime != null ? !prepareCreateTime.equals(that.prepareCreateTime) : that.prepareCreateTime != null)
            return false;
        if (prepareStartTime != null ? !prepareStartTime.equals(that.prepareStartTime) : that.prepareStartTime != null)
            return false;
        if (prepareEndTime != null ? !prepareEndTime.equals(that.prepareEndTime) : that.prepareEndTime != null)
            return false;
        if (prepareCycleDay != null ? !prepareCycleDay.equals(that.prepareCycleDay) : that.prepareCycleDay != null)
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
        int result = phaseId != null ? phaseId.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (nicheCreateTime != null ? nicheCreateTime.hashCode() : 0);
        result = 31 * result + (nicheStartTime != null ? nicheStartTime.hashCode() : 0);
        result = 31 * result + (nicheEndTime != null ? nicheEndTime.hashCode() : 0);
        result = 31 * result + (nicheCycleDay != null ? nicheCycleDay.hashCode() : 0);
        result = 31 * result + (intentCreateTime != null ? intentCreateTime.hashCode() : 0);
        result = 31 * result + (intentStartTime != null ? intentStartTime.hashCode() : 0);
        result = 31 * result + (intentEndTime != null ? intentEndTime.hashCode() : 0);
        result = 31 * result + (intentCycleDay != null ? intentCycleDay.hashCode() : 0);
        result = 31 * result + (priceCreateTime != null ? priceCreateTime.hashCode() : 0);
        result = 31 * result + (priceStartTime != null ? priceStartTime.hashCode() : 0);
        result = 31 * result + (priceEndTime != null ? priceEndTime.hashCode() : 0);
        result = 31 * result + (priceCycleDay != null ? priceCycleDay.hashCode() : 0);
        result = 31 * result + (contractCreateTime != null ? contractCreateTime.hashCode() : 0);
        result = 31 * result + (contractStartTime != null ? contractStartTime.hashCode() : 0);
        result = 31 * result + (contractEndTime != null ? contractEndTime.hashCode() : 0);
        result = 31 * result + (contractCycleDay != null ? contractCycleDay.hashCode() : 0);
        result = 31 * result + (prepareCreateTime != null ? prepareCreateTime.hashCode() : 0);
        result = 31 * result + (prepareStartTime != null ? prepareStartTime.hashCode() : 0);
        result = 31 * result + (prepareEndTime != null ? prepareEndTime.hashCode() : 0);
        result = 31 * result + (prepareCycleDay != null ? prepareCycleDay.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
