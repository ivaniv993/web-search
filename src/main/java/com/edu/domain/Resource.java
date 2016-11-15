package com.edu.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xXx on 11/15/2016.
 */
@Entity
@Table(name="JOB_RESOURCE")
public class Resource implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Column(name = "candidate_host")
    private String candidateHost;

    @Column(name = "exclusive_execution")
    private String exclusiveExecution;

    @Column(name = "cpu_architecture")
    private String cpuArchitecture;

    @Column(name = "individual_cpu_speed")
    private Long individualCpuSpeed;

    @Column(name = "individual_cpu_time")
    private Long individualCpuTime;

    @Column(name = "individual_cpu_count")
    private Long individualCpuCount;

    @Column(name = "individual_cpu_bandwidth")
    private Long individualCpuBandwidth;

    @Column(name = "individual_cpu_memory")
    private Long individualCpuMemory;

    @Column(name = "individual_cpu_space")
    private Long individualCpuSpace;

    @Column(name = "total_cpu_time")
    private Long totalCpuTime;

    @Column(name = "total_cpu_count")
    private Long totalCpuCount;

    @Column(name = "total_physical_memory")
    private Long totalPhysicalMemory;

    @Column(name = "total_virtual_memory")
    private Long totalVirtualMemory;

    @Column(name = "total_disk_space")
    private Long totalDiskSpace;

    @Column(name = "total_resource_count")
    private Long totalResourceCount;

    private Resource(){}

    public String getCandidateHost() {
        return candidateHost;
    }

    public void setCandidateHost(String candidateHost) {
        this.candidateHost = candidateHost;
    }

    public String getExclusiveExecution() {
        return exclusiveExecution;
    }

    public void setExclusiveExecution(String exclusiveExecution) {
        this.exclusiveExecution = exclusiveExecution;
    }

    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    public Long getIndividualCpuSpeed() {
        return individualCpuSpeed;
    }

    public void setIndividualCpuSpeed(Long individualCpuSpeed) {
        this.individualCpuSpeed = individualCpuSpeed;
    }

    public Long getIndividualCpuTime() {
        return individualCpuTime;
    }

    public void setIndividualCpuTime(Long individualCpuTime) {
        this.individualCpuTime = individualCpuTime;
    }

    public Long getIndividualCpuCount() {
        return individualCpuCount;
    }

    public void setIndividualCpuCount(Long individualCpuCount) {
        this.individualCpuCount = individualCpuCount;
    }

    public Long getIndividualCpuBandwidth() {
        return individualCpuBandwidth;
    }

    public void setIndividualCpuBandwidth(Long individualCpuBandwidth) {
        this.individualCpuBandwidth = individualCpuBandwidth;
    }

    public Long getIndividualCpuMemory() {
        return individualCpuMemory;
    }

    public void setIndividualCpuMemory(Long individualCpuMemory) {
        this.individualCpuMemory = individualCpuMemory;
    }

    public Long getIndividualCpuSpace() {
        return individualCpuSpace;
    }

    public void setIndividualCpuSpace(Long individualCpuSpace) {
        this.individualCpuSpace = individualCpuSpace;
    }

    public Long getTotalCpuTime() {
        return totalCpuTime;
    }

    public void setTotalCpuTime(Long totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
    }

    public Long getTotalCpuCount() {
        return totalCpuCount;
    }

    public void setTotalCpuCount(Long totalCpuCount) {
        this.totalCpuCount = totalCpuCount;
    }

    public Long getTotalPhysicalMemory() {
        return totalPhysicalMemory;
    }

    public void setTotalPhysicalMemory(Long totalPhysicalMemory) {
        this.totalPhysicalMemory = totalPhysicalMemory;
    }

    public Long getTotalVirtualMemory() {
        return totalVirtualMemory;
    }

    public void setTotalVirtualMemory(Long totalVirtualMemory) {
        this.totalVirtualMemory = totalVirtualMemory;
    }

    public Long getTotalDiskSpace() {
        return totalDiskSpace;
    }

    public void setTotalDiskSpace(Long totalDiskSpace) {
        this.totalDiskSpace = totalDiskSpace;
    }

    public Long getTotalResourceCount() {
        return totalResourceCount;
    }

    public void setTotalResourceCount(Long totalResourceCount) {
        this.totalResourceCount = totalResourceCount;
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
