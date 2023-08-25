package com.projetoweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.entities.Usuario;
import com.projetoweb.service.ServicoDoUsuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource{
	//criar endpoint controlador rest do usuario
	
	@Autowired
	public ServicoDoUsuario servicoDoUsuario;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = servicoDoUsuario.findAll();
		return ResponseEntity.ok().body(list);
	}
}
