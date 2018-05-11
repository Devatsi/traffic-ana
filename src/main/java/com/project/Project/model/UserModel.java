/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.model;

import com.project.Project.common.domain.Role;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Data;

/**
 *
 * @author apple
 */
@Data
public class UserModel {
    private Long userId;
    
    private String fullname;
    
    private String email;
    
    private String password;
    
    private String phone;
    
    private Long questions;
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    private String questionAnswer;
    
    private Boolean status;
}
