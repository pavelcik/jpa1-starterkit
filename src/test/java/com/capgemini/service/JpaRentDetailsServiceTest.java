package com.capgemini.service;
import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.to.CarTo;
import com.querydsl.jpa.impl.JPAQuery;
@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class JpaRentDetailsServiceTest {

	@Autowired
	private JpaRentDetailsService jpaRentDetailsService;
	
	@Test
	public void shouldCheckIfThereAreMoreThanTenRents() {
		//given
		int size = 1;
		//when
		List<CarTo> numberOfRentedCars = jpaRentDetailsService.findCarsRentedByMoreThanTenPeople();
		System.out.println("Rozmiar: "+numberOfRentedCars.size());
		System.out.println(numberOfRentedCars.get(0).getId());
		System.out.println(numberOfRentedCars.get(1).getId());
		System.out.println(numberOfRentedCars.get(2).getId());
		System.out.println(numberOfRentedCars.get(3).getId());
		System.out.println(numberOfRentedCars.get(4).getId());
		System.out.println(numberOfRentedCars.get(5).getId());
		System.out.println(numberOfRentedCars.get(6).getId());
	}
	
	@Test
	public void shouldFindNumberOfRentsInTimeframe() {
		//given
		int size = 1;
		@SuppressWarnings("deprecation")
		Date from = new Date(2017,9,11);
		@SuppressWarnings("deprecation")
		Date to = new Date(2017,9,18);
		//when
		int numberOfRents = jpaRentDetailsService.findCarsRentedInTimeframe(from, to);
		System.out.println(numberOfRents);
	}
}
