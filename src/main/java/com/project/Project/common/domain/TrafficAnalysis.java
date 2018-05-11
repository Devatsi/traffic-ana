/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class TrafficAnalysis implements Serializable{

    private static final long serialVersionUID = 8124943053242886589L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trafficId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private TollCamera cameraId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehical vehicalId;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date passOnTime;
}
