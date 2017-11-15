package com.capgemini.dao;

import java.io.Serializable;
import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

public interface CarDao {
	 	void save(CarTo carTo);

	 	List<CarTo> findCarByType(String carType);
	    
	 	List<CarTo> findCarByBrand(String carBrand);
	    
	 	List<CarTo> findCarByWorker(WorkerTo worker);

	 	CarTo updateDetails(CarTo carTo);

	    void deleteCar(CarEntity entity);

	    void delete(Long id);

	    void addCarToWorker(WorkerTo workerTo);
	   

}
