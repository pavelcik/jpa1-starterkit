package com.capgemini.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.QCarEntity;
import com.capgemini.domain.QRentDetailsEntity;
import com.capgemini.domain.RentDetailsEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.mapper.CarMapper;
import com.capgemini.mapper.RentDetailsMapper;
import com.capgemini.to.CarTo;
import com.capgemini.to.RentDetailsTo;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class JPaRentDetailsDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private RentDetailsMapper rentDetailsMapper;
	@Autowired
	 private CarMapper carMapper;
	
	public List<CarTo> findCarsRentedByMoreThanTenPeople() {
		QRentDetailsEntity rents = QRentDetailsEntity.rentDetailsEntity;
		QCarEntity car = QCarEntity.carEntity;
		
		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		
		List<CarEntity> result = query.select(car,(rents.car.id).countDistinct()).from(rents,car).groupBy(car.id)
			.having((rents.car.id).countDistinct().gt(1)).select(car).fetch();
				
		return carMapper.map2To(result);
	}
	
	public int findCarsRentedInTimeframe(Date from,Date to) {
		QRentDetailsEntity rents = QRentDetailsEntity.rentDetailsEntity;
		QCarEntity car = QCarEntity.carEntity;
		
		JPAQuery<WorkerEntity> query = new JPAQuery<>(entityManager);
		
		List<RentDetailsEntity> result = query.select(rents).from(rents).where(rents.rental_date.between(from, to)).fetch();
				
				
		return result.size();
	}
}
