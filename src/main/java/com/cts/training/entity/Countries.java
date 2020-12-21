package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {
	@Id
	@Column(name = "country_id",unique = true ,nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer countryId;
	@Column(name = "country_name")
	private String countryName;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "region_id",nullable = false)
	private Regions region;
	

	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

	public Countries() {
		
	}

	public Countries(String countryName, Regions region) {
		super();
		this.countryName = countryName;
		this.region = region;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}


	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName=" + countryName + ", region=" + region + "]";
	}

	
}
