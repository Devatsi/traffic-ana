/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.HighwayToll;
import com.project.Project.common.domain.TollCamera;
import com.project.Project.dao.TollCameraDao;
import com.project.Project.model.TollCameraModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apple
 */
@Transactional
@Service
@Slf4j
public class TollCameraServiceImpl implements TollCameraService{
    @Autowired
    TollCameraDao cameraDao;
    
    @Override
    public TollCamera save(TollCameraModel cameraModel){
        TollCamera tc=new TollCamera();
        if(cameraModel.getCameraId()!=null){
        tc.setCameraId(cameraModel.getCameraId());
        }
         tc.setCameraDescription(cameraModel.getCameraDescription());
        tc.setCameraIp(cameraModel.getCameraIp());
        tc.setCameraPosition(cameraModel.getCameraPosition());
        tc.setStatus(cameraModel.getStatus());
        HighwayToll toll=new HighwayToll();
        toll.setTollId(cameraModel.getToll());
        tc.setToll(toll);
        return cameraDao.save(tc);
       
    }
    
}
