package com.capgemini.service;

import java.util.List;

import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

public interface DivisionService {
	public void save(DivisionTo entity);

	
	public DivisionTo getOne(Long id);

	
	public DivisionTo findOne(Long id);

	
	public List<DivisionTo> findAll();
	
	public DivisionTo update(DivisionTo entity);
	
	public void delete(DivisionTo entity);

	
	public void delete(Long id);

	
	public void deleteAll();

	
	public long count();

	
	public boolean exists(Long id);
	
	public List<WorkerTo> findWorkerByDivision(Long id);
}