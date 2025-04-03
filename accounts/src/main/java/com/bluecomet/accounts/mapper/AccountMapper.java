package com.bluecomet.accounts.mapper;

import com.bluecomet.accounts.model.dto.AccountDto;
import com.bluecomet.accounts.model.entity.Account;

public final class AccountMapper {

	private AccountMapper () {}



	public static AccountDto mapToAccountDto(Account account,
											 AccountDto accountDto)
	{
		accountDto.setAccountNumber(account.getAccountNumber());
		accountDto.setAccountType(account.getAccountType());
		accountDto.setBranchAddress(account.getBranchAddress());
		
		return accountDto;
	}



	public static Account mapToAccount (AccountDto accountDto,
										Account account)
	{
		account.setAccountNumber(accountDto.getAccountNumber());
		account.setAccountType(accountDto.getAccountType());
		account.setBranchAddress(accountDto.getBranchAddress());

		return account;
	}


}
