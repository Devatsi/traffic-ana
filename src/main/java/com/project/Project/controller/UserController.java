/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.common.domain.User;
import com.project.Project.dao.UserRepository;
import com.project.Project.model.UserModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    UserRepository userRepository;
    @RequestMapping(method = RequestMethod.GET)
    public List<UserModel> getUsers(){
        List<UserModel> usermodel=new ArrayList<>();
        List<User> user = userRepository.findAll();
        for(User user1:user){
            UserModel um=new UserModel();
            um.setEmail(user1.getEmail());
            um.setFullname(user1.getFullname());
            um.setPassword(user1.getPassword());
            um.setPhone(user1.getPhone());
            um.setQuestionAnswer(user1.getQuestionAnswer());
            um.setStatus(user1.getStatus());
            um.setQuestions(user1.getQuestions().getQuestionId());
            um.setRole(user1.getRole());
            usermodel.add(um);
        }  
       return usermodel;  
    }
}
