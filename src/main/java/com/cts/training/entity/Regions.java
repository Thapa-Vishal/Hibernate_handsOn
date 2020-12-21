package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions {
	@Id
	@Column(name = "region_id" ,unique = true ,nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regionId;
	
	@Column(name = "region_name")
	private String regionName;
	
	public Regions() {
		// TODO Auto-generated constructor stub
	}
	
	public Regions(String regionName) {
		super();
		this.regionName = regionName;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", regionName=" + regionName + "]";
	}
	
	
}
