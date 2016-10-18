package com.edu.controllers;

import com.edu.domain.Contact;
import com.edu.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


/**
 * Created by iivaniv on 05.07.2016.
 */

@RestController
@RequestMapping(value = "/api")
public class UploadController {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Value("${multipart.location}")
    private String location;

    @Autowired
    private ContactService contactService;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/hello", method= RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
    public String upload( ) throws IOException {

        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication authentication = ctx.getAuthentication();

        User custom = authentication == null ? null : (User) authentication.getPrincipal();



        try {
            Statement state = dataSource.getConnection().createStatement();
            state.execute("select * from contact");
            ResultSet resultSet = state.getResultSet();

            while (resultSet.next()){
                System.out.println("result "+ resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        log.info("Authenticated user:  {} ", custom.getUsername());
        log.info("Contact :  {} ", contactService.findAll());

        return custom.getUsername();
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
