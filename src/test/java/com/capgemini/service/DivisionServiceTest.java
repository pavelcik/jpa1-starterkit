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
import com.capgemini.to.DivisionTo;
import com.capgemini.to.WorkerTo;

@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class DivisionServiceTest {

	@Autowired 
	private DivisionService divisionService;
	
	@Test
	public void shouldAddDivision() {
		//given
		DivisionTo division = new DivisionTo();
		division.setCity("Warszawa");
		division.setEmailAddress("warszawa@rental.pl");
		division.setPhoneNumber(2241212);
		division.setStreetAddress("Krolewska 12/31");
		int size = divisionService.findAll().size();
		//when
		divisionService.save(division);
		//then
		assertEquals(divisionService.findAll().size(),size+1);
	}
	
	@Test
	public void shouldDeleteDivision() {
		//given
		long id = 1L;
		DivisionTo divisionToDelete = divisionService.findOne(id);
		int size = divisionService.findAll().size();
		System.out.println(divisionService.findAll().size());
		//when
		divisionService.delete(id);
		//then
		System.out.println(divisionService.findAll().size());
	}
	
	@Test
	public void shouldUpdateDivision() {
		//given
		DivisionTo division = new DivisionTo();
		
		division.setCity("Warszawa");
		division.setEmailAddress("warszawa@rental.pl");
		division.setPhoneNumber(2241212);
		division.setStreetAddress("Krolewska 12/31");
		division.setId(1L);
		//when
		DivisionTo updatedDivision=divisionService.update(division);
		//then
		assertEquals(updatedDivision.getCity(),"Warszawa");
	}
	
	@Test
	public void shouldFindWorkersInDivision() {
		//given
		Long id = 1L;
		//when
		List<WorkerTo> workersInDivision=divisionService.findWorkerByDivision(id);
		//then
		assertEquals(workersInDivision.get(0).getSurname(),"WODNIK");
		assertEquals(workersInDivision.size(),3);
	}
	
	@Test
	public void shouldFindWorkersByDivisionAndCar() {
		//given
		Long divisionId = 2L;
		Long carId=4L;
		//when
		List<WorkerTo> workersInDivision=divisionService.findWorkerByDivisionAndCar(divisionId, carId);
		//then
		assertEquals(workersInDivision.get(0).getName(),"RENATA");
		assertEquals(workersInDivision.size(),1);
	}
	
	@Test
	public void shouldNotFindWorkersByDivisionAndCar() {
		//given
		Long divisionId = 2L;
		Long carId=2L;
		//when
		List<WorkerTo> workersInDivision=divisionService.findWorkerByDivisionAndCar(divisionId, carId);
		//then
		assertEquals(workersInDivision.size(),0);
	}
	
	@Test
	public void shouldDeleteWorkersInDivision() {
		//given
		Long divisionId = 1L;
		Long workerId = 8L;
		
		//when
		divisionService.deleteWorkerFromDivision(divisionId, workerId);
		//then
		assertEquals(divisionService.findWorkerByDivision(divisionId).size(),2);
		
		
		
	}
	
	@Test
	public void shouldAddWorkersToDivision() {
		//given
		Long divisionId = 1L;
		
		WorkerTo worker = new WorkerTo();
		worker.setAge(56);
		worker.setName("Piotr");
		worker.setSurname("Nowak");
		worker.setPositionName(PositionNames.Accountant);
		
		int size = divisionService.findWorkerByDivision(divisionId).size();
		//when
		divisionService.addWorkerToDivision(divisionId, worker);
		//then
		assertEquals(divisionService.findWorkerByDivision(divisionId).size(),4);
		
		
		
	}
	
}
