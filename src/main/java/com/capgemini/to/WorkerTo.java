package com.capgemini.to;

import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;
import com.capgemini.domain.WorkerEntity;

public class WorkerTo {
	private Long id;
	private PositionNames positionName;
	private String name;
	private String surname;
	private int age;
	private DivisionEntity division;
	
	
	private List<CarEntity> supervisedCars;

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

	public DivisionEntity getDivision() {
		return division;
	}

	public void setDivision(DivisionEntity division) {
		this.division = division;
	}

	public List<CarEntity> getSupervisedCars() {
		return supervisedCars;
	}

	public void setSupervisedCars(List<CarEntity> supervisedCars) {
		this.supervisedCars = supervisedCars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	
	
	
}
