package com.capgemini.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.DivisionDao;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.service.DivisionService;
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

@Service
@Transactional
public class DivisionServiceImpl implements DivisionService {
	@Autowired
	private DivisionDao divisionDao;

	public void save(DivisionTo entity) {
		divisionDao.save(entity);

	}

	public DivisionTo getOne(Long id) {
		return divisionDao.getOne(id);
	}

	public DivisionTo findOne(Long id) {
		return divisionDao.findOne(id);
	}

	public List<DivisionEntity> findAll() {
		return divisionDao.findAll();
	}

	public DivisionTo update(DivisionTo entity) {
		return divisionDao.update(entity);
	}

	public void delete(DivisionTo divisionTo) {
		divisionDao.delete(divisionTo);

	}

	public void delete(Long id) {
		divisionDao.delete(id);

	}

	public void deleteAll() {
		divisionDao.deleteAll();

	}

	public long count() {

		return divisionDao.count();
	}

	public boolean exists(Long id) {
		return divisionDao.exists(id);
	}

	@Override
	public List<WorkerTo> findWorkerByDivision(Long id) {
		return divisionDao.findWorkerByDivision(id);
	}

	@Override
	public void addWorkerToDivision(Long divisionId, WorkerTo worker) {
		divisionDao.addWorkerToDivision(divisionId, worker);

	}

	@Override
	public void deleteWorkerFromDivision(Long divisionId, Long workerId) {
		divisionDao.deleteWorkerFromDivision(divisionId, workerId);

	}

	@Override
	public List<WorkerTo> findWorkerByDivisionAndCar(Long divisionId, Long carId) {
		return divisionDao.findWorkerByDivisionAndCar(divisionId, carId);
	}
	@Override
	public List<DivisionTo> findAllTo() {
		return divisionDao.findAllTo();
	}
}
