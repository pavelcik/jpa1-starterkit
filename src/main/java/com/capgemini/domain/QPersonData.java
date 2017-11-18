package com.capgemini.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


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

