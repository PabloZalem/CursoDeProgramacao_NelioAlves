package com.projetoweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.entities.Usuario;
import com.projetoweb.repositories.RepositorioDoUsuario;

@Configuration
@Profile("test")
public class ConfiguracaoDeTeste implements CommandLineRunner{
	//Popular nosso banco de dados
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		//instanciar banco de dados
		repositorioDoUsuario.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
