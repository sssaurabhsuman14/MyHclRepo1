package com.ingbank.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingbank.banking.model.TransactionModel;

@Service
public interface TransactionService {
	
	public TransactionModel addTransaction(TransactionModel model);
	public TransactionModel getTransaction(Long id);
	public List<TransactionModel> getTransactions();
	public TransactionModel updateTransaction(TransactionModel model);
	public TransactionModel deleteTransaction(TransactionModel model);

}
