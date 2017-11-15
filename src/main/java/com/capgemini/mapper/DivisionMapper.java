package com.capgemini.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.capgemini.domain.DivisionEntity;
import com.capgemini.to.DivisionTo;
@Component
public class DivisionMapper {

	@PersistenceContext
    private EntityManager entityManager;
	
	public static DivisionTo map(DivisionEntity divisionEntity) {
		DivisionTo divisionTo = null;
		if(divisionEntity!=null) {
			divisionTo = new DivisionTo();
			divisionTo.setCity(divisionEntity.getCity());
			divisionTo.setEmailAddress(divisionEntity.getEmailAddress());
			divisionTo.setPhoneNumber(divisionEntity.getPhoneNumber());
			divisionTo.setStreetAddress(divisionEntity.getStreetAddress());
			divisionTo.setId(divisionEntity.getId());
			divisionTo.setDivisionWorkers(divisionEntity.getDivisionWorkers());
			
		}
		return divisionTo;
	}
	
	public static DivisionEntity map(DivisionTo divisionTo) {
		DivisionEntity divisionEntity = null;
		if(divisionTo!=null) {
			divisionEntity = new DivisionEntity();
			divisionEntity.setCity(divisionTo.getCity());
			divisionEntity.setEmailAddress(divisionTo.getEmailAddress());
			divisionEntity.setPhoneNumber(divisionTo.getPhoneNumber());
			divisionEntity.setStreetAddress(divisionTo.getStreetAddress());
			divisionEntity.setId(divisionTo.getId());
			divisionEntity.setDivisionWorkers(divisionTo.getDivisionWorkers());
		}
		return divisionEntity;
	}
	public static List<DivisionTo> map2To(List<DivisionEntity> divisionEntities) {
		return divisionEntities.stream().map(c->map(c)).collect(Collectors.toList());
	}
}
