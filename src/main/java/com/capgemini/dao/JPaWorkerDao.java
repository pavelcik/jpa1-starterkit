package com.capgemini.dao;

import java.util.List;

import com.capgemini.dao.impl.WorkerSearchCriteria;
import com.capgemini.to.WorkerTo;

public interface JPaWorkerDao {

	List<WorkerTo> findWorkerByCriteria(WorkerSearchCriteria searchCriteria);

}