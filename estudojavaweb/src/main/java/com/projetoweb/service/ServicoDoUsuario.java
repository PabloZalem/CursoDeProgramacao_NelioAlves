package com.projetoweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetoweb.entities.Usuario;
import com.projetoweb.exceptions.DatabaseException;
import com.projetoweb.exceptions.ResourceNotFoundException;
import com.projetoweb.repositories.RepositorioDoUsuario;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ServicoDoUsuario {
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	public List<Usuario> findAll(){
		return repositorioDoUsuario.findAll();
	}
	
	public Usuario findById(Long Id) {
		Optional<Usuario> obj = repositorioDoUsuario.findById(Id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
	}
	
	//Inserir no banco
	public Usuario inserir(Usuario obj) {
		return repositorioDoUsuario.save(obj);
	}
	
	//Deletar no Banco de dados
	public void deletar(Long obj) {		
		try {
			repositorioDoUsuario.deleteById(obj);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(obj);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Usuario atualizar(Long id, Usuario obj){
		try {
		Usuario usuario = repositorioDoUsuario.getReferenceById(id);
		atualizarDado(usuario, obj);
		return repositorioDoUsuario.save(usuario);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(obj);
		}
	}
	
	private void atualizarDado(Usuario usuario, Usuario obj) {
		usuario.setNome(obj.getNome());
		usuario.setEmail(obj.getEmail());
		usuario.setTelefone(obj.getTelefone());
	}
}
