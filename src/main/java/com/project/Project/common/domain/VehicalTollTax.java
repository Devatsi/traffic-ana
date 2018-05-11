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
public class VehicalTollTax extends AbstractDomain implements Serializable{
    
    private static final long serialVersionUID = -4700904660158882712L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tollTaxId;
    
    private Float taxAmount;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Vehical vehical;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private HighwayToll toll;
    
    private Boolean status;
    
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Temporal(TemporalType.DATE)
    private Date endDate;
   
}
