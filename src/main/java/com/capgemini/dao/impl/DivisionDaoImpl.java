package com.capgemini.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.DivisionDao;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.DivisionMapper;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

@Repository
public class DivisionDaoImpl  implements DivisionDao  {

	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	DivisionMapper divisionMapper;
	@Autowired
	WorkerMapper workerMapper;
	
	@Override
	public void save(DivisionTo entity) {
		entityManager.persist(divisionMapper.map(entity));
		
	}

	@Override
	public DivisionTo getOne(Long id) {
		return divisionMapper.map(entityManager.getReference(DivisionEntity.class, id));
	}

	@Override
	public DivisionTo findOne(Long id) {
		return divisionMapper.map(entityManager.find(DivisionEntity.class, id));
	}

	@Override
	public List<DivisionTo> findAll() {
		 CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	        CriteriaQuery<DivisionEntity> criteriaQuery = builder.createQuery(DivisionEntity.class);
	        criteriaQuery.from(DivisionEntity.class);
	        TypedQuery<DivisionEntity> query = entityManager.createQuery(criteriaQuery);
	        return divisionMapper.map2To(query.getResultList());
	}

	@Override
	public DivisionTo update(DivisionTo entity) {
		return  divisionMapper.map(entityManager.merge(divisionMapper.map(entity)));
	}

	@Override
	public void delete(DivisionTo entity) {
		 entityManager.remove(divisionMapper.map(entity));
		
	}

	@Override
	public void delete(Long id) {
		 entityManager.remove(divisionMapper.map(getOne(id)));
		
	}

	@Override
	public void deleteAll() {
		 entityManager.createQuery("delete " + DivisionEntity.class).executeUpdate();
		
	}

	@Override
	public long count() {
		
		 return (long) entityManager.createQuery("Select count(*) from " + DivisionEntity.class).getSingleResult();
	}

	@Override
	public boolean exists(Long id) {
		 return findOne(id) != null;
	}

	@Override
	public List<WorkerTo> findWorkerByDivision(Long id) {
		// TODO Auto-generated method stub
		DivisionEntity division = entityManager.find(DivisionEntity.class, id);
		return workerMapper.map2To(division.getDivisionWorkers());
	}

}
