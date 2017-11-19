package com.capgemini.dao.impl;

import org.springframework.stereotype.Component;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;

@Component
public class WorkerSearchCriteria {

	private DivisionEntity division;
	private CarEntity car;
	private PositionNames position;

	public DivisionEntity getDivision() {
		return division;
	}

	public void setDivision(DivisionEntity division) {
		this.division = division;
	}

	public CarEntity getCar() {
		return car;
	}

	public void setCar(CarEntity car) {
		this.car = car;
	}

	public PositionNames getPosition() {
		return position;
	}

	public void setPosition(PositionNames position) {
		this.position = position;
	}

}
