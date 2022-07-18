package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Company_ID")
	private Integer id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@Embedded
	private ContactPerson contactPerson;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Company(Integer id, String name, String address, ContactPerson contactPerson) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactPerson = contactPerson;
	}

	public Company() {
		super();
	}
	
	

}
