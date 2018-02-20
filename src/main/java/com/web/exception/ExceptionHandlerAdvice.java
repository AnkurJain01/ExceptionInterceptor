package com.web.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> handleCustomException(RuntimeException exception){
		
		Map<String, String> testMap = new HashMap<>();
		testMap.put("msg", "test");
		System.out.println("inside handler");
		return new ResponseEntity<Object>(exception.getMessage(), HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(RuntimeException exception){
		
		Map<String, String> testMap = new HashMap<>();
		testMap.put("msg", "test");
		return new ResponseEntity<Object>(testMap, HttpStatus.OK);
	}
}
