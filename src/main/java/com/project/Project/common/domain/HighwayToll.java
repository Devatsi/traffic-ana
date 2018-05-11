/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
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
public class HighwayToll extends AbstractDomain implements Serializable {

    private static final long serialVersionUID = 6617036391286755732L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tollId;
    
    private String tollName;
    
    private Long tollLatitude; 
    
    private Long tollLongitude;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Highway highway;
    
    private Boolean Status;
}
