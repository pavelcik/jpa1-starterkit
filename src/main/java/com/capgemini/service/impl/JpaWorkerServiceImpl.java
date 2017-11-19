package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.impl.JpaWorkerDaoImpl;
import com.capgemini.dao.impl.WorkerSearchCriteria;
import com.capgemini.service.JpaWorkerService;
import com.capgemini.to.WorkerTo;

@Service
public class JpaWorkerServiceImpl implements JpaWorkerService {

	@Autowired
	private JpaWorkerDaoImpl jpaWorkerDao;
	@Override
	public List<WorkerTo> findWorkerByCriteria(WorkerSearchCriteria searchCriteria) {
		return jpaWorkerDao.findWorkerByCriteria(searchCriteria);
	}
}
	