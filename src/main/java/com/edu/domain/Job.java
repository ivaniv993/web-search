package com.edu.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by xXx on 11/15/2016.
 */
@Entity
@Table(name="JOB")
public class Job  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
    private Set<Resource> resources;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
    private Set<JobIdentification> jobIdentifications;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
    private Set<DataStaging> dataStagings;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
    private Set<Application> applications;

    private Job(){}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<JobIdentification> getJobIdentifications() {
        return jobIdentifications;
    }

    public void setJobIdentifications(Set<JobIdentification> jobIdentifications) {
        this.jobIdentifications = jobIdentifications;
    }

    public Set<DataStaging> getDataStagings() {
        return dataStagings;
    }

    public void setDataStagings(Set<DataStaging> dataStagings) {
        this.dataStagings = dataStagings;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
