package com.capgemini.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

public interface DivisionDao extends Dao<DivisionTo, Long> {
	
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
