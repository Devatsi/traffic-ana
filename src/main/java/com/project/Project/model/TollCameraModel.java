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
public class TollCameraModel {
     private Long cameraId;
    
    private String cameraDescription;
    
    private Long cameraPosition;
    
    
    private Long toll;
    
    private String cameraIp;
    
    private Boolean status;
}
