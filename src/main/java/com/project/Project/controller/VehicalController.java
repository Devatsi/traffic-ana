/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.model.VehicalModel;
import com.project.Project.service.VehicalService;
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
@RequestMapping("/api/vehicals")
public class VehicalController {
    
    @Autowired
    VehicalService vehicalService;
    @RequestMapping(value = "/vehical",method = RequestMethod.POST)
    public String save(@RequestBody VehicalModel vehicalModel){
        vehicalService.save(vehicalModel);
        return "successfully inserted";
    }
}
