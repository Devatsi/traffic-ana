/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.City;
import com.project.Project.common.domain.Highway;
import com.project.Project.dao.HighwayDao;
import com.project.Project.model.HighwayModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author apple
 */
@Service
public class HighwayServiceImpl implements HighwayService{
    @Autowired
    HighwayDao highwaydao;
    
    @Override
    public Highway save(HighwayModel highwayModel){
        Highway highway=new Highway();
        if(highwayModel.getHighwayId()!=null){
            highway.setHighwayId(highwayModel.getHighwayId());
        }
        highway.setHighwayName(highwayModel.getHighwayName());
        highway.setHighwayDescription(highwayModel.getHighwayDescription());
        highway.setHighwayDetails(highwayModel.getHighwayDetails());
        highway.setHighwayLength(highwayModel.getHighwayLength());
        highway.setHighwayNo(highwayModel.getHighwayNo());
        City c = new City();
        c.setCityId(highwayModel.getHighwayStartPointCity());
        highway.setHighwayStartPointCity(c);
        City c1 = new City();
        c1.setCityId(highwayModel.getHighwayEndpointCity());
        highway.setHighwayEndpointCity(c1);
        highway.setStatus(highwayModel.getStatus());
        return highwaydao.save(highway);
    }
}
