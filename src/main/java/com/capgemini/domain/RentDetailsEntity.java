package com.capgemini.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rent_details")
public class RentDetailsEntity extends AbstractEntity {

	
@OneToOne
@JoinColumn(name="CLIENT_ID")
private ClientEntity clientId;

private Date rental_date;

private Date return_date;
@ManyToOne(cascade=CascadeType.REMOVE)
private DivisionEntity placeOfRent ;
@ManyToOne(cascade=CascadeType.REMOVE)
private DivisionEntity placeOfReturn;
public ClientEntity getClientId() {
	return clientId;
}
public void setClientId(ClientEntity clientId) {
	this.clientId = clientId;
}


public Date getRental_date() {
	return rental_date;
}
public void setRental_date(Date rental_date) {
	this.rental_date = rental_date;
}
public Date getReturn_date() {
	return return_date;
}
public void setReturn_date(Date return_date) {
	this.return_date = return_date;
}
public DivisionEntity getPlaceOfRent() {
	return placeOfRent;
}
public void setPlaceOfRent(DivisionEntity placeOfRent) {
	this.placeOfRent = placeOfRent;
}
public DivisionEntity getPlaceOfReturn() {
	return placeOfReturn;
}
public void setPlaceOfReturn(DivisionEntity placeOfReturn) {
	this.placeOfReturn = placeOfReturn;
}


}