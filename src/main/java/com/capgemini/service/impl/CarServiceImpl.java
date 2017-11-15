package com.capgemini.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.CarDao;
import com.capgemini.dao.impl.CarDaoImpl;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.service.CarService;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;
@Service
@Transactional
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDaoImpl carDao;
	
	
	@Override
	public CarTo save(CarTo carTo) {
		return null;
	}

	@Override
	public List<CarTo> findCarByType(String carType) {
		List<CarTo> foundCars = carDao.findCarByType(carType);
		return foundCars;
	}

	@Override
	public List<CarTo> findCarByBrand(String carBrand) {
		List<CarTo> foundCars = carDao.findCarByBrand(carBrand);
		return foundCars;
	}

	@Override
	public List<CarTo> findCarByWorker(WorkerTo worker) {
		List<CarTo> foundCars = carDao.findCarByWorker(worker);
		return foundCars;
	}

	@Override
	public CarTo updateDetails(CarTo carTo) {
		CarTo updatedCar = carDao.update(carTo);
		return updatedCar;
	}

	@Override
	public void deleteCar(CarTo to) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCarToWorker(WorkerTo worker) {
		// TODO Auto-generated method stub

	}
	
	@SuppressWarnings("unchecked")
	public List<CarTo> findAllCars() {
		return carDao.findAll();
	}


}
