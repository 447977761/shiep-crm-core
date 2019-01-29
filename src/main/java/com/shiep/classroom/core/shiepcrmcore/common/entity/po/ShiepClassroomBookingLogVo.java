package com.shiep.classroom.core.shiepcrmcore.common.entity.po;

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
@Table(name = "shiep_classroom_booking_log", schema = "shiep_crm_00", catalog = "")
public class ShiepClassroomBookingLogVo {
    private long id;
    private String bookNo;
    private String state;
    private String modifior;
    private String creator;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    private String isDeleted;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "book_no")
    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    @Basic
    @Column(name = "\r\n\r\n\r\nstate")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShiepClassroomBookingLogVo that = (ShiepClassroomBookingLogVo) o;
        return id == that.id &&
                Objects.equals(bookNo, that.bookNo) &&
                Objects.equals(state, that.state) &&
                Objects.equals(modifior, that.modifior) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(modifiedTime, that.modifiedTime) &&
                Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, bookNo, state, modifior, creator, createdTime, modifiedTime, isDeleted);
    }
}
