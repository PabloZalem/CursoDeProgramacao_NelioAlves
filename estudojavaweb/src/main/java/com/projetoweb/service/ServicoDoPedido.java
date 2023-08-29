package com.projetoweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.entities.Pedido;
import com.projetoweb.entities.Usuario;
import com.projetoweb.repositories.RepositorioDePedido;
import com.projetoweb.repositories.RepositorioDoUsuario;

@Service
public class ServicoDoPedido {
	
	@Autowired
	private RepositorioDePedido repositorioDePedido;
	
	public List<Pedido> findAll(){
		return repositorioDePedido.findAll();
	}
	
	public Pedido findById(Long Id) {
		Optional<Pedido> obj = repositorioDePedido.findById(Id);
		return obj.get();
	}
}
