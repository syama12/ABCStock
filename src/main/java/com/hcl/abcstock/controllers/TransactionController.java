//package com.hcl.abcstock.controllers;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hcl.abcstock.models.Transaction;
//import com.hcl.abcstock.models.User;
//import com.hcl.abcstock.services.TransactionService;
//
//@RestController
//@RequestMapping(path="/api")
//public class TransactionController {
//
//	private Logger logger = LoggerFactory.getLogger(UserController.class);
//	
//	@Autowired
//	TransactionService transactionService;  
//
//	@RequestMapping(value = "/transactions/{userId}", method = RequestMethod.GET)
//	public ResponseEntity<List<Transaction>> listTransactions(@PathVariable String userId) {
//		logger.info("inside listTransactions");
//		List<Transaction> transactions = transactionService.findTransactionsByUserName(userId);
//		if(transactions.isEmpty()){
//			logger.info("Users not available");
//			return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
//		}
//		return new ResponseEntity<List<Transaction>>(transactions, HttpStatus.OK);
//	}
//	
//}
