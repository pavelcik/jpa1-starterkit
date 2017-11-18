package com.capgemini.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkerEntity is a Querydsl query type for WorkerEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWorkerEntity extends EntityPathBase<WorkerEntity> {

    private static final long serialVersionUID = 1548451447L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkerEntity workerEntity = new QWorkerEntity("workerEntity");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final ListPath<CarEntity, QCarEntity> cars = this.<CarEntity, QCarEntity>createList("cars", CarEntity.class, QCarEntity.class, PathInits.DIRECT2);

    public final QDivisionEntity division;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final StringPath persistingHistory = _super.persistingHistory;

    public final EnumPath<PositionNames> positionName = createEnum("positionName", PositionNames.class);

    public final StringPath surname = createString("surname");

    //inherited
    public final NumberPath<Long> Version = _super.Version;

    public QWorkerEntity(String variable) {
        this(WorkerEntity.class, forVariable(variable), INITS);
    }

    public QWorkerEntity(Path<? extends WorkerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkerEntity(PathMetadata metadata, PathInits inits) {
        this(WorkerEntity.class, metadata, inits);
    }

    public QWorkerEntity(Class<? extends WorkerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.division = inits.isInitialized("division") ? new QDivisionEntity(forProperty("division")) : null;
    }

}

