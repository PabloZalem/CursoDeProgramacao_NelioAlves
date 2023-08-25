package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.entities.Usuario;

public interface RepositorioDoUsuario extends JpaRepository<Usuario, Long>{
	//Spring já tem a implementação padrão
	
}
