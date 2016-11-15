package com.edu.controllers;

import com.edu.domain.Job;
import com.edu.domain.User;
import com.edu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;


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
    public List<User> upload( ) throws IOException {

        log.info("bla bla");
//        SecurityContext ctx = SecurityContextHolder.getContext();
//        Authentication authentication = ctx.getAuthentication();
//
//        User custom = authentication == null ? null : (User) authentication.getPrincipal();
//
//        log.info("Authenticated user:  {} ", custom.getUsername());
//        log.info("Contact :  {} ", contactService.findAll());
        List<User> contacts = userService.findAll();

//        contacts.get(0).getJobs();
        return contacts;
    }

    @RequestMapping(value = "/user", method= RequestMethod.GET)
    public void saveUser( ) throws IOException {

        User contact = new User();
        contact.setFirstName("Ivan");
        contact.setLastName("Ivaniv");
        contact.setBirthDate(new Date());

        userService.save(contact);
    }

}
