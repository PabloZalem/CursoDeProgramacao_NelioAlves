package com.projetoweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.entities.Pedido;
import com.projetoweb.entities.Usuario;
import com.projetoweb.service.ServicoDoPedido;
import com.projetoweb.service.ServicoDoUsuario;

@RestController
@RequestMapping(value = "/pedidos")
public class OrderResource{
	//criar endpoint controlador rest do usuario
	
	@Autowired
	public ServicoDoPedido servicoDoPedido;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> list = servicoDoPedido.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		Pedido obj = servicoDoPedido.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
