package com.capgemini.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.impl.JPaRentDetailsDao;
import com.capgemini.service.JpaRentDetailsService;
import com.capgemini.to.CarTo;
import com.querydsl.jpa.impl.JPAQuery;
@Service
public class JpaRentDetailsServiceImpl implements JpaRentDetailsService {
@Autowired
private JPaRentDetailsDao jpaRentDetailsDao;
	@Override
	public List<CarTo> findCarsRentedByMoreThanTenPeople() {
		return jpaRentDetailsDao.findCarsRentedByMoreThanTenPeople();
	}
	@Override
	public int findCarsRentedInTimeframe(Date from, Date to) {
		return jpaRentDetailsDao.findCarsRentedInTimeframe(from, to);
	}

}
