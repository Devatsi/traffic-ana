/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.common.domain;

/**
 *
 * @author apple
 */
public enum Role {
    
    ADMIN("Admin"),
    CLERK("Clerk"),
    RTO_OFFICER("RTO_Officer");
    private final String desc;

    Role(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Role{" + "desc=" + desc + '}';
    }

}
