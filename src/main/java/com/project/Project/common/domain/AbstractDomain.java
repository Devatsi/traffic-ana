/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author apple
 */
@Data
@MappedSuperclass
public abstract class AbstractDomain implements Serializable {

    private static final long serialVersionUID = -4011178090604118083L;
    
    private String createdBy;
   
    private String updatedBy;
    
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedDate;

    @PrePersist
    public void saveBeforeCreate() {
        createdDate = updatedDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @PreUpdate
    public void saveBeforeUpdate() {
        updatedDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

}
