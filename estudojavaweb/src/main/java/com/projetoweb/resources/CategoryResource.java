package com.projetoweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.entities.Categoria;
import com.projetoweb.service.ServicoDeCategoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoryResource {
	//criar endpoint controlador rest do usuario
	
	@Autowired
	private ServicoDeCategoria servicoDeCategoria;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = servicoDeCategoria.findaAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria obj = servicoDeCategoria.finById(id);
		return ResponseEntity.ok().body(obj);
	}
}
