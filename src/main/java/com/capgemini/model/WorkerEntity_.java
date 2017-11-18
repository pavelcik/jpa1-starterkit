package com.capgemini.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;
import com.capgemini.domain.WorkerEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkerEntity.class)
public abstract class WorkerEntity_ extends AbstractEntity_ {

	public static volatile SingularAttribute<WorkerEntity, PositionNames> positionName;
	public static volatile SingularAttribute<WorkerEntity, DivisionEntity> division;
	public static volatile ListAttribute<WorkerEntity, CarEntity> cars;
	public static volatile SingularAttribute<WorkerEntity, String> surname;
	public static volatile SingularAttribute<WorkerEntity, String> name;
	public static volatile SingularAttribute<WorkerEntity, Integer> age;

}

