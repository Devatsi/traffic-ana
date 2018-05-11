/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.util;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import static com.project.Project.util.ProjectConstant.ADMIN;
import static com.project.Project.util.ProjectConstant.CLERK;
import static com.project.Project.util.ProjectConstant.RTO_OFFICER;
/**
 *
 * @author apple
 */
public class ProjectUser {
        public static String determineTargetUrl(Authentication authentication) throws Exception {

        Collection<? extends GrantedAuthority> authorities
                = authentication.getAuthorities();
        Set<String> authorities_ = authorities
                .stream()
                .map((auth) -> auth.getAuthority())
                .collect(Collectors.toSet());
        if (authorities_.contains(ADMIN)) {
            return "/admin";
        } else if (authorities_.contains(CLERK)) {
            return "/clerk";
        } else if (authorities_.contains(RTO_OFFICER)) {
            return "/RTO_Offier";
        } else {
            return "/no-role-specified";
        }
    }
}
