package com.cts.training.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_history")
public class JobHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "job_history_id")
	private Integer history_id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "employee_id",nullable = false)
	private Employees employees;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate enddate;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "job_id",nullable = false)
	private Jobs jobs;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "dept_id",nullable = false)
	private Departments departments;
	
	public JobHistory() {
		// TODO Auto-generated constructor stub
	}
	
	public JobHistory(LocalDate startDate, LocalDate enddate, Jobs jobs, Departments departments) {
		super();

		this.startDate = startDate;
		this.enddate = enddate;
		this.jobs = jobs;
		this.departments = departments;
	}
	public Integer getHistory_id() {
		return history_id;
	}

	public void setHistory_id(Integer history_id) {
		this.history_id = history_id;
	}
	
	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public Jobs getJobs() {
		return jobs;
	}
	public Departments getDepartments() {
		return departments;
	}
	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}
	public void setDepartments(Departments departments) {
		this.departments = departments;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	
}
