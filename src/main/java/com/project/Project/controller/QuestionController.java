/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.controller;

import com.project.Project.common.domain.Questions;
import com.project.Project.dao.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    
    @Autowired
    QuestionRepository questionRepository;
    @RequestMapping(value = "/question",method = RequestMethod.POST)
    public Questions save(@RequestBody Questions questions){
        return questionRepository.save(questions);
    }
}
