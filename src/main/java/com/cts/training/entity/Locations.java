package com.cts.training.entity;

import javax.persistence.CascadeType;
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
@Table(name = "locations")
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "location_id",unique = true ,nullable = false)
	private Integer locationId;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "postal_code")
	private Integer postCode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state_province")
	private String stateProvince;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="country_id",nullable = false)
	private Countries country;
	
	
	public Locations() {
		// TODO Auto-generated constructor stub
	}
	
	public Locations(String street, Integer postCode, String city, String stateProvince,
			Countries country) {
		super();
		this.street = street;
		this.postCode = postCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.country = country;
	}
	
	public Countries getCountry() {
		return country;
	}
	public void setCountry(Countries country) {
		this.country = country;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public String getStreet() {
		return street;
	}
	public Integer getPostCode() {
		return postCode;
	}
	public String getCity() {
		return city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
}
