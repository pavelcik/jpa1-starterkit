package com.capgemini.model;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.capgemini.domain.PersonData;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.BeanPath;
import com.querydsl.core.types.dsl.DatePath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QPersonData is a Querydsl query type for PersonData
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPersonData extends BeanPath<PersonData> {

    private static final long serialVersionUID = -347757675L;

    public static final QPersonData personData = new QPersonData("personData");

    public final DatePath<java.sql.Date> dateOfBirth = createDate("dateOfBirth", java.sql.Date.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath surname = createString("surname");

    public QPersonData(String variable) {
        super(PersonData.class, forVariable(variable));
    }

    public QPersonData(Path<? extends PersonData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersonData(PathMetadata metadata) {
        super(PersonData.class, metadata);
    }

}

