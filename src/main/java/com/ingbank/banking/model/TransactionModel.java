package com.ingbank.banking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionModel implements Serializable{

	private static final long serialVersionUID = 2472533295875578066L;

	private Long txnId;
	
	private Double txnAmt;
	
	private Date txnDate;
	
	private String txnType;
	
	private AccountModel account;
	
	
	
	
	

}
