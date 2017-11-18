package com.capgemini.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDivisionEntity is a Querydsl query type for DivisionEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDivisionEntity extends EntityPathBase<DivisionEntity> {

    private static final long serialVersionUID = -226822426L;

    public static final QDivisionEntity divisionEntity = new QDivisionEntity("divisionEntity");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final StringPath City = createString("City");

    //inherited
    public final DateTimePath<java.util.Date> creationDate = _super.creationDate;

    public final ListPath<WorkerEntity, QWorkerEntity> divisionWorkers = this.<WorkerEntity, QWorkerEntity>createList("divisionWorkers", WorkerEntity.class, QWorkerEntity.class, PathInits.DIRECT2);

    public final StringPath emailAddress = createString("emailAddress");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificationDate = _super.modificationDate;

    public final NumberPath<Integer> phoneNumber = createNumber("phoneNumber", Integer.class);

    public final StringPath streetAddress = createString("streetAddress");

    //inherited
    public final NumberPath<Long> Version = _super.Version;

    public QDivisionEntity(String variable) {
        super(DivisionEntity.class, forVariable(variable));
    }

    public QDivisionEntity(Path<? extends DivisionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDivisionEntity(PathMetadata metadata) {
        super(DivisionEntity.class, metadata);
    }

}

