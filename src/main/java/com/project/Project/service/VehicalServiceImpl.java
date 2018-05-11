/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.Vehical;
import com.project.Project.dao.VehicalDao;
import com.project.Project.model.VehicalModel;
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
public class VehicalServiceImpl implements VehicalService {

    @Autowired
    VehicalDao vehicalDao;

    @Override
    public Vehical save(VehicalModel vehicalModel) {
        Vehical v = new Vehical();
        if (vehicalModel.getVehicalId() != null) {
            v.setVehicalId(vehicalModel.getVehicalId());
        }
        v.setStatus(vehicalModel.getStatus());
        v.setVehicalName(vehicalModel.getVehicalName());
        v.setVehicalType(vehicalModel.getVehicalType());
        return vehicalDao.save(v);

    }
}
