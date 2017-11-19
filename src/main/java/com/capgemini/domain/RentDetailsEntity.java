package com.capgemini.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rent_details")
public class RentDetailsEntity extends AbstractEntity {

	@OneToOne
	@JoinColumn(name = "CLIENT_ID")
	private ClientEntity clientId;

	private Date rental_date;

	private Date return_date;

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

}