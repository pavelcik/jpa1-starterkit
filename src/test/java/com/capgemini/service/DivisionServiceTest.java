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
		assertEquals(workersInDivision.size(),3);
	}
	
}
