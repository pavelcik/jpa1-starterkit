package com.capgemini.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CarEntity.class)
public abstract class CarEntity_ extends com.capgemini.domain.AbstractEntity_ {

	public static volatile SingularAttribute<CarEntity, String> carType;
	public static volatile SingularAttribute<CarEntity, String> carBrand;
	public static volatile SingularAttribute<CarEntity, String> color;
	public static volatile SingularAttribute<CarEntity, String> carName;
	public static volatile SingularAttribute<CarEntity, Integer> productionYear;
	public static volatile SingularAttribute<CarEntity, Integer> enginePower;
	public static volatile ListAttribute<CarEntity, RentDetailsEntity> rents;
	public static volatile ListAttribute<CarEntity, WorkerEntity> workers;
	public static volatile SingularAttribute<CarEntity, Float> engineCapacity;
	public static volatile SingularAttribute<CarEntity, Integer> priceByDay;
	public static volatile SingularAttribute<CarEntity, Float> mileage;

}

