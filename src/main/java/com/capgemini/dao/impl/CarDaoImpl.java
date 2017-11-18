package com.capgemini.dao.impl;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.CarDao;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.CarMapper;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private CarMapper mapper;
	@Autowired
	private WorkerMapper workerMapper;

	 @PersistenceContext
	 private EntityManager entityManager;

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
	
	
	public List<CarTo> findCarByBrandAndType(String carBrand,String carType) {
		TypedQuery<CarEntity> query = entityManager.createQuery(
				"select car from CarEntity car where upper(carBrand) like concat(upper(:carBrand), '%') and upper(carType) like concat(upper(:carType), '%')",
				CarEntity.class);
		query.setParameter("carBrand", carBrand).setParameter("carType", carType);
		return mapper.map2To(query.getResultList());
	}

	@Override
	public List<CarTo> findCarByWorker(WorkerTo worker) {
		WorkerEntity workerEntity = entityManager.find(WorkerEntity.class, worker.getId());
		return mapper.map2To(workerEntity.getCars());
		
	}

	@Override
	public CarTo updateDetails(CarTo carTo) {
		CarEntity entity = CarMapper.map(carTo);
		//entity = findOne(entity.getId());
		return  mapper.map(entityManager.merge(entity));
	}
	
	@Override
	
	public void deleteCar(CarTo carTo) {
			CarEntity entity = mapper.map(carTo);
	       	Long id = entity.getId();
	       	entity = entityManager.merge(entity);  
	       	entityManager.remove(entity);  
	}

	@Override
	public void addCarToWorker(Long workerId,Long carId) {
		WorkerEntity workerEntity = entityManager.find(WorkerEntity.class, workerId);
		CarEntity car = entityManager.find(CarEntity.class, carId);
		workerEntity.getCars().add(car);
	}

	@Override
	public CarEntity findOne(Long id) {
		return entityManager.find(CarEntity.class, id);
	}
	
	public CarTo findOneTo(Long id) {
		return CarMapper.map(entityManager.find(CarEntity.class, id));
	}

	@Override
	public void save(CarTo carTo) {
		CarEntity carEntity = mapper.map(carTo);
		entityManager.persist(carEntity);
	

	}

	@Override
	public void delete(Long id) {
		 entityManager.remove(getOne(id));
		
	}

	@Override
	public List<CarTo> findAllCars() {
		 	CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	        CriteriaQuery<CarEntity> criteriaQuery = builder.createQuery(CarEntity.class);
	        criteriaQuery.from(CarEntity.class);
	        TypedQuery<CarEntity> query = entityManager.createQuery(criteriaQuery);
	        return mapper.map2To(query.getResultList());
	}
	
	public WorkerTo findWorkerById(Long id) {
		return workerMapper.map(entityManager.find(WorkerEntity.class, id));
	}

	@Override
	public CarEntity getOne(Long id) {
		 return entityManager.getReference(CarEntity.class, id);
	}
	
	
}