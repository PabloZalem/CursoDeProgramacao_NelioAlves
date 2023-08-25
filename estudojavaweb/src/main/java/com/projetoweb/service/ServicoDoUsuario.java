package com.projetoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.entities.Usuario;
import com.projetoweb.repositories.RepositorioDoUsuario;

@Service
public class ServicoDoUsuario {
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	public List<Usuario> findAll(){
		return repositorioDoUsuario.findAll();
	}
}
