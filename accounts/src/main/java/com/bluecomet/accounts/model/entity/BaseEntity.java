package com.bluecomet.accounts.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter @Setter @ToString
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

	@PrePersist
	public void prePresist() {
		this.createdAt = LocalDateTime.now();
	}
}
