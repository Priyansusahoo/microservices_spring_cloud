package com.bluecomet.accounts.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

@MappedSuperclass
public abstract class BaseEntity {

	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "created_by",length = 20, updatable = false, nullable = false)
	private String createdBy;
	
	@Column(name = "updated_at", insertable = false)
	private LocalDateTime updatedAt;
	
	@Column(name = "updated_by", length = 20, insertable = false)
	private String updatedBy;
	
	@Version
	@Column(name = "version")
	private Long version;
	
	
	
	

	/**
	 * Getter, Setter and ToString()
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "BaseEntity [createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt
				+ ", updatedBy=" + updatedBy + ", version=" + version + "]";
	}
	
}
