package com.bluecomet.accounts.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_customer")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;


	
	@Column(name = "name", length = 100, nullable = false)
	private String name;


	
	@Column(name = "email", length = 100, nullable = false)
	private String email;


	
	@Column(name = "mobile_number",length = 20, nullable = false)
	private String mobileNumber;


}
