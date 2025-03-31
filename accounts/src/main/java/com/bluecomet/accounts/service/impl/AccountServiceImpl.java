package com.bluecomet.accounts.service.impl;

import org.springframework.stereotype.Service;

import com.bluecomet.accounts.model.dto.CustomerDto;
import com.bluecomet.accounts.repository.AccountRepository;
import com.bluecomet.accounts.repository.CustomerRepository;
import com.bluecomet.accounts.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService{
	
	private final AccountRepository accountRepository;
	private final CustomerRepository customerRepository;
	
    public AccountServiceImpl(AccountRepository accountRepository, CustomerRepository customerRepository) {
		super();
		this.accountRepository = accountRepository;
		this.customerRepository = customerRepository;
	}


	/**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
