package com.capgemini.domain;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RentDetailsEntity.class)
public abstract class RentDetailsEntity_ extends com.capgemini.domain.AbstractEntity_ {

	public static volatile SingularAttribute<RentDetailsEntity, ClientEntity> clientId;
	public static volatile SingularAttribute<RentDetailsEntity, Date> rental_date;
	public static volatile SingularAttribute<RentDetailsEntity, Date> return_date;

}

