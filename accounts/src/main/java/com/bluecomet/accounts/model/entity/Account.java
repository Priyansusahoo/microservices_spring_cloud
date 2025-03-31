package com.bluecomet.accounts.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_account")
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
	
	public Account() {}
	
	

	public Account(Customer customer, Long accountNumber, String accountType, String branchAddress) {
		super();
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.branchAddress = branchAddress;
	}


	
	

	/**
	 * Getter, Setter and ToString()
	 */
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", branchAddress=" + branchAddress + "]";
	}	
}
