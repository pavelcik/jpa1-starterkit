package com.capgemini.model;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;
import com.capgemini.domain.WorkerEntity;

@StaticMetamodel(WorkerEntity.class)
public abstract class WorkerEntity_ {

	
	
	public static volatile SingularAttribute<PositionNames, String> positionName;
	public static volatile SingularAttribute<WorkerEntity, String> name;
	public static volatile SingularAttribute<WorkerEntity, String> surname;
	public static volatile SingularAttribute<WorkerEntity, Integer>age;
	public static volatile ListAttribute<CarEntity, CarEntity> cars;
	public static volatile SingularAttribute<DivisionEntity, DivisionEntity>division;
	
	
	
}
