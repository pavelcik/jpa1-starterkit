package com.capgemini.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.JPaRentDetailsDao;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.RentDetailsEntity;
import com.capgemini.mapper.CarMapper;
import com.capgemini.model.QCarEntity;
import com.capgemini.model.QRentDetailsEntity;
import com.capgemini.to.CarTo;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class JPaRentDetailsDaoImpl implements JPaRentDetailsDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private CarMapper carMapper;

	@Override
	public List<CarTo> findCarsRentedByMoreThanOnePerson() {

		QCarEntity car = QCarEntity.carEntity;

		JPAQuery<CarEntity> query = new JPAQuery<>(entityManager);
		List<CarEntity> result = query.select(car.rents).from(car).where(car.rents.size().gt(1)).select(car).fetch();

		return carMapper.map2To(result);
	}

	@Override
	public int findCarsRentedInTimeframe(Date from, Date to) {
		QRentDetailsEntity rents = QRentDetailsEntity.rentDetailsEntity;

		JPAQuery<CarEntity> query = new JPAQuery<>(entityManager);

		List<RentDetailsEntity> result = query.select(rents).from(rents).where(rents.rental_date.between(from, to))
				.fetch();

		return result.size();
	}
}
