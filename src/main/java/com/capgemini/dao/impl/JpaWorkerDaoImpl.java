package com.capgemini.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.JPaWorkerDao;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.WorkerMapper;
import com.capgemini.model.QWorkerEntity;
import com.capgemini.to.WorkerTo;
import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class JpaWorkerDaoImpl implements JPaWorkerDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private WorkerMapper mapper;

	@Override
	public List<WorkerTo> findWorkerByCriteria(WorkerSearchCriteria searchCriteria) {
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
		return mapper.map2To(
				query.select(worker).from(worker).where(predicates.toArray(new Predicate[predicates.size()])).fetch());
	}

}
