/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.dao;

import com.project.Project.common.domain.Vehical;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author apple
 */
public interface VehicalDao extends JpaRepository<Vehical, Long>{
    Vehical save(Vehical vehical);
}
