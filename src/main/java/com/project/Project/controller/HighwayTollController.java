/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.model.HighwayTollModel;
import com.project.Project.service.HighwayTollService;
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
@RequestMapping("/api/highwayTolls")
public class HighwayTollController {
    @Autowired
    HighwayTollService highwayTollService;
    
    @RequestMapping(value="/toll",method = RequestMethod.POST)
    public String save(@RequestBody HighwayTollModel highwayTollModel){
        highwayTollService.save(highwayTollModel);
        return "inserted successfully";
    }
    
}
