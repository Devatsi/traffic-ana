/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.HighwayToll;
import com.project.Project.common.domain.Vehical;
import com.project.Project.common.domain.VehicalTollTax;
import com.project.Project.dao.VehicalTollTaxDao;
import com.project.Project.model.VehicalTollTaxModel;
import com.project.Project.util.DateTimeConverter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class VehicalTollTaxServiceImpl implements VehicalTollTaxService {

    @Autowired
    VehicalTollTaxDao vehicalTollTaxDao;
     @Autowired
     DateTimeConverter dateTimeConverter;

    @Override
    public VehicalTollTax save(VehicalTollTaxModel vehicalTollTaxModel) {
        
            VehicalTollTax tax = new VehicalTollTax();
            if(vehicalTollTaxModel.getTollTaxId()!=null){
                tax.setTollTaxId(vehicalTollTaxModel.getTollTaxId());
            }
            tax.setTaxAmount(vehicalTollTaxModel.getTaxAmount());
            Vehical v=new Vehical();
            v.setVehicalId(vehicalTollTaxModel.getVehical());
            tax.setVehical(v);
            
            HighwayToll toll=new HighwayToll();
            toll.setTollId(vehicalTollTaxModel.getToll());
            tax.setToll(toll);
            try {
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date d=new Date();
            Date d1=new Date();
            d=sdf.parse(vehicalTollTaxModel.getStartDate());
             d1=sdf.parse(vehicalTollTaxModel.getEndDate());
            tax.setStartDate(d);
            tax.setEndDate(d1);
            
        } catch (ParseException ex) {
            Logger.getLogger(VehicalTollTaxServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehicalTollTaxDao.save(tax);
    }
}
