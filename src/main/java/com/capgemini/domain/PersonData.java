package com.capgemini.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonData {

	private String firstName;
	private String surname;
	@Column(columnDefinition="DATE",nullable=false)
	private Date dateOfBirth;
	
}
