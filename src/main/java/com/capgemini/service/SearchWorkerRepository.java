package com.capgemini.service;

import java.util.List;

import com.capgemini.dao.impl.WorkerSearchCriteria;
import com.capgemini.to.WorkerTo;

public interface SearchWorkerRepository {

	public List<WorkerTo> findWorkerByCriteria(WorkerSearchCriteria searchCriteria);
}
