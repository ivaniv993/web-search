package com.edu.controllers;

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
import org.springframework.web.multipart.MultipartFile;
import sun.util.logging.resources.logging;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;


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

    @RequestMapping(value = "/hello", method= RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
    public String upload( ) throws IOException {

        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication authentication = ctx.getAuthentication();

        User custom = authentication == null ? null : (User) authentication.getPrincipal();





        log.info("Authenticated user:  {} ", custom.getUsername());
        log.info("Contact :  {} ", contactService.getContactByFirstName("Ivan"));

        return custom.getUsername();
    }

}
