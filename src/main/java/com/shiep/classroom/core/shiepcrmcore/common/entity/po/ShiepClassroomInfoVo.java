package com.shiep.classroom.core.shiepcrmcore.common.entity.po;

import com.shiep.classroom.core.shiepcrmcore.common.entity.PageInfoDTO;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @program: shiep-crm-core
 * @description:
 * @author: liziyue
 * @create: 2019-01-10 19:28
 **/
@Entity
@Table(name = "shiep_classroom_info", schema = "shiep_crm_00")
public class ShiepClassroomInfoVo extends PageInfoDTO {

    private long id;
    private String classroomCode;
    private String classroomName;
    private Integer chairs;
    private Integer desks;
    private Integer actualChairs;
    private Integer actualDesks;
    private Integer projectorCount;
    private String isProjector;
    private String isComputer;
    private Integer computerCount;
    private String isClear;
    private String modifior;
    private String creator;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    private String isDeleted;
    private String isProhibited;
    private String buildingCode;
    private String floor;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "classroom_code")
    public String getClassroomCode() {
        return classroomCode;
    }

    public void setClassroomCode(String classroomCode) {
        this.classroomCode = classroomCode;
    }

    @Basic
    @Column(name = "classroom_name")
    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    @Basic
    @Column(name = "chairs")
    public Integer getChairs() {
        return chairs;
    }

    public void setChairs(Integer chairs) {
        this.chairs = chairs;
    }

    @Basic
    @Column(name = "desks")
    public Integer getDesks() {
        return desks;
    }

    public void setDesks(Integer desks) {
        this.desks = desks;
    }

    @Basic
    @Column(name = "actual_chairs")
    public Integer getActualChairs() {
        return actualChairs;
    }

    public void setActualChairs(Integer actualChairs) {
        this.actualChairs = actualChairs;
    }

    @Basic
    @Column(name = "actual_desks")
    public Integer getActualDesks() {
        return actualDesks;
    }

    public void setActualDesks(Integer actualDesks) {
        this.actualDesks = actualDesks;
    }

    @Basic
    @Column(name = "projector_count")
    public Integer getProjectorCount() {
        return projectorCount;
    }

    public void setProjectorCount(Integer projectorCount) {
        this.projectorCount = projectorCount;
    }

    @Basic
    @Column(name = "is_projector")
    public String getIsProjector() {
        return isProjector;
    }

    public void setIsProjector(String isProjector) {
        this.isProjector = isProjector;
    }

    @Basic
    @Column(name = "is_computer")
    public String getIsComputer() {
        return isComputer;
    }

    public void setIsComputer(String isComputer) {
        this.isComputer = isComputer;
    }

    @Basic
    @Column(name = "computer_count")
    public Integer getComputerCount() {
        return computerCount;
    }

    public void setComputerCount(Integer computerCount) {
        this.computerCount = computerCount;
    }

    @Basic
    @Column(name = "is_clear")
    public String getIsClear() {
        return isClear;
    }

    public void setIsClear(String isClear) {
        this.isClear = isClear;
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
    @Column(name = "is_prohibited")
    public String getIsProhibited() {
        return isProhibited;
    }

    public void setIsProhibited(String isProhibited) {
        this.isProhibited = isProhibited;
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
    @Column(name = "floor")
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShiepClassroomInfoVo that = (ShiepClassroomInfoVo) o;
        return id == that.id &&
                Objects.equals(classroomCode, that.classroomCode) &&
                Objects.equals(classroomName, that.classroomName) &&
                Objects.equals(chairs, that.chairs) &&
                Objects.equals(desks, that.desks) &&
                Objects.equals(actualChairs, that.actualChairs) &&
                Objects.equals(actualDesks, that.actualDesks) &&
                Objects.equals(projectorCount, that.projectorCount) &&
                Objects.equals(isProjector, that.isProjector) &&
                Objects.equals(isComputer, that.isComputer) &&
                Objects.equals(computerCount, that.computerCount) &&
                Objects.equals(isClear, that.isClear) &&
                Objects.equals(modifior, that.modifior) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(modifiedTime, that.modifiedTime) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(isProhibited, that.isProhibited) &&
                Objects.equals(buildingCode, that.buildingCode) &&
                Objects.equals(floor, that.floor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classroomCode, classroomName, chairs, desks, actualChairs, actualDesks, projectorCount, isProjector, isComputer, computerCount, isClear, modifior, creator, createdTime, modifiedTime, isDeleted, isProhibited, buildingCode, floor);
    }
}
