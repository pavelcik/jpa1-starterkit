package com.capgemini.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class ClientEntity extends AbstractEntity {

private String name;
private String surname;
@Column(name="date_of_birth")
private Date dateOfBirth;
private String city;
@Column(name="street_address")
private String streetAddress;
@Column(name="credit_card_number")
private String creditCardNumber;
@Column(name="email_address")
private String emailAddress;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreetAddress() {
	return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public String getCreditCardNumber() {
	return creditCardNumber;
}
public void setCreditCardNumber(String creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


}
