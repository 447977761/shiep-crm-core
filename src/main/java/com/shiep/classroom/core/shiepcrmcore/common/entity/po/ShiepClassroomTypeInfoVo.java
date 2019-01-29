package com.shiep.classroom.core.shiepcrmcore.common.entity.po;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @program: shiep-crm-core
 * @description:
 * @author: liziyue
 * @create: 2019-01-26 17:54
 **/
@Entity
@Table(name = "shiep_classroom_type_info", schema = "shiep_crm_00")
public class ShiepClassroomTypeInfoVo {
    private long id;
    private String typeName;
    private String typeCode;
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
    @Column(name = "type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "type_code")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
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
        ShiepClassroomTypeInfoVo that = (ShiepClassroomTypeInfoVo) o;
        return id == that.id &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(modifior, that.modifior) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(modifiedTime, that.modifiedTime) &&
                Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, typeName, typeCode, modifior, creator, createdTime, modifiedTime, isDeleted);
    }
}
