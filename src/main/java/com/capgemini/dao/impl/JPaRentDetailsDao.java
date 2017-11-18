package com.capgemini.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.RentDetailsEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.model.QCarEntity;
import com.capgemini.model.QRentDetailsEntity;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class JPaRentDetailsDao {
	@PersistenceContext
	private EntityManager entityManager;

	
	public List<CarEntity> findCarsRentedByMoreThanOnePerson() {
		QRentDetailsEntity rents = QRentDetailsEntity.rentDetailsEntity;
		QCarEntity car = QCarEntity.carEntity;
		
		JPAQuery<CarEntity> query = new JPAQuery<>(entityManager);
		List<CarEntity> result = query.select(car.rents).from(car).where(car.rents.size().gt(1)).select(car).fetch();
				
		return result;
	}
	
	public int findCarsRentedInTimeframe(Date from,Date to) {
		QRentDetailsEntity rents = QRentDetailsEntity.rentDetailsEntity;
		QCarEntity car = QCarEntity.carEntity;
		
		JPAQuery<CarEntity> query = new JPAQuery<>(entityManager);
		
		//List<CarEntity> result = query.select(car).from(rents).where(rents.rental_date.between(from, to)).fetch();
		List<RentDetailsEntity> result = query.select(rents).from(rents).where(rents.rental_date.between(from, to)).fetch();
				
				
		return result.size();
	}
}

