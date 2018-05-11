/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.model.HighwayModel;
import com.project.Project.service.HighwayService;
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
@RequestMapping("/api/highways")
public class HighwayController {
    
    @Autowired
    HighwayService highwayservice; 
    
    @RequestMapping(value="/highway",method = RequestMethod.POST)
    public String save(@RequestBody HighwayModel highwayModel){
        highwayservice.save(highwayModel);
        return "successfully inserted";
    }
    
}
