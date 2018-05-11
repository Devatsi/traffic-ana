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
public class CityModel {
    private Long cityId;

    private String cityName;
    
    private Long cityLatitude;
    
    private Long cityLongitude;
    
    private Boolean status;
}
