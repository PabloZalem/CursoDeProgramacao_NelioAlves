package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.entities.Categoria;

@Repository
public interface RepositorioDeCategoria extends JpaRepository<Categoria, Long>{

}
