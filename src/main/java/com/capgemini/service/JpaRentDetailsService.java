package com.capgemini.service;

import java.sql.Date;
import java.util.List;

import com.capgemini.to.CarTo;

public interface JpaRentDetailsService {
	public List<CarTo> findCarsRentedByMoreThanOnePerson();
	public int findCarsRentedInTimeframe(Date from,Date to);
}
