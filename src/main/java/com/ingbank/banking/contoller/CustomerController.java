package com.ingbank.banking.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ingbank.banking.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

}
