package com.zalempablo.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zalempablo.domain.Post;
import com.zalempablo.service.ServicoDoPost;
import com.zalempablo.util.URL;

@RestController
@RequestMapping(value="/posts")
public class RecursosDoPost {
	//criando o caminho
	 
	@Autowired
	private ServicoDoPost servicoDoPost;
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post post = servicoDoPost.findById(id); 	
		return ResponseEntity.ok().body(post);
	}

	
	@RequestMapping(value = "/titulodepesquisa",  method = RequestMethod.GET)
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String texto){
		texto = URL.decodeParam(texto);
		List<Post> list = servicoDoPost.findByTitle(texto);
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/pesquisacompleta",  method = RequestMethod.GET)
	public ResponseEntity<List<Post>> fullSearch(
			@RequestParam(value = "text", defaultValue = "") String texto,
			@RequestParam(value = "dataMin", defaultValue = "") String dataMin,
			@RequestParam(value = "dataMax", defaultValue = "") String dataMax
			){
		texto = URL.decodeParam(texto);
		Date min = URL.converterData(dataMin, new Date(0L));
		Date max = URL.converterData(dataMax, new Date());
		List<Post> list = servicoDoPost.fullSearch(texto, min, max);
		return ResponseEntity.ok().body(list);
	}
}
