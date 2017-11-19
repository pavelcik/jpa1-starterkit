package com.capgemini.dao;

import java.sql.Date;
import java.util.List;

import com.capgemini.to.CarTo;

public interface JPaRentDetailsDao {

	List<CarTo> findCarsRentedByMoreThanOnePerson();

	int findCarsRentedInTimeframe(Date from, Date to);

}