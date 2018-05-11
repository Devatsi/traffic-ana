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
public class VehicalTollTaxModel {
     private Long tollTaxId;
    
    private Float taxAmount;
    
    
    private Long vehical;
    
    
    private Long toll;
    
    private Boolean status;
    
   
    private String startDate;
    
    
    private String endDate;
}
