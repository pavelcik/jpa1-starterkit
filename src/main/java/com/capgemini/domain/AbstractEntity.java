package com.capgemini.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PostPersist;
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
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private long Version = 0L;
	
	private String persistingHistory;

	public long getVersion() {
		return Version;
	}

	public void setVersion(long Version) {
		Version = Version;
	}

	public String getPersistingHistory() {
		return persistingHistory;
	}

	public void setPersistingHistory(String persistingHistory) {
		this.persistingHistory = persistingHistory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
