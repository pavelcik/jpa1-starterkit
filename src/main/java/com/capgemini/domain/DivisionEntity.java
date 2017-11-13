package com.capgemini.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="division")
public class DivisionEntity {

@Id
private String divisionId;
private String City;
private String streetAddress;
private int phoneNumber;
private String emailAddress;
@OneToMany(mappedBy = "division")
private List<WorkerEntity> workers;
@OneToMany(mappedBy = "division")
private List<RentDetailsEntity> rents;
}
