package com.capgemini.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarEntity is a Querydsl query type for CarEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarEntity extends EntityPathBase<CarEntity> {

    private static final long serialVersionUID = -1290333407L;

    public static final QCarEntity carEntity = new QCarEntity("carEntity");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final StringPath carBrand = createString("carBrand");

    public final StringPath carName = createString("carName");

    public final StringPath carType = createString("carType");

    public final StringPath color = createString("color");

    public final NumberPath<Float> engineCapacity = createNumber("engineCapacity", Float.class);

    public final NumberPath<Integer> enginePower = createNumber("enginePower", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Float> mileage = createNumber("mileage", Float.class);

    //inherited
    public final StringPath persistingHistory = _super.persistingHistory;

    public final NumberPath<Integer> priceByDay = createNumber("priceByDay", Integer.class);

    public final NumberPath<Integer> productionYear = createNumber("productionYear", Integer.class);

    public final ListPath<RentDetailsEntity, QRentDetailsEntity> rents = this.<RentDetailsEntity, QRentDetailsEntity>createList("rents", RentDetailsEntity.class, QRentDetailsEntity.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> Version = _super.Version;

    public final ListPath<WorkerEntity, QWorkerEntity> workers = this.<WorkerEntity, QWorkerEntity>createList("workers", WorkerEntity.class, QWorkerEntity.class, PathInits.DIRECT2);

    public QCarEntity(String variable) {
        super(CarEntity.class, forVariable(variable));
    }

    public QCarEntity(Path<? extends CarEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCarEntity(PathMetadata metadata) {
        super(CarEntity.class, metadata);
    }

}

