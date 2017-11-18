package com.capgemini.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.ClientEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.RentDetailsEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RentDetailsEntity.class)
public abstract class RentDetailsEntity_ extends AbstractEntity_ {

	public static volatile SingularAttribute<RentDetailsEntity, DivisionEntity> placeOfReturn;
	public static volatile SingularAttribute<RentDetailsEntity, ClientEntity> clientId;
	public static volatile SingularAttribute<RentDetailsEntity, DivisionEntity> placeOfRent;
	public static volatile SingularAttribute<RentDetailsEntity, CarEntity> car;
	public static volatile SingularAttribute<RentDetailsEntity, Date> rental_date;
	public static volatile SingularAttribute<RentDetailsEntity, Date> return_date;

}

