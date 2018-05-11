/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.HighwayToll;
import com.project.Project.model.HighwayTollModel;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author apple
 */
public interface HighwayTollService  {
    HighwayToll save(HighwayTollModel highwayTollModel);
}
