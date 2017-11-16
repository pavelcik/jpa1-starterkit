package com.capgemini.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.service.CarService;
import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;

@TestPropertySource(properties = {"spring.profiles.active=mysql", "spring.datasource.username=root", "spring.datasource.password=Qwerty123"})
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest 
public class CarServiceTest {

	@Autowired
	CarService carService;
	
	@Test
	public void shouldFindCarByType() {
		// given

		String carType = "HATCHBACK";
		// when
		List<CarTo> foundCars = carService.findCarByType(carType);
		// then
		assertNotNull(foundCars);
		assertEquals("TOYOTA YARIS", foundCars.get(0).getCarName());

	}
	
	@Test
	public void shouldNotFindCarByType() {
		// given
		String carType = "SOMETYPE";
		// when
		List<CarTo> foundCars = carService.findCarByType(carType);
		// then
		assertNotNull(foundCars);
		assertEquals(foundCars.size(),0);

	}
	
	@Test
	public void shouldFindCarByBrand() {
		// given
		String carBrand = "TOYOTA";
		// when
		List<CarTo> foundCars = carService.findCarByBrand(carBrand);
		// then
		assertNotNull(foundCars);
		assertEquals(carBrand, foundCars.get(0).getCarBrand());

	}
	
	@Test
	public void shouldNotFindCarByBrand() {
		// given
		String carBrand = "SOME BRAND";
		// when
		List<CarTo> foundCars = carService.findCarByBrand(carBrand);
		// then
		assertNotNull(foundCars);
		assertEquals(foundCars.size(),0);

	}
	
	@Test
	public void shouldFindCarByTypeAndBrand() {
		// given

		String carType = "HATCHBACK";
		String carBrand = "TOYOTA";
		// when
		List<CarTo> foundCars = carService.findCarByBrandAndType(carBrand, carType);
		// then
		assertNotNull(foundCars);
		assertEquals("TOYOTA YARIS", foundCars.get(0).getCarName());

	}
	
	@Test
	public void shouldNotFindCarByTypeAndBrand() {
		// given

		String carType = "SEDAN";
		String carBrand = "TOYOTA";
		// when
		List<CarTo> foundCars = carService.findCarByBrandAndType(carBrand, carType);
		// then
		assertNotNull(foundCars);
		assertEquals(foundCars.size(),0);
		
		

	}
	
	@Test
	public void shouldFindCarByWorker() {
		// given
		WorkerTo worker = new WorkerTo();
		worker.setId(5L);
		// when
		List<CarTo> foundCars = carService.findCarByWorker(worker);
		 //then
		assertNotNull(foundCars);
		assertEquals("SEAT LEON", foundCars.get(0).getCarName());
		assertEquals(foundCars.size(),2);

	}
	
	
	
	@Test
	public void shouldUpdateCarDetails() {
	
		// given
		CarTo carTo = new CarTo();
		carTo.setColor("BLUE");
		
		// when
		CarTo updatedCar = carService.updateDetails(carTo);
		// then
		assertNotNull(updatedCar);
		assertEquals(updatedCar.getColor(),"BLUE");

	}
	
	@Test
	public void shouldSaveCar() {
		//given
		int size = carService.findAllCars().size();
		System.out.println("Rozmiar przed: "+size);
		CarTo carTo = new CarTo();
		carTo.setCarBrand("Toyota");
		carTo.setCarName("Toyota Test");
		carTo.setCarType("Test");
		carTo.setColor("YELLOW");
		carTo.setEngineCapacity(2.0F);
		carTo.setEnginePower(140);
		carTo.setMileage(24300F);
		carTo.setPriceByDay(220);
		carTo.setProductionYear(2014);
		//when
		carService.save(carTo);
		//then
		System.out.println("Rozmiar tablicy po dodaniu samochodu: "+carService.findAllCars().size());
		assertEquals(carService.findAllCars().size(),size+1);
	}
	
	@Test
	public void shouldDeleteCar() {
		//given
		int size = carService.findAllCars().size();
		Long id = 3L;
		//when
		carService.deleteCar(carService.findOne(id));
		//then
		assertEquals(carService.findAllCars().size(),size-1);
	}
	
	@Test
	public void shouldAddCarToWorker() {
	//given
	
	WorkerTo worker = new WorkerTo();
	worker.setId(2L);
	Long id = 3L;
	Long workerId = 2L;
	int size = carService.findCarByWorker(worker).size();
	//when
	carService.addCarToWorker(workerId, carService.findOne(id));
	//then
	assertEquals(carService.findCarByWorker(worker).size(),size+1);
	
	}
}
