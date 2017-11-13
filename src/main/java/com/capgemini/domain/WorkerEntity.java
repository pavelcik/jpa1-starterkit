package com.capgemini.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="workers")
public class WorkerEntity {

@Id
private int workerId;
@Enumerated(EnumType.STRING)
private PositionEntity positionName;
private String name;
private String surname;
private int age;
@ManyToOne
@JoinColumn(name="division_id")
private DivisionEntity divisionId;

}
