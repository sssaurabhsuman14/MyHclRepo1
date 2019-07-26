package com.ingbank.banking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel implements Serializable {
	
	
	private static final long serialVersionUID = -3161675812019427692L;

	private Long accId;
	
	private Double balance;
	
	CustomerModel customer;
	
	List<TransactionModel> transactions;

}
