package com.hcl.abcstock.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	

	
	@ExceptionHandler(value=Exception.class)
	protected ResponseEntity<Object> exceptionHandler(Exception exception) {
		Errors errors = new Errors();			
		errors.setErrorMsg("Exe Error");
        return new ResponseEntity(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
	@ExceptionHandler(value=StockNotAvailableException.class)
	protected ResponseEntity<Object> stockexceptionHandler(Exception exception) {
		Errors errors = new Errors();			
		errors.setErrorMsg(exception.getMessage());
        return new ResponseEntity(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
}
