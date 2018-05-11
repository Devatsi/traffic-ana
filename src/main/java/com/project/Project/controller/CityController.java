/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.common.domain.City;
import com.project.Project.dao.CityDao;
import com.project.Project.model.CityModel;
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
@RequestMapping("/api/cities")
public class CityController {
    
    @Autowired
    CityDao cityDao;
    
    @RequestMapping(value = "/city",method = RequestMethod.POST)
    public City save(@RequestBody CityModel cityModel){
        log.info("city model is::"+cityModel);
        City c=new City();
        if(cityModel.getCityId()!=null){
            c.setCityId(cityModel.getCityId());
        }
        c.setCityLatitude(cityModel.getCityLatitude());
        c.setCityLongitude(cityModel.getCityLongitude());
        c.setCityName(cityModel.getCityName());
        c.setStatus(cityModel.getStatus());
        log.info("city is::" + c);
        return cityDao.save(c);
    }
    
    
}
