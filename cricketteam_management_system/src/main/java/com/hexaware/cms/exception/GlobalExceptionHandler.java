package com.hexaware.cms.exception;
/*
 * Author: RAJESHWARI
 * Description : Global Exception Handler 
 * Date : 22-11-2024
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(PlayerNotFoundException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
