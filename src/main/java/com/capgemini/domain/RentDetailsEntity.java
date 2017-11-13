package com.capgemini.domain;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rent_details")
public class RentDetailsEntity {

@Id
private int rentId;

@ManyToOne
@JoinColumn(name="CLIENT_ID")
private int clientId;

@ManyToOne
@JoinColumn(name="CAR_ID")
private int carId;

private Date rental_date;

private Date return_date;

@ManyToOne
@JoinColumn(name="division_id")
private DivisionEntity placeOfRent;

@ManyToOne
@JoinColumn(name="division_id")
private DivisionEntity placeOfReturn;

}
