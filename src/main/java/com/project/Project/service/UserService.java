/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.User;
import com.project.Project.model.UserModel;
import java.util.List;

/**
 *
 * @author apple
 */
public interface UserService {
    
    User findByFullnameOrEmail(String username);
    
    User findByEmail(String username);
//    
//    User findById(Long id);
//    
//    void save(User user);
//    
//     void deleteById(Long id);
//
//    User saveAsEmployee(UserModel userModel);
//
//    List<User> getEmployees(UserModel userModel);
}
