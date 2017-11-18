package com.capgemini.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String carName;
	private String carType;
	private String carBrand;
	private int productionYear;
	private String color;
	private float engineCapacity;
	private float mileage;
	private int enginePower;
	private int priceByDay;

	@ManyToMany
	private List<WorkerEntity> workers;

	@OneToMany(mappedBy = "car", fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval=true)
	private List<RentDetailsEntity> rents;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public int getPriceByDay() {
		return priceByDay;
	}

	public void setPriceByDay(int priceByDay) {
		this.priceByDay = priceByDay;
	}

	public List<WorkerEntity> getWorkers() {
		return workers;
	}

	public void setWorkers(List<WorkerEntity> workers) {
		this.workers = workers;
	}

	public List<RentDetailsEntity> getRents() {
		return rents;
	}

	public void setRents(List<RentDetailsEntity> rents) {
		this.rents = rents;
	}

}
