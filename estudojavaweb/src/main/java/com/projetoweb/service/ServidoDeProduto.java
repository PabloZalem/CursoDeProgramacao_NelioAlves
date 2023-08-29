package com.projetoweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.entities.Produto;
import com.projetoweb.repositories.RepositorioDeProduto;

@Service
public class ServidoDeProduto {
	
	@Autowired
	private RepositorioDeProduto repositorioDeProduto;
	
	public List<Produto> findAll(){
		return repositorioDeProduto.findAll();
	}
	
	public Produto findById(Long Id) {
		Optional<Produto> obj = repositorioDeProduto.findById(Id);
		return obj.get();
	}
}
