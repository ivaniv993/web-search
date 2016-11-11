package com.edu.controllers;

import com.edu.domain.Contact;
import com.edu.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;


/**
 * Created by iivaniv on 05.07.2016.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Value("${multipart.location}")
    private String location;

    @Autowired
    private ContactService contactService;


    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public List<Contact> upload( ) throws IOException {

        log.info("bla bla");
//        SecurityContext ctx = SecurityContextHolder.getContext();
//        Authentication authentication = ctx.getAuthentication();

//        User custom = authentication == null ? null : (User) authentication.getPrincipal();

//        log.info("Authenticated user:  {} ", custom.getUsername());
//        log.info("Contact :  {} ", contactService.findAll());

        return contactService.findAll();
    }

    @RequestMapping(value = "/user", method= RequestMethod.GET)
    public void saveUser( ) throws IOException {

        Contact contact = new Contact();
        contact.setFirstName("Ivan");
        contact.setLastName("Ivaniv");
        contact.setBirthDate(new Date());

        contactService.save(contact);
    }

}
