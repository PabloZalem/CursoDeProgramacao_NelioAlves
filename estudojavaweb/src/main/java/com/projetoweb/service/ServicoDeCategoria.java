package com.projetoweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.entities.Categoria;
import com.projetoweb.repositories.RepositorioDeCategoria;

@Service
public class ServicoDeCategoria {
	
	@Autowired
	private RepositorioDeCategoria repositorioDeCategoria;
	
	public List<Categoria> findaAll(){
		return repositorioDeCategoria.findAll();
	}
	
	public Categoria finById(Long Id) {
		Optional<Categoria> obj = repositorioDeCategoria.findById(Id);
		return obj.get();
	}
}
