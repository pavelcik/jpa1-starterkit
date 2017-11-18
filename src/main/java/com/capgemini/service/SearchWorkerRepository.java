package com.capgemini.service;

import java.util.List;

import com.capgemini.dao.impl.WorkerSearchCriteria;
import com.capgemini.domain.WorkerEntity;

public interface SearchWorkerRepository {

	public List<WorkerEntity> findWorkerByCriteria(WorkerSearchCriteria searchCriteria);
}
