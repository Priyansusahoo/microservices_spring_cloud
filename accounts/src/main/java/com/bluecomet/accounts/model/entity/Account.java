package com.bluecomet.accounts.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "t_account")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Account extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
	private Customer customer;
	
	@Id
	@Column(name = "account_number")
	private Long accountNumber;
	
	@Column(name = "account_type", length = 100, nullable = false)
	private String accountType;
	
	@Column(name = "branch_address", length = 200, nullable = false)
	private String branchAddress;
}
