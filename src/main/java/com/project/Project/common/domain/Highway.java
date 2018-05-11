/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class Highway extends AbstractDomain implements Serializable{

    private static final long serialVersionUID = 2147620225873928118L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long highwayId;
    
    private String highwayNo;
    
    private String highwayName;
    
    private String highwayDetails;
    
    private String highwayDescription;
    
    private String highwayLength;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private City highwayStartPointCity;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private City highwayEndpointCity;
    
    private Boolean status;
}
