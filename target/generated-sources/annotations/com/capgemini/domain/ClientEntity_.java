package com.capgemini.domain;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClientEntity.class)
public abstract class ClientEntity_ extends com.capgemini.domain.AbstractEntity_ {

	public static volatile SingularAttribute<ClientEntity, String> emailAddress;
	public static volatile SingularAttribute<ClientEntity, String> city;
	public static volatile SingularAttribute<ClientEntity, String> streetAddress;
	public static volatile SingularAttribute<ClientEntity, String> surname;
	public static volatile SingularAttribute<ClientEntity, String> creditCardNumber;
	public static volatile SingularAttribute<ClientEntity, String> name;
	public static volatile SingularAttribute<ClientEntity, Date> dateOfBirth;

}

