package com.capgemini.model;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.capgemini.domain.RentDetailsEntity;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DatePath;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRentDetailsEntity is a Querydsl query type for RentDetailsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRentDetailsEntity extends EntityPathBase<RentDetailsEntity> {

    private static final long serialVersionUID = -1421071786L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRentDetailsEntity rentDetailsEntity = new QRentDetailsEntity("rentDetailsEntity");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final QCarEntity car;

    public final QClientEntity clientId;

    //inherited
    public final DateTimePath<java.util.Date> creationDate = _super.creationDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificationDate = _super.modificationDate;

    public final QDivisionEntity placeOfRent;

    public final QDivisionEntity placeOfReturn;

    public final DatePath<java.sql.Date> rental_date = createDate("rental_date", java.sql.Date.class);

    public final DatePath<java.sql.Date> return_date = createDate("return_date", java.sql.Date.class);

    //inherited
    public final NumberPath<Long> Version = _super.Version;

    public QRentDetailsEntity(String variable) {
        this(RentDetailsEntity.class, forVariable(variable), INITS);
    }

    public QRentDetailsEntity(Path<? extends RentDetailsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRentDetailsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRentDetailsEntity(PathMetadata metadata, PathInits inits) {
        this(RentDetailsEntity.class, metadata, inits);
    }

    public QRentDetailsEntity(Class<? extends RentDetailsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.car = inits.isInitialized("car") ? new QCarEntity(forProperty("car")) : null;
        this.clientId = inits.isInitialized("clientId") ? new QClientEntity(forProperty("clientId")) : null;
        this.placeOfRent = inits.isInitialized("placeOfRent") ? new QDivisionEntity(forProperty("placeOfRent")) : null;
        this.placeOfReturn = inits.isInitialized("placeOfReturn") ? new QDivisionEntity(forProperty("placeOfReturn")) : null;
    }

}

