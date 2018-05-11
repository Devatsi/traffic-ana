/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.TollCamera;
import com.project.Project.model.TollCameraModel;

/**
 *
 * @author apple
 */
public interface TollCameraService {
    TollCamera save(TollCameraModel cameraModel);
}
