package com.projetoweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.entities.Produto;
import com.projetoweb.service.ServidoDeProduto;

@RestController
@RequestMapping(value = "/produtos")
public class ProductResource {
	
	@Autowired
	public ServidoDeProduto servidoDeProduto;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> list = servidoDeProduto.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id){
		Produto obj = servidoDeProduto.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
