package com.edu.controllers;

import com.edu.domain.Job;
import com.edu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * Created by iivaniv on 05.07.2016.
 */

@RestController
@RequestMapping(value = "/app")
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Value("${multipart.location}")
    private String location;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public Set<Job> upload( ) throws IOException {

        log.info("bla bla");
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication authentication = ctx.getAuthentication();

        User custom = authentication == null ? null : (User) authentication.getPrincipal();

        log.info("Authenticated user:  {} ", custom.getUsername());

//        contacts.get(0).getJobs();

        // TODO convert entity to DTO
        return userService.findByFirstName(custom.getUsername()).getJobs();
    }

}
