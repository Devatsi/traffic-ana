/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.service;

import com.project.Project.common.domain.User;
import com.project.Project.dao.UserRepository;
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
public class UserServiceImpl implements UserService{
    
    
    @Autowired
    UserRepository repository;
    
    @Override
    public User findByFullnameOrEmail(String Username){
        log.info("username or email in user serviceimpl is::"+Username);
        return repository.findByFullnameOrEmail(Username,Username);
    }
    
    public User findByEmail(String email){
        return repository.findByEmail(email);
    }
    
}
