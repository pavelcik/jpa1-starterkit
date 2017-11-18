package com.capgemini.service;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.dao.DivisionDao;
import com.capgemini.dao.impl.JpaWorkerDao;
import com.capgemini.dao.impl.WorkerSearchCriteria;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.DivisionEntity;
import com.capgemini.domain.PositionNames;

@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class WorkerSearchCriteriaServiceTest {

	@Autowired
	private JpaWorkerDao dao;
	@Autowired
	private DivisionDao divisionDao;
	@Autowired
	private CarService carService;
	@Autowired
	private WorkerSearchCriteria criteria;
	
	@Before
	public void resetCriteria() {
		criteria.setCar(null);
		criteria.setPosition(null);
		criteria.setDivision(null);
	}
	
	@Test
	public void shouldFindWorkersByDivision() {
		
		Long id =3L;
		DivisionEntity divisionEntity = divisionDao.findOneEntity(id);
		criteria.setDivision(divisionEntity);
		int size = dao.findWorkerByCriteria(criteria).size();
		
		assertEquals(3,size);
		assertEquals("DANUTA",dao.findWorkerByCriteria(criteria).get(0).getName());
		
	}
	
	@Test
	public void shouldFindWorkersBySupervisedCar() {
		
		Long id =1L;
		Long workerId=5L;
		CarEntity carEntity = carService.findOneCarEntity(id);
		criteria.setCar(carEntity);
		int size = dao.findWorkerByCriteria(criteria).size();
		
		assertEquals(1,size);
		assertEquals(workerId,dao.findWorkerByCriteria(criteria).get(0).getId());
		
	}
	
	@Test
	public void shouldFindWorkersByPositionName() {
	
		PositionNames positionName = PositionNames.Accountant;
		
		criteria.setPosition(positionName);
		int size = dao.findWorkerByCriteria(criteria).size();
		
		assertEquals(3,size);
		assertEquals(positionName,dao.findWorkerByCriteria(criteria).get(0).getPositionName());
		
	}

	
}
