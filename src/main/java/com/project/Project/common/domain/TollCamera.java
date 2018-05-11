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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class TollCamera extends AbstractDomain implements Serializable{

    private static final long serialVersionUID = 4601581390445806582L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cameraId;
    
    private String cameraDescription;
    
    private Long cameraPosition;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private HighwayToll toll;
    
    private String cameraIp;
    
    private Boolean status;
    
}
