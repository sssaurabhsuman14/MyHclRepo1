package com.ingbank.banking.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingbank.banking.model.AccountModel;
import com.ingbank.banking.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/add")
	public void addAccount(@RequestBody AccountModel model) {
		accountService.addAccount(model);
	}
	
	
	
	
	
}
