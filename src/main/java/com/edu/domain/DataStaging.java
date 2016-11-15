package com.edu.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xXx on 11/15/2016.
 */
@Entity
@Table(name="JOB_DATA_STAGING")
public class DataStaging implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_sys_name")
    private String fileSysName;

    @Column(name = "creation_flag")
    private Boolean creationFlag;

    @Column(name = "delete_after_termination")
    private Boolean deleteAfterTermination;

    @Column(name = "source")
    private String source;

    @Column(name = "target")
    private String target;

    private DataStaging(){}

    public Boolean getDeleteAfterTermination() {
        return deleteAfterTermination;
    }

    public void setDeleteAfterTermination(Boolean deleteAfterTermination) {
        this.deleteAfterTermination = deleteAfterTermination;
    }

    public Boolean getCreationFlag() {
        return creationFlag;
    }

    public void setCreationFlag(Boolean creationFlag) {
        this.creationFlag = creationFlag;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSysName() {
        return fileSysName;
    }

    public void setFileSysName(String fileSysName) {
        this.fileSysName = fileSysName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
