package com.capgemini.model;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.capgemini.domain.ClientEntity;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DatePath;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QClientEntity is a Querydsl query type for ClientEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClientEntity extends EntityPathBase<ClientEntity> {

    private static final long serialVersionUID = 71561476L;

    public static final QClientEntity clientEntity = new QClientEntity("clientEntity");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final StringPath city = createString("city");

    //inherited
    public final DateTimePath<java.util.Date> creationDate = _super.creationDate;

    public final StringPath creditCardNumber = createString("creditCardNumber");

    public final DatePath<java.sql.Date> dateOfBirth = createDate("dateOfBirth", java.sql.Date.class);

    public final StringPath emailAddress = createString("emailAddress");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificationDate = _super.modificationDate;

    public final StringPath name = createString("name");

    public final StringPath streetAddress = createString("streetAddress");

    public final StringPath surname = createString("surname");

    //inherited
    public final NumberPath<Long> Version = _super.Version;

    public QClientEntity(String variable) {
        super(ClientEntity.class, forVariable(variable));
    }

    public QClientEntity(Path<? extends ClientEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClientEntity(PathMetadata metadata) {
        super(ClientEntity.class, metadata);
    }

}

