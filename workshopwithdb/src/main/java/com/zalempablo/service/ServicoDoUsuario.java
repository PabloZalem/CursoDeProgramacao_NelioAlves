package com.zalempablo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zalempablo.domain.Usuario;
import com.zalempablo.dto.UsuarioDTO;
import com.zalempablo.exception.ObjectNotFoundException;
import com.zalempablo.repository.RepositorioDoUsuario;

@Service
public class ServicoDoUsuario {
	
	//Mecanimos de injecao de dependencia
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	public List<Usuario> findAll(){
		return repositorioDoUsuario.findAll();
	}
	
	public Usuario findById(String Id) {
		Optional<Usuario> obj = repositorioDoUsuario.findById(Id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(Id));
	}
	
	public Usuario insert(Usuario obj) {
		return repositorioDoUsuario.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repositorioDoUsuario.deleteById(id);
	}
	
	public Usuario update(Usuario obj) {
		Usuario newObj = findById(obj.getId());
		atualizarDado(newObj, obj);
		return repositorioDoUsuario.save(newObj);
	}
	
	private void atualizarDado(Usuario usuarioAtualizado, Usuario id) {
		usuarioAtualizado.setNome(id.getNome());
		usuarioAtualizado.setEmail(id.getEmail());
	}

	public Usuario fromDTO(UsuarioDTO usuarioDTO) {
		return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail());
	}
}
