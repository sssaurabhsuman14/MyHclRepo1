package com.ingbank.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingbank.banking.model.CustomerModel;

@Service
public interface CustomerService {
	
	public CustomerModel addCustomer(CustomerModel model);
	public CustomerModel getCustomer(Long id);
	public List<CustomerModel> getCustomers();
	public CustomerModel updateCustomer(CustomerModel model);
	public CustomerModel deleteCustomer(CustomerModel model);
}
