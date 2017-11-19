package com.capgemini.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.to.CarTo;
import com.capgemini.to.WorkerTo;
import com.google.common.collect.Maps;

@TestPropertySource(properties = { "spring.profiles.active=mysql", "spring.datasource.username=root",
		"spring.datasource.password=Qwerty123" })
//@TestPropertySource(properties = { "spring.profiles.active=hsql", "spring.datasource.username=SA",
//"spring.datasource.password=" })
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

	@Autowired
	CarService carService;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

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
		assertEquals(0, foundCars.size());

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
		assertEquals(0, foundCars.size());

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
		assertEquals(0, foundCars.size());

	}

	@Test
	public void shouldFindCarByWorker() {
		// given
		WorkerTo worker = new WorkerTo();
		worker.setId(5L);
		// when
		List<CarTo> foundCars = carService.findCarByWorker(worker);
		// then
		assertNotNull(foundCars);
		assertEquals("SEAT LEON", foundCars.get(0).getCarName());
		assertEquals(2, foundCars.size());

	}

	@Test
	public void shouldUpdateCarDetails() {

		// given
		Long id = 2L;
		CarTo carTo = carService.findOne(id);
		carTo.setColor("BLUE");

		// when
		CarTo updatedCar = carService.updateDetails(carTo);
		// then
		assertNotNull(updatedCar);
		assertEquals("BLUE", updatedCar.getColor());

	}

	@Test
	public void shouldSaveCar() {
		// given
		int size = carService.findAllCars().size();
		System.out.println("Rozmiar przed: " + size);
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
		// when
		carService.save(carTo);
		// then

		assertEquals(size + 1, carService.findAllCars().size());
	}

	@Test
	public void shouldSaveCarInJdbc() {
		// given
		int size = carService.findAllCars().size();

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
		String sql = "INSERT INTO CAR(car_brand,car_name,car_type,color,engine_capacity,engine_power,mileage,price_by_day,production_year)"
				+ "VALUES (:car_brand,:car_name,:car_type,:color,:engine_capacity,:engine_power,:mileage,:price_by_day,:production_year)";

		Map<String, Object> parameters = Maps.newHashMap();
		parameters.put("car_brand", carTo.getCarBrand());
		parameters.put("car_name", carTo.getCarName());
		parameters.put("car_type", carTo.getCarType());
		parameters.put("color", carTo.getColor());
		parameters.put("engine_capacity", carTo.getEngineCapacity());
		parameters.put("engine_power", carTo.getEnginePower());
		parameters.put("mileage", carTo.getMileage());
		parameters.put("price_by_day", carTo.getPriceByDay());
		parameters.put("production_year", carTo.getProductionYear());

		// when
		jdbcTemplate.update(sql, parameters);
		// then

		assertEquals(size + 1, carService.findAllCars().size());
	}

	@Test
	public void shouldDeleteCar() {
		// given
		int size = carService.findAllCars().size();
		Long id = 3L;
		CarTo car = carService.findOne(id);
		// when
		
		carService.deleteCar(car);
		
		// then
		assertEquals(size - 1, carService.findAllCars().size());
	}
	


	@Test
	public void shouldAddCarToWorker() {
		// given

		Long carId = 3L;

		Long workerId = 2L;

		// when
		carService.addCarToWorker(workerId, carId);
		// then
		assertEquals(2, carService.findCarByWorker(carService.findWorkerById(workerId)).size());

	}
}
