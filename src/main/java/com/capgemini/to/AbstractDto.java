package com.capgemini.to;

import javax.persistence.Column;
import javax.persistence.Version;

public abstract class AbstractDto {

	private Long id;
	@Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private long Version = 0L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getVersion() {
		return Version;
	}

	public void setVersion(long version) {
		Version = version;
	}
	
}
