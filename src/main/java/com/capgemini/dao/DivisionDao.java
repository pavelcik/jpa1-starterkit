package com.capgemini.dao;

import java.util.List;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

public interface DivisionDao {

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

	void addWorkerToDivision(Long divisionId, WorkerTo worker);

	void deleteWorkerFromDivision(Long divisionId, Long workerId);

	List<WorkerTo> findWorkerByDivisionAndCar(Long divisionId, Long carId);

	DivisionEntity findOneEntity(Long id);

	public List<DivisionTo> findAllTo();
}
