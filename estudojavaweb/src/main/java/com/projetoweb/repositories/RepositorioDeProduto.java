package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.entities.Produto;

@Repository
public interface RepositorioDeProduto extends JpaRepository<Produto, Long>{

}
