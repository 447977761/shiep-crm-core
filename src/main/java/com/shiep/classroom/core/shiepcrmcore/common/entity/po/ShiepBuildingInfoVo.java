package com.shiep.classroom.core.shiepcrmcore.common.entity.po;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * @program: shiep-crm-core
 * @description:
 * @author: liziyue
 * @create: 2019-01-11 18:38
 **/
@Entity
@Table(name = "shiep_building_info", schema = "shiep_crm_00", catalog = "")
public class ShiepBuildingInfoVo {
    private long id;
    private String buildingCode;
    private String buildingName;
    private String modifior;
    private String creator;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    private String isDeleted;
    private Integer floors;
    private String secondName;
    private String tabId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "building_code")
    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    @Basic
    @Column(name = "building_name")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Basic
    @Column(name = "modifior")
    public String getModifior() {
        return modifior;
    }

    public void setModifior(String modifior) {
        this.modifior = modifior;
    }

    @Basic
    @Column(name = "creator")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "created_time")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "modified_time")
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Basic
    @Column(name = "is_deleted")
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "floors")
    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @Basic
    @Column(name = "second_name")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "tab_id")
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShiepBuildingInfoVo that = (ShiepBuildingInfoVo) o;
        return id == that.id &&
                Objects.equals(buildingCode, that.buildingCode) &&
                Objects.equals(buildingName, that.buildingName) &&
                Objects.equals(modifior, that.modifior) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(modifiedTime, that.modifiedTime) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(floors, that.floors) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(tabId, that.tabId);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, buildingCode, buildingName, modifior, creator, createdTime, modifiedTime, isDeleted, floors, secondName);
        result = 31 * result + Objects.hashCode(tabId);
        return result;
    }
}
