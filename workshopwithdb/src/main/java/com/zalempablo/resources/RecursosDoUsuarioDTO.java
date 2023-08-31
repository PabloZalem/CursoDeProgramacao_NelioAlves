package com.zalempablo.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zalempablo.domain.Post;
import com.zalempablo.domain.Usuario;
import com.zalempablo.dto.UsuarioDTO;
import com.zalempablo.service.ServicoDoUsuario;

@RestController
@RequestMapping(value="/usuarios")
public class RecursosDoUsuarioDTO {
	//criando o caminho
	 
	@Autowired
	private ServicoDoUsuario servicoDoUsuario;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<Usuario> list = servicoDoUsuario.findAll();
		List<UsuarioDTO> listDTO = list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.GET)
	public ResponseEntity<UsuarioDTO> findById(@PathVariable String id){
		Usuario usuario = servicoDoUsuario.findById(id); 	
		return ResponseEntity.ok().body(new UsuarioDTO(usuario));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UsuarioDTO usuarioDTO){
		Usuario usuario = servicoDoUsuario.fromDTO(usuarioDTO);
		usuario = servicoDoUsuario.insert(usuario);		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id){
		Usuario usuario = servicoDoUsuario.findById(id); 
		servicoDoUsuario.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody UsuarioDTO usuarioDTO, @PathVariable String id){
		Usuario usuario = servicoDoUsuario.fromDTO(usuarioDTO);
		usuario.setId(id);
		usuario = servicoDoUsuario.update(usuario);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}/posts",  method = RequestMethod.GET)
	public ResponseEntity<List<Post>> findPosts(@PathVariable String id){
		Usuario usuario = servicoDoUsuario.findById(id); 	
		return ResponseEntity.ok().body(usuario.getPosts());
	}
}
