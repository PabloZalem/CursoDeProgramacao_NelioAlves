package com.projetoweb.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFoundException(ResourceNotFoundException e, HttpServletRequest httpServletRequest){
		String error = "Recurso nao encontrado";
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error, e.getMessage(), httpServletRequest.getRequestURI());
		return ResponseEntity.status(httpStatus).body(standardError);
	}
	
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseException(DatabaseException e, HttpServletRequest httpServletRequest){
		String error = "Erro de Banco de Dados";
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error, e.getMessage(), httpServletRequest.getRequestURI());
		return ResponseEntity.status(httpStatus).body(standardError);
	}
}
