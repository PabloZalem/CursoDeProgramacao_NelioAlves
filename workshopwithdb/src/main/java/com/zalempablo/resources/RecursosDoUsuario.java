/*package com.zalempablo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zalempablo.domain.Usuario;
import com.zalempablo.service.ServicoDoUsuario;

@RestController
@RequestMapping(value="/usuarios")
public class RecursosDoUsuario {
	//criando o caminho
	
	@Autowired
	private ServicoDoUsuario servicoDoUsuario;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll(){
		//Usuario maria = new Usuario("1", "Maria Silva", "maria@gmail.com");
		//Usuario joao = new Usuario("2", "Joao Silva", "joao@gmail.com");
		List<Usuario> list = servicoDoUsuario.findAll();
		//list.addAll(Arrays.asList(maria,joao));		
		return ResponseEntity.ok().body(list);
	}
}
*/