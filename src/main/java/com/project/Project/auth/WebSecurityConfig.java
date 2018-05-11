/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Project.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import static com.project.Project.util.ProjectConstant.ADMIN;
import static com.project.Project.util.ProjectConstant.CLERK;
import static com.project.Project.util.ProjectConstant.RTO_OFFICER;
import com.project.Project.util.ProjectUser;

/**
 *
 * @author apple
 */
//@Configuration
@Slf4j
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private UserDetailsService detailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/resources","/registration","/resetpassword","/forgotpassword").permitAll()
            .antMatchers("/admin/**").hasAnyAuthority(ADMIN)
            .antMatchers("/clerk").hasAnyAuthority(CLERK)
            .antMatchers("/Rto-officer").hasAnyAuthority(RTO_OFFICER)
            .antMatchers("/common")
            .authenticated().antMatchers("/login/**")
            .permitAll().anyRequest().authenticated()
            .and().formLogin().loginPage("/login")
            .successHandler(redirectStrategy())
            .permitAll().and().logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/login")
            .permitAll();
       
    }
    
    private AuthenticationSuccessHandler redirectStrategy() {
        return (HttpServletRequest request,
                HttpServletResponse response,
                Authentication authentication) -> {
            String targetUrl = "/no-role-specified";
            try {
                targetUrl = ProjectUser.determineTargetUrl(authentication);
            } catch (Exception ex) {
                log.error(ex.getMessage());
            }

            if (response.isCommitted()) {
                log.debug(
                        "Response has already been committed. Unable to redirect to "
                        + targetUrl);
                return;
            }
            response.sendRedirect(targetUrl);

        };
    }
}
