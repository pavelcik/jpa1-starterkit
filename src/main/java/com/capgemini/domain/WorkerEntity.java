package com.capgemini.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="workers")
public class WorkerEntity extends AbstractEntity{

@Enumerated(EnumType.STRING)
private PositionNames positionName;
private String name;
private String surname;
private int age;
@OneToOne(
		fetch = FetchType.LAZY, // 
		optional = false)
private DivisionEntity division;

@ManyToMany(mappedBy="workers")
private List<CarEntity> cars;
}
