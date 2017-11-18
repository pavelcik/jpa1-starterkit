package com.capgemini.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="division")
public class DivisionEntity extends AbstractEntity {


private String City;
private String streetAddress;
private int phoneNumber;
private String emailAddress;

@OneToMany(mappedBy="division",cascade=CascadeType.REMOVE)
private List<WorkerEntity> divisionWorkers = new ArrayList<WorkerEntity>();

public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getStreetAddress() {
	return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public List<WorkerEntity> getDivisionWorkers() {
	return divisionWorkers;
}
public void setDivisionWorkers(List<WorkerEntity> divisionWorkers) {
	this.divisionWorkers = divisionWorkers;
}


}
