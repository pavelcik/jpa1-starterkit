package com.capgemini.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="position_names")
public class PositionEntity {

	private String positionName;
}
