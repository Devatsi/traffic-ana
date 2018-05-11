/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.LoginAuth;

import com.project.Project.common.domain.User;
import com.project.Project.service.UserService;
import java.awt.PageAttributes;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@Slf4j
@RequestMapping("/common/user")
public class LoginController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "user",method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Map<String,String> findByFullnameOrEmail(@RequestParam Map<String,String> userModel){
       log.info("----------user email is: "+ userModel.get("email"));
       Map<String,String> map=new HashMap<>();
       try {

            User user = userService.findByEmail(userModel.get("email"));
            if (user != null) {
                map.put("error", "Email already registered.");
            } else {
                map.put("success", "Unique Email found.");

            }

            return map;
        } catch (Exception e) {
            log.info("-------------" + e);
            map.put("error", "An internal problem has occurred");
            return map;
        }

    }
    
}
