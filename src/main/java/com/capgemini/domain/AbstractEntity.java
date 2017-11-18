package com.capgemini.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date creationDate;

	public long getVersion() {
		return Version;
	}

	public void setVersion(long version) {
		Version = version;
	}

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modification_date",columnDefinition = "TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP")
	private Date modificationDate;  

//	public String getPersistingHistory() {
//		return persistingHistory;
//	}
//
//	public void setPersistingHistory(String persistingHistory) {
//		this.persistingHistory = persistingHistory;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
