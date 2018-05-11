/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class User extends AbstractDomain implements Serializable{

    private static final long serialVersionUID = -7025116880938544876L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    
    private String fullname;
    
    private String email;
    
    private String password;
    
    private String phone;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Questions questions;
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    private String questionAnswer;
    
    private Boolean status;
    
    
}
