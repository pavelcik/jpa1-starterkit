package com.capgemini.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.capgemini.domain.CarEntity;
import com.capgemini.to.CarTo;
@Component
public class CarMapper {
	@PersistenceContext
    private EntityManager entityManager;
	
	public static CarTo map(CarEntity carEntity) {
		CarTo carTo = null;
		if(carEntity!=null) {
			carTo = new CarTo();
			carTo.setCarBrand(carEntity.getCarBrand());
			carTo.setCarName(carEntity.getCarName());
			carTo.setCarType(carEntity.getCarType());
			carTo.setColor(carEntity.getColor());
			carTo.setEngineCapacity(carEntity.getEngineCapacity());
			carTo.setEnginePower(carEntity.getEnginePower());
			carTo.setMileage(carEntity.getMileage());
			carTo.setPriceByDay(carEntity.getPriceByDay());
			carTo.setProductionYear(carEntity.getProductionYear());
		}
		return carTo;
	}
	
	public static CarEntity map(CarTo carTo) {
		CarEntity carEntity = null;
		if(carTo!=null) {
			carEntity = new CarEntity();
			carEntity.setCarBrand(carTo.getCarBrand());
			carEntity.setCarName(carTo.getCarName());
			carEntity.setCarType(carTo.getCarType());
			carEntity.setColor(carTo.getColor());
			carEntity.setEngineCapacity(carTo.getEngineCapacity());
			carEntity.setEnginePower(carTo.getEnginePower());
			carEntity.setMileage(carTo.getMileage());
			carEntity.setPriceByDay(carTo.getPriceByDay());
			carEntity.setProductionYear(carTo.getProductionYear());
		}
		return carEntity;
	}
	
	public static List<CarTo> map2To(List<CarEntity> carEntities) {
		return carEntities.stream().map(c->map(c)).collect(Collectors.toList());
	}
}
