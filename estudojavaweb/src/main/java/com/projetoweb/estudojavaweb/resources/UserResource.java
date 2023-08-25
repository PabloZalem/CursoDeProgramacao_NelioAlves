package com.projetoweb.estudojavaweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.entities.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UserResource {
	//criar endpoint controlador rest do usuario
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1l, "Pablo", "pablo@pablo", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
