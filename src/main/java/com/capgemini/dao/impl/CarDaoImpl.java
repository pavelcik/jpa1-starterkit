package com.capgemini.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.CarDao;
import com.capgemini.dao.Dao;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.CarMapper;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

@Repository
public class CarDaoImpl extends AbstractDao implements CarDao {
	
	@Autowired
	private CarMapper mapper;
	@Autowired
	private WorkerMapper workerMapper;

	 @PersistenceContext
	 protected EntityManager entityManager;

	@Override
	public List<CarTo> findCarByType(String carType) {
		TypedQuery<CarEntity> query = entityManager.createQuery(
				"select car from CarEntity car where upper(carType) like concat(upper(:carType), '%')",
				CarEntity.class);
		query.setParameter("carType", carType);

		return mapper.map2To(query.getResultList());
	}

	@Override
	public List<CarTo> findCarByBrand(String carBrand) {
		TypedQuery<CarEntity> query = entityManager.createQuery(
				"select car from CarEntity car where upper(carBrand) like concat(upper(:carBrand), '%')",
				CarEntity.class);
		query.setParameter("carBrand", carBrand);
		return mapper.map2To(query.getResultList());
	}

	@Override
	public List<CarTo> findCarByWorker(WorkerTo worker) {
		WorkerEntity workerEntity = new WorkerEntity();
		workerEntity = workerMapper.map(worker);
		List<CarEntity> foundCars = new ArrayList<>();
		for (int i = 0; i < workerEntity.getCars().size(); i++) {
			
			if (workerEntity.getCars().get(i).getId() == workerEntity.getId()) {
				foundCars.add(workerEntity.getCars().get(i));
			}
		}
		return mapper.map2To(foundCars);
		
	}

	@Override
	public CarTo updateDetails(CarTo carTo) {
		CarEntity updatedCar = entityManager.merge(mapper.map(carTo));
		return mapper.map(updatedCar);
	}

	@Override
	public void deleteCar(CarEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCarToWorker(WorkerTo worker) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void save(CarTo carTo) {
		CarEntity carEntity = mapper.map(carTo);
		entityManager.persist(carEntity);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	


}