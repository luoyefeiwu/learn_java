package com.jerry.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_banquet_desk", schema = "banquet1125", catalog = "")
public class TBanquetDeskEntity {
    private String banquetDeskId;
    private String deskOrderId;
    private String banquetId;
    private String tableId;
    private String tableName;
    private String roomType;
    private Integer tableNum;
    private int isMainHall;
    private Timestamp createTime;
    private String createUserId;
    private String createUser;
    private Timestamp updateTime;
    private String updateUserId;
    private String updateUser;
    private Integer deskNum;
    private Integer collectAmount;
    private String kbdOrderId;

    @Id
    @Column(name = "banquetDeskId")
    public String getBanquetDeskId() {
        return banquetDeskId;
    }

    public void setBanquetDeskId(String banquetDeskId) {
        this.banquetDeskId = banquetDeskId;
    }

    @Basic
    @Column(name = "deskOrderId")
    public String getDeskOrderId() {
        return deskOrderId;
    }

    public void setDeskOrderId(String deskOrderId) {
        this.deskOrderId = deskOrderId;
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
    @Column(name = "tableId")
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "tableName")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "roomType")
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Basic
    @Column(name = "tableNum")
    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    @Basic
    @Column(name = "isMainHall")
    public int getIsMainHall() {
        return isMainHall;
    }

    public void setIsMainHall(int isMainHall) {
        this.isMainHall = isMainHall;
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
    @Column(name = "deskNum")
    public Integer getDeskNum() {
        return deskNum;
    }

    public void setDeskNum(Integer deskNum) {
        this.deskNum = deskNum;
    }

    @Basic
    @Column(name = "collectAmount")
    public Integer getCollectAmount() {
        return collectAmount;
    }

    public void setCollectAmount(Integer collectAmount) {
        this.collectAmount = collectAmount;
    }

    @Basic
    @Column(name = "kbdOrderId")
    public String getKbdOrderId() {
        return kbdOrderId;
    }

    public void setKbdOrderId(String kbdOrderId) {
        this.kbdOrderId = kbdOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBanquetDeskEntity that = (TBanquetDeskEntity) o;

        if (isMainHall != that.isMainHall) return false;
        if (banquetDeskId != null ? !banquetDeskId.equals(that.banquetDeskId) : that.banquetDeskId != null)
            return false;
        if (deskOrderId != null ? !deskOrderId.equals(that.deskOrderId) : that.deskOrderId != null) return false;
        if (banquetId != null ? !banquetId.equals(that.banquetId) : that.banquetId != null) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (roomType != null ? !roomType.equals(that.roomType) : that.roomType != null) return false;
        if (tableNum != null ? !tableNum.equals(that.tableNum) : that.tableNum != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (deskNum != null ? !deskNum.equals(that.deskNum) : that.deskNum != null) return false;
        if (collectAmount != null ? !collectAmount.equals(that.collectAmount) : that.collectAmount != null)
            return false;
        if (kbdOrderId != null ? !kbdOrderId.equals(that.kbdOrderId) : that.kbdOrderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = banquetDeskId != null ? banquetDeskId.hashCode() : 0;
        result = 31 * result + (deskOrderId != null ? deskOrderId.hashCode() : 0);
        result = 31 * result + (banquetId != null ? banquetId.hashCode() : 0);
        result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + (tableNum != null ? tableNum.hashCode() : 0);
        result = 31 * result + isMainHall;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (deskNum != null ? deskNum.hashCode() : 0);
        result = 31 * result + (collectAmount != null ? collectAmount.hashCode() : 0);
        result = 31 * result + (kbdOrderId != null ? kbdOrderId.hashCode() : 0);
        return result;
    }
}
