/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.model;

import lombok.Data;

/**
 *
 * @author apple
 */
@Data
public class HighwayModel {
    private Long highwayId;
    
    private String highwayNo;
    
    private String highwayName;
    
    private String highwayDetails;
    
    private String highwayDescription;
    
    private String highwayLength;
    
    
    private Long highwayStartPointCity;
    
    
    private Long highwayEndpointCity;
    
    private Boolean status;
}
