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
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id",unique = true,nullable = false)
	private Integer employeeId;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phone;
	@Column(name = "hire_date")
	private LocalDate hireDate;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "job_id")
	private Jobs jobs;
	
	@Column(name = "salary")
	private Integer salary;
	@Column(name = "commission_pct")
	private Integer commPact;
	@Column(name = "manager_id")
	private Integer managerId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "department_id",nullable = false)
	private Departments departments;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	
	public Employees(String firstName, String lastName, String email, String phone, LocalDate hireDate, Jobs jobs,
			Integer salary, Integer commPact, Integer managerId, Departments departments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.hireDate = hireDate;
		this.jobs = jobs;
		this.salary = salary;
		this.commPact = commPact;
		this.managerId = managerId;
		this.departments = departments;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public Integer getSalary() {
		return salary;
	}
	public Integer getCommPact() {
		return commPact;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public void setCommPact(Integer commPact) {
		this.commPact = commPact;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
}
