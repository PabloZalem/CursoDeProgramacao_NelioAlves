package com.projetoweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.entities.Pedido;
import com.projetoweb.entities.Usuario;
import com.projetoweb.repositories.RepositorioDePedido;
import com.projetoweb.repositories.RepositorioDoUsuario;

@Configuration
@Profile("test")
public class ConfiguracaoDeTeste implements CommandLineRunner{
	//Popular nosso banco de dados
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	@Autowired
	private RepositorioDePedido repositorioDePedido;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
		Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		//instanciar banco de dados
		repositorioDoUsuario.saveAll(Arrays.asList(u1, u2));
		repositorioDePedido.saveAll(Arrays.asList(p1,p2,p3));
	}
}
