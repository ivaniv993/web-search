package com.edu.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xXx on 11/15/2016.
 */

@Entity
@Table(name="JOB_IDENTIFICATION")
public class JobIdentification implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    private JobIdentification(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Long getId() {
        return id;
    }

}
