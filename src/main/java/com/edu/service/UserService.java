package com.edu.service;

import com.edu.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by xXx on 10/4/2016.
 */
public interface UserService extends CrudRepository<User, Long> {

//    List< Contact> getAllContacts();

    List<User> findAll();

    User findByFirstName( String firstName );

    User save(User entity);

}
