package com.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoweb.entities.ItemDoPedido;

@Repository
public interface RepositorioDePedidoDoItem extends JpaRepository<ItemDoPedido, Long>{


}
