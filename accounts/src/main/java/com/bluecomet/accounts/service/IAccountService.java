package com.bluecomet.accounts.service;

import com.bluecomet.accounts.model.dto.CustomerDto;

public interface IAccountService {
	
	/**
	 * @param customerDto - CustomerDto Object
	 */
	void createAccount(CustomerDto customerDto);
}
