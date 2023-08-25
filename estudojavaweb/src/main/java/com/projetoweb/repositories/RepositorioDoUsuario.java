package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.entities.Usuario;

@Repository
public interface RepositorioDoUsuario extends JpaRepository<Usuario, Long>{
	//Spring já tem a implementação padrão
	
}
