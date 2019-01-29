package com.shiep.classroom.core.shiepcrmcore.common.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @program: shiep-crm-core
 * @description:
 * @author: liziyue
 * @create: 2019-01-28 14:55
 **/
@Entity
@Table(name = "shiep_classroom_booking", schema = "shiep_crm_00", catalog = "")
public class ShiepClassroomBookingVo {
    private long id;
    private String classroomCode;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Timestamp orderStartDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Timestamp orderEndDate;
    private String bookUsername;
    private String managerUsername;
    private String isClear;
    private String modifior;
    private String creator;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    private String isDeleted;
    private String bookNo;

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
    @Column(name = "order_start_date")
    public Timestamp getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Timestamp orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    @Basic
    @Column(name = "order_end_date")
    public Timestamp getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Timestamp orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    @Basic
    @Column(name = "book_username")
    public String getBookUsername() {
        return bookUsername;
    }

    public void setBookUsername(String bookUsername) {
        this.bookUsername = bookUsername;
    }

    @Basic
    @Column(name = "manager_username")
    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
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
    @Column(name = "book_no")
    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShiepClassroomBookingVo that = (ShiepClassroomBookingVo) o;
        return id == that.id &&
                Objects.equals(classroomCode, that.classroomCode) &&
                Objects.equals(orderStartDate, that.orderStartDate) &&
                Objects.equals(orderEndDate, that.orderEndDate) &&
                Objects.equals(bookUsername, that.bookUsername) &&
                Objects.equals(managerUsername, that.managerUsername) &&
                Objects.equals(isClear, that.isClear) &&
                Objects.equals(modifior, that.modifior) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(modifiedTime, that.modifiedTime) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(bookNo, that.bookNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, classroomCode, orderStartDate, orderEndDate, bookUsername, managerUsername, isClear, modifior, creator, createdTime, modifiedTime, isDeleted, bookNo);
    }
}
