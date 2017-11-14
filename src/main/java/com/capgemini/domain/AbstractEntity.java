package com.capgemini.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass

public abstract class AbstractEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5567369544430012468L;

	@Id
	@GeneratedValue
	private Long id;

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
