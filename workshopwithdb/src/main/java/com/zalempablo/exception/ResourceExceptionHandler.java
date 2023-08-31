package com.zalempablo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	//Essa classe irá tratar possiveis erro na hora da execuacao
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundException e, HttpServletRequest httpServletRequest){
		String error = "Recurso nao encontrado";
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(System.currentTimeMillis(), httpStatus.value(), error, e.getMessage(), httpServletRequest.getRequestURI());
		return ResponseEntity.status(httpStatus).body(standardError);
	}

}
