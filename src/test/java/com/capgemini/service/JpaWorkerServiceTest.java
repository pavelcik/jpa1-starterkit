package com.capgemini.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.domain.PositionNames;
import com.capgemini.to.WorkerTo;
@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class JpaWorkerServiceTest {
	@Autowired
	private JpaWorkerService jpaWorkerService;
	
	@Test
	public void shouldFindWorkersInDivision() {
		//given
		Long divisionId = 1L;
		int size = jpaWorkerService.findWorkersInDivision(divisionId).size();
		//when
		List<WorkerTo> workersInDivision = jpaWorkerService.findWorkersInDivision(divisionId);
		//then
		assertEquals(3,size);
		assertEquals("WODNIK",workersInDivision.get(0).getSurname());
		assertEquals("KLONOWICZ",workersInDivision.get(1).getSurname());
		assertEquals("KONIOWSKA",workersInDivision.get(2).getSurname());
	}
	
	@Test
	public void shouldFindWorkersByCar() {
		//given
		Long carId = 1L;
		Long workerId = 5L;
		int size = jpaWorkerService.findWorkersByCar(carId).size();
		//when
		List<WorkerTo> workersByCar = jpaWorkerService.findWorkersByCar(carId);
		//then
		assertEquals(1,size);
		assertEquals(workerId,workersByCar.get(0).getId());
	}
	
	@Test
	public void shouldFindWorkersByPosition() {
		//given
		PositionNames position = PositionNames.Accountant;
		int size = jpaWorkerService.findWorkersByPosition(position).size();
		//when
		List<WorkerTo> workersByPosition = jpaWorkerService.findWorkersByPosition(position);
		//then
		assertEquals(3,size);
		assertEquals(workersByPosition.get(0).getPositionName(),position);
	}

}
