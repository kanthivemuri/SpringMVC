package com.gm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class address {
	@Id
	@GeneratedValue
	private int houseno;
@Column	
private String city;
@Column
private String state;
@Column
private String zipcode;


public int getHouseno() {
	return houseno;
}
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "address [houseno=" + houseno + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
}


	
}
