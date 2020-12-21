package com.cts.training.entity;

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
@Table(name = "departments")
public class Departments {
	@Id
	@Column(name = "dept_id",nullable = false,unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	
	@Column(name = "dept_name")
	private String deptname;
	@Column(name="manager_id")
	private Integer managerId;
	@ManyToOne(optional = false)
	@JoinColumn(name = "location_id",nullable = false)
	private Locations locations;
	
	public Departments() {
		// TODO Auto-generated constructor stub
	}
	
	public Departments(String deptname, Integer managerId, Locations locations) {
		super();
		this.deptname = deptname;
		this.managerId = managerId;
		this.locations = locations;
	}
	public Locations getLocations() {
		return locations;
	}
	public void setLocations(Locations locations) {
		this.locations = locations;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	
	
}
