package com.zalempablo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.zalempablo.domain.Usuario;
import com.zalempablo.repository.RepositorioDoUsuario;

@Configuration
public class Instanciacao implements CommandLineRunner{
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;

	@Override
	public void run(String... args) throws Exception {
		//Limpar a colecao do banco
		repositorioDoUsuario.deleteAll();
				
		Usuario maria = new Usuario(null, "Maria Brown", "maria@gmail.com");
		Usuario alex = new Usuario(null, "Alex Green", "alex@gmail.com");
		Usuario bob = new Usuario(null, "Bob Grey", "bob@gmail.com");
		
		repositorioDoUsuario.saveAll(Arrays.asList(maria, alex, bob));
	}

}
