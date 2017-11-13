package com.capgemini.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class ClientEntity extends AbstractEntity {
@Id
private int clientId;
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
}
