/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.City;
import com.project.Project.common.domain.Highway;
import com.project.Project.common.domain.HighwayToll;
import com.project.Project.dao.HighwayTollDao;
import com.project.Project.model.HighwayTollModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apple
 */
@Transactional
@Service
@Slf4j
public class HighwayTollServiceImpl implements  HighwayTollService{
    @Autowired
    HighwayTollDao highwayTollDao;
    
    @Override
    public HighwayToll save(HighwayTollModel highwayTollModel){
        log.info("highway toll model is::"+highwayTollModel);
        HighwayToll toll=new HighwayToll();
        if(highwayTollModel.getTollId()!=null){
            toll.setTollId(highwayTollModel.getTollId());
        }
        toll.setTollLatitude(highwayTollModel.getTollLatitude());
        toll.setTollLongitude(highwayTollModel.getTollLongitude());
        toll.setStatus(highwayTollModel.getStatus());
        City c=new City();
        c.setCityId(highwayTollModel.getCity());
        toll.setCity(c);
        toll.setTollName(highwayTollModel.getTollName());
        Highway h=new Highway();
        h.setHighwayId(highwayTollModel.getHighway());
        toll.setHighway(h);
        return highwayTollDao.save(toll);
    }
}
