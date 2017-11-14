package com.capgemini.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
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

}
