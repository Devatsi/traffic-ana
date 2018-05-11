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
public class HighwayTollModel {
    private Long tollId;
    
    private String tollName;
    
    private Long tollLatitude; 
    
    private Long tollLongitude;
    
    
    private Long city;
    
    
    private Long highway;
    
    private Boolean status;
}
