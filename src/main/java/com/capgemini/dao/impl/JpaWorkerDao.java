package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.model.QCarEntity;
import com.capgemini.model.QDivisionEntity;
import com.capgemini.model.QWorkerEntity;
import com.capgemini.service.SearchWorkerRepository;
import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class JpaWorkerDao implements SearchWorkerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<WorkerEntity> findWorkerByCriteria(WorkerSearchCriteria searchCriteria) {
		QWorkerEntity worker = QWorkerEntity.workerEntity;
		

		List<Predicate> predicates = Lists.newArrayList();

		if (searchCriteria.getDivision() != null) {
			predicates.add(worker.division.id.eq(searchCriteria.getDivision().getId()));
		}
		if (searchCriteria.getCar() != null) {

			predicates.add(worker.cars.contains(searchCriteria.getCar())

			);
		}
		if (searchCriteria.getPosition() != null) {
			predicates.add(worker.positionName.eq(searchCriteria.getPosition()));
		}

		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		return query.select(worker).from(worker).where(predicates.toArray(new Predicate[predicates.size()])).fetch();
	}

}
