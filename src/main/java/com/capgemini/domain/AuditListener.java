package com.capgemini.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.PrePersist;

public class AuditListener {

//@PrePersist
//public void ammentPersistingHistory(AbstractEntity entity) {
//	String persistingHistory = entity.getPersistingHistory();
//	
//	if(persistingHistory == null) {
//		persistingHistory = "";
//		
//	}
//	persistingHistory = persistingHistory + "Persisted : "+LocalDate.now()+" at: "+LocalTime.now();
//	entity.setPersistingHistory(persistingHistory);
//}
}