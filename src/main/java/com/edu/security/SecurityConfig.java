package com.edu.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by iivaniv on 19.07.2016.
 */
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    public void configureGlobal( AuthenticationManagerBuilder auth ) throws Exception {


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .and()
                .httpBasic();

    }
}
