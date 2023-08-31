package com.zalempablo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zalempablo.domain.Usuario;

@Repository
public interface RepositorioDoUsuario extends MongoRepository<Usuario, String>{


}
