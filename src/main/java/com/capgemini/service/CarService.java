package com.capgemini.service;

import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

public interface CarService {

	List<CarTo> findCarByType(String carType);

	List<CarTo> findCarByBrand(String carBrand);

	List<CarTo> findCarByWorker(WorkerTo worker);

	CarTo updateDetails(CarTo carTo);

	void deleteCar(CarTo carTo);

	void delete(Long id);

	void save(CarTo carTo);

	List<CarTo> findAllCars();

	public List<CarTo> findCarByBrandAndType(String carBrand, String carType);

	void addCarToWorker(Long id, Long carId);

	public CarTo findOne(Long id);

	WorkerTo findWorkerById(Long id);

	public CarEntity findOneCarEntity(Long id);

}
