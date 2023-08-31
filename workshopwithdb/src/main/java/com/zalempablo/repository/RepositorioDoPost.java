package com.zalempablo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zalempablo.domain.Post;

@Repository
public interface RepositorioDoPost extends MongoRepository<Post, String>{

	//field : title
	@Query("{ <titulo>: { $regex: ?0, $options: 'i' } }")
	List<Post> findByTitle(String texto);
	
	//Monta a consulta
	List<Post> findByTitleIgnoreCase(String texto);
	
	@Query(" { $and: [ {data: {$gte: ?1} }, {data: { $lte: ?2 } }, { $or: [ { <titulo>: { $regex: ?0, $options: 'i' } }, { <corpo>: { $regex: ?0, $options: 'i' } }, { <comentarios.texto>: { $regex: ?0, $options: 'i' } } ] } ] } ")
	List<Post> fullSearch(String texto, Date dataMinima, Date dataMaxima);
}
