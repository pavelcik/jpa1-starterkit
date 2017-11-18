package com.capgemini.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;
@Component
public class WorkerMapper {

	@PersistenceContext
    private EntityManager entityManager;
	
	public static WorkerTo map(WorkerEntity workerEntity) {
		WorkerTo workerTo = null;
		if(workerEntity!=null) {
			workerTo = new WorkerTo();
			workerTo.setAge(workerEntity.getAge());
			workerTo.setName(workerEntity.getName());
			workerTo.setPositionName(workerEntity.getPositionName());
			workerTo.setSurname(workerEntity.getSurname());
			workerTo.setSupervisedCars(workerEntity.getCars());
			workerTo.setId(workerEntity.getId());
			workerTo.setSupervisedCars(workerEntity.getCars());
		}
		return workerTo;
	}
	
	public static WorkerEntity map(WorkerTo workerTo) {
		WorkerEntity workerEntity = null;
		if(workerTo!=null) {
			workerEntity = new WorkerEntity();
			workerEntity.setAge(workerTo.getAge());
			workerEntity.setName(workerTo.getName());
			workerEntity.setPositionName(workerTo.getPositionName());
			workerEntity.setSurname(workerTo.getSurname());
			workerEntity.setId(workerTo.getId());
			workerEntity.setCars(workerTo.getSupervisedCars());
		}
		return workerEntity;
	}
	
	public static List<WorkerTo> map2To(List<WorkerEntity> workEntities) {
		return workEntities.stream().map(c->map(c)).collect(Collectors.toList());
	}
}
