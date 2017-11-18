package com.capgemini.to;

import java.sql.Date;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.ClientEntity;
import com.capgemini.domain.DivisionEntity;

public class RentDetailsTo extends AbstractDto {

	private ClientEntity clientId;
	private Date rental_date;
	private Date return_date;
	private DivisionEntity placeOfRent;
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
