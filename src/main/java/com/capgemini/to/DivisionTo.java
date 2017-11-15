package com.capgemini.to;

import java.util.List;

import com.capgemini.domain.WorkerEntity;

public class DivisionTo extends AbstractDto {
	
	private String City;
	private String streetAddress;
	private int phoneNumber;
	private String emailAddress;
	private List<WorkerEntity> divisionWorkers;
	
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
