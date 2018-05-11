/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.model.VehicalTollTaxModel;
import com.project.Project.service.VehicalTollTaxService;
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
@RequestMapping("/api/VehicalTollTax")
public class VehicalTollTaxController {
    
    @Autowired
    VehicalTollTaxService vehicalTollTaxService;
    
    @RequestMapping(value = "/TollTax",method = RequestMethod.POST)
    public String save(@RequestBody VehicalTollTaxModel vehicalTollTaxModel){
        vehicalTollTaxService.save(vehicalTollTaxModel);
        return "record inserted";
    }
}
