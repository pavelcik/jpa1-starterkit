package com.capgemini.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkerEntity.class)
public abstract class WorkerEntity_ extends com.capgemini.domain.AbstractEntity_ {

	public static volatile SingularAttribute<WorkerEntity, PositionNames> positionName;
	public static volatile SingularAttribute<WorkerEntity, DivisionEntity> division;
	public static volatile ListAttribute<WorkerEntity, CarEntity> cars;
	public static volatile SingularAttribute<WorkerEntity, String> surname;
	public static volatile SingularAttribute<WorkerEntity, String> name;
	public static volatile SingularAttribute<WorkerEntity, Integer> age;

}

