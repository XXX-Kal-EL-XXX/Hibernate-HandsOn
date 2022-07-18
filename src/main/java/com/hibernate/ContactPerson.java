package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactPerson {
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Contact")
	private String phone;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ContactPerson(String firstName, String lastName, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	public ContactPerson() {
		super();
		}
	
	

}
