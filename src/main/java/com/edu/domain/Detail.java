package com.edu.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by xXx on 10/4/2016.
 */
@Entity
@Table(name="DETAIL")
public class Detail implements Serializable{

    public Detail() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Column(name="additional_info")
    private String info;

    public Long getId() {
        return id;
    }

}
