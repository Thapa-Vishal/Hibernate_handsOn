package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Jobs {
	@Id
	@Column(name="job_id",nullable = true,unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobId;
	
	@Column(name = "job_table")
	private String jobTitle;
	@Column(name = "min_salary")
	private Integer minSalary;
	@Column(name = "max_salary")
	private Integer maxSalary;
	
	public Jobs() {
		// TODO Auto-generated constructor stub
	}
	
	public Jobs( String jobTitle, Integer minSalary, Integer maxSalary) {
		super();
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	
	public Integer getJobId() {
		return jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public Integer getMinSalary() {
		return minSalary;
	}
	public Integer getMaxSalary() {
		return maxSalary;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}
	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}
	
	
}
