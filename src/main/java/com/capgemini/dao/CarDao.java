package com.capgemini.dao;

import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

public interface CarDao {
	void save(CarTo carTo);

	List<CarTo> findCarByType(String carType);

	List<CarTo> findCarByBrand(String carBrand);

	List<CarTo> findCarByBrandAndType(String carBrand, String carType);

	List<CarTo> findCarByWorker(WorkerTo worker);

	CarTo updateDetails(CarTo carTo);

	void deleteCar(CarTo carTo);

	void delete(Long id);

	List<CarTo> findAllCars();

	CarEntity findOne(Long id);

	void addCarToWorker(Long workerId, Long carId);

	WorkerTo findWorkerById(Long id);

	CarEntity getOne(Long id);

}
