package com.capgemini.service;

import java.util.List;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

public interface DivisionService {
	public void save(DivisionTo entity);

	public DivisionTo getOne(Long id);

	public DivisionTo findOne(Long id);

	public List<DivisionEntity> findAll();

	public DivisionTo update(DivisionTo entity);

	public void delete(DivisionTo entity);

	public void delete(Long id);

	public void deleteAll();

	public long count();

	public boolean exists(Long id);

	public List<WorkerTo> findWorkerByDivision(Long id);

	public void addWorkerToDivision(Long divisionId, WorkerTo worker);

	public void deleteWorkerFromDivision(Long divisionId, Long workerId);

	public List<WorkerTo> findWorkerByDivisionAndCar(Long divisionId, Long carId);

	List<DivisionTo> findAllTo();
	
	public DivisionEntity findOneEntity(Long id);
}
