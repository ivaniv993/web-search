package com.edu.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by xXx on 10/4/2016.
 */
@Entity
@Table(name="CONTACT")
public class Contact implements Serializable{

    public Contact() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


    @Column(name="birth_date")
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
