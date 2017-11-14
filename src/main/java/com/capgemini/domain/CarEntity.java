package com.capgemini.domain;

import java.time.Year;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarEntity extends AbstractEntity {

@Column(name="CAR_NAME")
private String carName;
@Column(name="car_type")
private String type;
@Column(name="car_brand")
private String brand;
@Column(name="production_year")
private Year productionYear;
private String color;
@Column(name="engine_capacity")
private float engineCapacity;
private float mileage;
@Column(name="engine_powers")
private int enginePower;
private int priceByDay;

@ManyToMany
private List<WorkerEntity> workers;




}
