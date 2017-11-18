package com.capgemini.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.WorkerEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DivisionEntity.class)
public abstract class DivisionEntity_ extends AbstractEntity_ {

	public static volatile ListAttribute<DivisionEntity, WorkerEntity> divisionWorkers;
	public static volatile SingularAttribute<DivisionEntity, String> emailAddress;
	public static volatile SingularAttribute<DivisionEntity, Integer> phoneNumber;
	public static volatile SingularAttribute<DivisionEntity, String> streetAddress;
	public static volatile SingularAttribute<DivisionEntity, String> City;

}

