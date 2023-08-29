package com.projetoweb.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object obj) {
		super("Recurso nao encontrado. Id " + obj);
	}
}
