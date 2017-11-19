package com.capgemini.service;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.to.CarTo;

@TestPropertySource(properties = { "spring.profiles.active=mysql", "spring.datasource.username=root",
		"spring.datasource.password=Qwerty123" })
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaRentDetailsServiceTest {

	@Autowired
	private JpaRentDetailsService jpaRentDetailsService;

	@Test
	public void shouldCheckIfThereAreMoreThanOneRent() {
		// given
		
		Long id = 1L;
		// when
		List<CarTo> numberOfRentedCars = jpaRentDetailsService.findCarsRentedByMoreThanOnePerson();
		// then
		assertEquals(6, numberOfRentedCars.size());
		assertEquals(id, numberOfRentedCars.get(0).getId());

	}

	@Test
	public void shouldFindNumberOfRentsInTimeframe() {
		// given

		LocalDate fromLocalDate = LocalDate.of(2017, 9, 11);
		java.sql.Date from = java.sql.Date.valueOf(fromLocalDate);

		LocalDate toLocalDate = LocalDate.of(2017, 9, 19);
		java.sql.Date to = java.sql.Date.valueOf(toLocalDate);

		// when
		int numberOfRents = jpaRentDetailsService.findCarsRentedInTimeframe(from, to);
		// then
		assertEquals(3, numberOfRents);
	}
}
