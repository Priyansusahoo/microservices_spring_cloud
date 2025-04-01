package com.bluecomet.accounts.controller;

import com.bluecomet.accounts.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluecomet.accounts.constants.AccountConstants;
import com.bluecomet.accounts.model.dto.CustomerDto;
import com.bluecomet.accounts.model.exchange.ResponseEXG;

@RestController
@RequestMapping(
		path="/api/v1",
		produces = {
				MediaType.APPLICATION_JSON_VALUE
		})
public class AccountController {

	private final IAccountService iAccountService;

	@Autowired
	public AccountController (@Qualifier("accountServiceImpl") IAccountService iAccountService) {
		this.iAccountService = iAccountService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseEXG> createAccount(@RequestBody CustomerDto customerDto) {

		iAccountService.createAccount(customerDto);

		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseEXG(AccountConstants.STATUS_201, AccountConstants.MESSAGE_201));
	}
}
