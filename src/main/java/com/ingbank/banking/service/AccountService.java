package com.ingbank.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingbank.banking.model.AccountModel;

@Service
public interface AccountService {

	public AccountModel addAccount(AccountModel model);
	public AccountModel getAccount(Long id);
	public List<AccountModel> getAccounts();
	public AccountModel updateAccount(AccountModel model);
	public AccountModel deleteAccount(AccountModel model);
	
	
}
