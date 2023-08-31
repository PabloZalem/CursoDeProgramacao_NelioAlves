package com.zalempablo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zalempablo.domain.Post;
import com.zalempablo.exception.ObjectNotFoundException;
import com.zalempablo.repository.RepositorioDoPost;

@Service
public class ServicoDoPost {
	
	//Mecanimos de injecao de dependencia
	@Autowired
	private RepositorioDoPost repositorioDoPost;

	public Post findById(String Id) {
		Optional<Post> obj = repositorioDoPost.findById(Id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(Id));
	}
	
	public List<Post> findByTitle(String texto){
		return repositorioDoPost.findByTitle(texto);
	}
	
	public List<Post> fullSearch(String texto, Date dataMin, Date dataMax){
		dataMax = new Date(dataMax.getTime() + 24 * 60 * 60 * 1000);
		return repositorioDoPost.fullSearch(texto, dataMin, dataMax);
	}
}
