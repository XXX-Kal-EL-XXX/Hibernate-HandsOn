package com.hibernate;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id")
	private int id;
	
	@Column(name = "Street")
	private String street;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name = "Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Column(name="Images")
	@Lob
	private byte[] image;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int id, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	public Address() {
		super();
	}
	

}
