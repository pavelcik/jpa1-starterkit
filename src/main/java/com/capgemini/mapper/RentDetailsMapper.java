package com.capgemini.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.capgemini.domain.RentDetailsEntity;
import com.capgemini.to.RentDetailsTo;

@Component
public class RentDetailsMapper {

	@PersistenceContext
    private EntityManager entityManager;
	
	public static RentDetailsTo map(RentDetailsEntity rentDetailsEntity) {
		RentDetailsTo rentDetailsTo = null;
		if(rentDetailsEntity!=null) {
			rentDetailsTo = new RentDetailsTo();
			rentDetailsTo.setClientId(rentDetailsEntity.getClientId());
			rentDetailsTo.setPlaceOfRent(rentDetailsEntity.getPlaceOfRent());
			rentDetailsTo.setPlaceOfReturn(rentDetailsEntity.getPlaceOfReturn());
			rentDetailsTo.setRental_date(rentDetailsEntity.getRental_date());
			rentDetailsTo.setReturn_date(rentDetailsEntity.getReturn_date());
			rentDetailsTo.setId(rentDetailsEntity.getId());
			
		}
		return rentDetailsTo;
	}
	
	public static RentDetailsEntity map(RentDetailsTo rentDetailsTo) {
		RentDetailsEntity rentDetailsEntity = null;
		if(rentDetailsTo!=null) {
			rentDetailsEntity = new RentDetailsEntity();
			rentDetailsEntity.setClientId(rentDetailsTo.getClientId());
			rentDetailsEntity.setPlaceOfRent(rentDetailsTo.getPlaceOfRent());
			rentDetailsEntity.setPlaceOfReturn(rentDetailsTo.getPlaceOfReturn());
			rentDetailsEntity.setRental_date(rentDetailsTo.getRental_date());
			rentDetailsEntity.setReturn_date(rentDetailsTo.getReturn_date());
			rentDetailsEntity.setId(rentDetailsTo.getId());
			
		}
		return rentDetailsEntity;
	}
	public static List<RentDetailsTo> map2To(List<RentDetailsEntity> divisionEntities) {
		return divisionEntities.stream().map(c->map(c)).collect(Collectors.toList());
	}
}
