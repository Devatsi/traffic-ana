/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author apple
 */
@Entity
@Getter
@Setter
public class Questions  extends AbstractDomain implements Serializable{
    private static final long serialVersionUID = 6247582164217160713L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;
    
    private String questionText;
}
