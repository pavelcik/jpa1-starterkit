package com.capgemini.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.capgemini.domain.CarEntity;
import com.capgemini.to.CarTo;
@Component
public class CarMapper {
	
	
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
			carTo.setId(carEntity.getId());
			carTo.setVersion(carEntity.getVersion());
			carTo.setRents(carEntity.getRents());
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
			carEntity.setId(carTo.getId());
			carEntity.setVersion(carTo.getVersion());
			carEntity.setRents(carTo.getRents());
		}
		return carEntity;
	}
	
	public static List<CarTo> map2To(List<CarEntity> carEntities) {
		return carEntities.stream().map(c->map(c)).collect(Collectors.toList());
	}
}
