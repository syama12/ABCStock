package com.hcl.abcstock.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.abcstock.models.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public List<Transaction> findTransactionsByUserName(String username) {
		return null;
	}

}
