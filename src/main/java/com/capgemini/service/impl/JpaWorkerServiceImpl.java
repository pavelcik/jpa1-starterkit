package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.impl.JpaWorkerDao;
import com.capgemini.domain.PositionNames;
import com.capgemini.domain.QWorkerEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.service.JpaWorkerService;
import com.capgemini.to.WorkerTo;
import com.querydsl.jpa.impl.JPAQuery;

@Service
public class JpaWorkerServiceImpl implements JpaWorkerService {

	@Autowired
	private JpaWorkerDao jpaWorkerDao;

	@Override
	public List<WorkerTo> findWorkersInDivision(Long divisionId) {

		return jpaWorkerDao.findWorkersInDivision(divisionId);
	}

	@Override
	public List<WorkerTo> findWorkersByCar(Long carId) {

		return jpaWorkerDao.findWorkersByCar(carId);
	}

	public List<WorkerTo> findWorkersByPosition(PositionNames position) {
		return jpaWorkerDao.findWorkersByPosition(position);
	}

}
