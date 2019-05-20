package com.hcl.abcstock.services;

import java.util.List;

import com.hcl.abcstock.models.Transaction;

public interface TransactionService {

	List<Transaction> findTransactionsByUserName(String username);
	
}
