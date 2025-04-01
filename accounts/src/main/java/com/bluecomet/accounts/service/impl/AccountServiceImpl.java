package com.bluecomet.accounts.service.impl;

import com.bluecomet.accounts.constants.AccountConstants;
import com.bluecomet.accounts.exception.CustomerAlreadyExistsException;
import com.bluecomet.accounts.mapper.CustomerMapper;
import com.bluecomet.accounts.model.entity.Account;
import com.bluecomet.accounts.model.entity.Customer;
import org.springframework.stereotype.Service;

import com.bluecomet.accounts.model.dto.CustomerDto;
import com.bluecomet.accounts.repository.AccountRepository;
import com.bluecomet.accounts.repository.CustomerRepository;
import com.bluecomet.accounts.service.IAccountService;

import java.util.Optional;
import java.util.Random;

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
	 * main methods to save the Customer and Account details in Database
     */
    @Override
    public void createAccount(CustomerDto customerDto) throws CustomerAlreadyExistsException {
		Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());

		Optional<Customer> customerAlreadyExists = customerRepository.findByMobileNumber(customer.getMobileNumber());
		if (customerAlreadyExists.isPresent()) throw new CustomerAlreadyExistsException("Customer already exists with given mobile number: " + customer.getMobileNumber());

		customer.setCreatedBy("SYSTEM");
		Customer savedCustomer = customerRepository.save(customer);

		accountRepository.save(createNewAccount(savedCustomer));
    }

	/**
	 *
	 * @param savedCustomer - after Customer details are saved in @{link {@link AccountServiceImpl#createAccount(CustomerDto)}} the account details are set in this methods
	 * @return Account instance which will then be used to save in @{@link AccountServiceImpl#createAccount(CustomerDto)}
	 */
	private Account createNewAccount (Customer savedCustomer) {
		Account newAccount = new Account();

		// AccountNumber creation
		long randomAccNumber = 1000000000L + new Random().nextInt(900000000); // sloppy way to create an account number
		newAccount.setAccountNumber(randomAccNumber);

		newAccount.setCustomer(savedCustomer);
		newAccount.setAccountType(AccountConstants.SAVINGS);
		newAccount.setBranchAddress(AccountConstants.ADDRESS);
		newAccount.setCreatedBy("SYSTEM");
		return newAccount;

	}
}
