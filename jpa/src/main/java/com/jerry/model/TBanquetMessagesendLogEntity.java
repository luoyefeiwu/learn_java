package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_messagesend_log", schema = "banquet1125", catalog = "")
public class TBanquetMessagesendLogEntity {
    private String id;
    private String banquetId;
    private String restaurantId;
    private String sendContent;
    private Timestamp sendTime;
    private String sendStatus;
    private String sendType;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
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
    @Column(name = "restaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "sendContent")
    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent;
    }

    @Basic
    @Column(name = "sendTime")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "sendStatus")
    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Basic
    @Column(name = "sendType")
    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
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
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetMessagesendLogEntity that = (TBanquetMessagesendLogEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (sendContent != null ? !sendContent.equals(that.sendContent) : that.sendContent != null) return false;
        if (sendTime != null ? !sendTime.equals(that.sendTime) : that.sendTime != null) return false;
        if (sendStatus != null ? !sendStatus.equals(that.sendStatus) : that.sendStatus != null) return false;
        if (sendType != null ? !sendType.equals(that.sendType) : that.sendType != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (sendContent != null ? sendContent.hashCode() : 0);
        result = 31 * result + (sendTime != null ? sendTime.hashCode() : 0);
        result = 31 * result + (sendStatus != null ? sendStatus.hashCode() : 0);
        result = 31 * result + (sendType != null ? sendType.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
