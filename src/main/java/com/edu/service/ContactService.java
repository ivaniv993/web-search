package com.edu.service;

import com.edu.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by xXx on 10/4/2016.
 */
public interface ContactService extends CrudRepository<Contact, Long>{

//    List< Contact> getAllContacts();

    Contact getContactById(Long id);

    Contact getContactByFirstName( String firstName );

}
