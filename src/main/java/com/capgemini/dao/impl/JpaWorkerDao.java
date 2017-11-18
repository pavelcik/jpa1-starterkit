package com.capgemini.dao.impl;

import java.util.List;

import java.util.List; 

 
import javax.persistence.EntityManager; 
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;
import com.capgemini.domain.QCarEntity;
import com.capgemini.domain.QDivisionEntity;
import com.capgemini.domain.QWorkerEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.to.WorkerTo;
import com.google.common.collect.Lists;
import com.querydsl.jpa.impl.JPAQuery;

import javafx.concurrent.Worker;

@Repository
public class JpaWorkerDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	WorkerMapper workerMapper;
	
	
	public List<WorkerEntity> findWorkerByCriteria(WorkerSearchCriteria searchCriteria) {
		QWorkerEntity worker = QWorkerEntity.workerEntity;
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<WorkerEntity> query = criteriaBuilder.createQuery(WorkerEntity.class);
		Root<WorkerEntity> root = query.from(WorkerEntity.class);
		List<Predicate> predicates = Lists.newArrayList();
		
		if(searchCriteria.getDivision() !=null) {
			predicates.add(
					criteriaBuilder.equal(root.(worker.), searchCriteria.getDivision())
					);
		}
	}
	
	
	public List<WorkerTo> findWorkersInDivision(Long divisionId) {
		QWorkerEntity worker = QWorkerEntity.workerEntity;
		QDivisionEntity division = QDivisionEntity.divisionEntity;
		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		
		List<WorkerEntity> result = query.select(worker)
				.from(worker).where(worker.division.id.eq(divisionId)).fetch();
		return workerMapper.map2To(result);
	}
	
	public List<WorkerTo> findWorkersByCar(Long carId) {
		QWorkerEntity worker = QWorkerEntity.workerEntity;
		QCarEntity car = QCarEntity.carEntity;
		//JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		List<WorkerEntity> result = query.select(worker,car.id).from(worker).innerJoin(worker.cars,car)
				.where(car.id.eq(carId)).select(worker).fetch();
				
				
		return workerMapper.map2To(result);
	}
	
	public List<WorkerTo> findWorkersByPosition(PositionNames position) {
		QWorkerEntity worker = QWorkerEntity.workerEntity;
		//JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		List<WorkerEntity> result = query.select(worker).from(worker).where(worker.positionName.eq(position))
				.fetch();
				
				
		return workerMapper.map2To(result);
	}
	
}
