/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class City extends AbstractDomain implements Serializable {

    private static final long serialVersionUID = 4210251490416463760L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cityId;

    private String cityName;
    
    private Long cityLatitude;
    
    private Long cityLongitude;
    
    private Boolean status; //0 - false ,1 - true
}
