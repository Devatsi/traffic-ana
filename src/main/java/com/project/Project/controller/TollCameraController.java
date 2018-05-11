/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.model.TollCameraModel;
import com.project.Project.service.TollCameraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@Slf4j
@RequestMapping("/api/tollcamera")
public class TollCameraController {
    
    @Autowired
    TollCameraService cameraService;
    
    @RequestMapping(value = "/camera",method = RequestMethod.POST)
    public String save(@RequestBody TollCameraModel cameraModel){
        cameraService.save(cameraModel);
        return "successfully inserted";
    }
}
