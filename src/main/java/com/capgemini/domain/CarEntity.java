package com.capgemini.domain;

import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarEntity extends AbstractEntity {

@Id	
private String carId;
private String carName;
private String type;
private String brand;
private Year productionYear;
private String color;
private float engineCapacity;
private float mileage;
private int enginePower;
private int priceByDay;





}
