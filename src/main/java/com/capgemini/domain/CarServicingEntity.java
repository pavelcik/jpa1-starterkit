package com.capgemini.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_servicing")
public class CarServicingEntity {

@ManyToOne
@JoinColumn(name="CAR_ID")
private CarEntity carId;
@ManyToOne
@JoinColumn(name="WORKER_ID")
private WorkerEntity workerId;
}
