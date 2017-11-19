package com.capgemini.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workers")
public class WorkerEntity extends AbstractEntity {

	@Enumerated(EnumType.STRING)
	private PositionNames positionName;
	private String name;
	private String surname;
	private int age;

	@ManyToMany(mappedBy = "workers", cascade = CascadeType.REMOVE)
	private List<CarEntity> cars;

	@ManyToOne
	private DivisionEntity division;

	public List<CarEntity> getCars() {
		return cars;
	}

	public void setCars(List<CarEntity> cars) {
		this.cars = cars;
	}

	public PositionNames getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionNames positionName) {
		this.positionName = positionName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
