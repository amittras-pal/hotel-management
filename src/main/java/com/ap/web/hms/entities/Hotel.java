package com.ap.web.hms.entities;


import java.util.List;

import jakarta.persistence.Column;

// A hotel is the singular establishment for which the entire system works. There is only one record in this collection. It has the following information.

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(columnDefinition = "character varying(60) NOT NULL")
	private String name;
	
	@Column(columnDefinition = "character varying(240) NOT NULL")
	private String address;
	
	@Column(name = "phone_numbers", columnDefinition = "character varying(12)[] NOT NULL")
	private List<String> phoneNumbers;
	
	@Column(columnDefinition = "character varying(50) NOT NULL")
	private String email;
	
	@Column(name = "map_link", columnDefinition = "character varying(240)")
	private String mapLink;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMapLink() {
		return mapLink;
	}

	public void setMapLink(String mapLink) {
		this.mapLink = mapLink;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ ", email=" + email + ", mapLink=" + mapLink + "]";
	}
}
