package com.capgemini;

import javax.persistence.EntityManager;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.service.CarService;
import com.capgemini.to.CarTo;

@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class EntityTests {
	
	@Autowired
	private CarService carService;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@PersistenceContext
	private EntityManager em1;
	@PersistenceContext
	private EntityManager em2;
	
	@Test(expected=ObjectOptimisticLockingFailureException.class)
	public void shouldCheckForOptimisticLocking() {
		Long id = 2L;
		String color = "WHITE";
		String color2 = "RED";

		CarTo carTo = carService.findOne(id);
		carTo.setColor(color);
		carService.updateDetails(carTo);
		carTo.setVersion(carTo.getVersion()+1);
		carTo.setColor(color2);
		carService.updateDetails(carTo);
		
		
		
		
	}
	
	@Test(expected=Test.None.class)
	public void shouldNotGiveOptimisticLockingFailure() {
		Long id = 2L;
		String color = "WHITE";
		String color2 = "RED";

		CarTo carTo = carService.findOne(id);
		carTo.setColor(color);
		carService.updateDetails(carTo);
		carTo.setVersion(carTo.getVersion());
		carTo.setColor(color2);
		carService.updateDetails(carTo);
		
		
		
		
	}
	
	
	
}
