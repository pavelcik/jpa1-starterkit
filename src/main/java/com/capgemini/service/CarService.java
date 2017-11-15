package com.capgemini.service;

import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

public interface CarService {


 	List<CarTo> findCarByType(String carType);
    
 	List<CarTo> findCarByBrand(String carBrand);
    
 	List<CarTo> findCarByWorker(WorkerTo worker);

 	CarTo updateDetails(CarTo carTo);

    void deleteCar(CarTo carTo);

    void delete(Long id);

    void addCarToWorker(WorkerTo worker);
    
	CarTo save(CarTo carTo);
	
	List<CarTo> findAllCars();
}
