package com.edu.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
//import org.springframework.security.web.authentication.logout.LogoutHandler;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

/**
 * Created by iivaniv on 19.07.2016.
 */
//@EnableWebSecurity
public class SecurityConfig  /*extends WebSecurityConfigurerAdapter*/ {


//    @Autowired
//    private AuthFailure authFailure;
//
//    @Autowired
//    private AuthSuccess authSuccess;
//
//    @Autowired
//    public void configureGlobal( AuthenticationManagerBuilder auth ) throws Exception {
//
//        auth
//            .inMemoryAuthentication()
//                    .withUser("user")
//                        .password("user")
//                        .roles("USER")
//                        .and()
//                    .withUser("admin")
//                        .password("admin")
//                        .roles("USER", "ADMIN");
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .csrf()
//                    .disable()
//                .formLogin()
//                    .successHandler(authSuccess).defaultSuccessUrl("/index.html", true)
//                    .failureHandler(authFailure)
//                .and()
//                .authorizeRequests()
//                    .antMatchers("/resources/**", "/signup", "/about").permitAll()
//                    .antMatchers("/**").authenticated()
//                    .and()
//                .logout()
//                    .permitAll()
//                    .logoutUrl("/logout")
//                    .logoutSuccessUrl("/out")
////                    .logoutSuccessHandler(simpleUrlLogoutSuccessHandler)
////                    .invalidateHttpSession(true)
////                    .addLogoutHandler(securityContextLogoutHandler)
//                    .and()
//        ;
//    }
}
