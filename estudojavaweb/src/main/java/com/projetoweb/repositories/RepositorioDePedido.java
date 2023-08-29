package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.entities.Pedido;

@Repository
public interface RepositorioDePedido extends JpaRepository<Pedido, Long>{
	//Spring já tem a implementação padrão
	
}
