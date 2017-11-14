package com.capgemini.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rent_details")
public class RentDetailsEntity extends AbstractEntity {


@ManyToOne
@JoinColumn(name="CLIENT_ID")
private ClientEntity clientId;
@ManyToOne
@JoinColumn(name="CAR_ID")
private CarEntity carId;
private Date rental_date;

private Date return_date;

private DivisionEntity placeOfRent;
private DivisionEntity placeOfReturn;

}