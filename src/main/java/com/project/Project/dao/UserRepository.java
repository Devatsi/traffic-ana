/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.dao;

import com.project.Project.common.domain.User;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author apple
 */
public interface UserRepository  extends JpaRepository<User, Long>{
    User findByFullnameOrEmail(String username, String email);
    
    User findByEmail(String email);
    User save(User user);
}
