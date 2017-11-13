package com.capgemini.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass

public abstract class AbstractEntity {

	@Version
	private int Version;
	
	private String persistingHistory;

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}

	public String getPersistingHistory() {
		return persistingHistory;
	}

	public void setPersistingHistory(String persistingHistory) {
		this.persistingHistory = persistingHistory;
	}
	
	
}
