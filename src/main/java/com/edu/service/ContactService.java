package com.edu.service;

import com.edu.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xXx on 10/4/2016.
 */
public interface ContactService extends CrudRepository<Contact, Long> {

//    List< Contact> getAllContacts();

    List<Contact> findAll();

    Contact findByFirstName( String firstName );

    Contact save(Contact entity);

}
