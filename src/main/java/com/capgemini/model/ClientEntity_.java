package com.capgemini.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.capgemini.domain.ClientEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClientEntity.class)
public abstract class ClientEntity_ extends AbstractEntity_ {

	public static volatile SingularAttribute<ClientEntity, String> emailAddress;
	public static volatile SingularAttribute<ClientEntity, String> city;
	public static volatile SingularAttribute<ClientEntity, String> streetAddress;
	public static volatile SingularAttribute<ClientEntity, String> surname;
	public static volatile SingularAttribute<ClientEntity, String> creditCardNumber;
	public static volatile SingularAttribute<ClientEntity, String> name;
	public static volatile SingularAttribute<ClientEntity, Date> dateOfBirth;

}

