package com.zalempablo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.zalempablo.domain.Post;
import com.zalempablo.domain.Usuario;
import com.zalempablo.dto.AutorDTO;
import com.zalempablo.dto.ComentarioDTO;
import com.zalempablo.repository.RepositorioDoPost;
import com.zalempablo.repository.RepositorioDoUsuario;

@Configuration
public class Instanciacao implements CommandLineRunner{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	@Autowired
	private RepositorioDoPost repositorioDoPost; 

	@Override
	public void run(String... args) throws Exception {
		//Limpar a colecao do banco
		repositorioDoUsuario.deleteAll();
		repositorioDoPost.deleteAll();
				
		Usuario maria = new Usuario(null, "Maria Brown", "maria@gmail.com");
		Usuario alex = new Usuario(null, "Alex Green", "alex@gmail.com");
		Usuario bob = new Usuario(null, "Bob Grey", "bob@gmail.com");
		
		repositorioDoUsuario.saveAll(Arrays.asList(maria, alex, bob));
		
		Post p1 = new Post(null, sdf.parse("21/03/2018"),"Partiu viagem","Vou viajar para São Paulo. Abraços!",new AutorDTO(maria));
		Post p2 = new Post(null, sdf.parse("23/03/2018"),"Acordei feliz hoje!","Tenha um ótimo dia!", new AutorDTO(maria));
		
		ComentarioDTO c1 = new ComentarioDTO("Boa viagem mano!", sdf.parse("21/03/2018"), new AutorDTO(alex));
		ComentarioDTO c2 = new ComentarioDTO("Aproveite!", sdf.parse("22/03/2018"), new AutorDTO(bob));
		ComentarioDTO c3 = new ComentarioDTO("Tenha um otima dia", sdf.parse("23/03/2018"), new AutorDTO(alex));
		
		p1.getComentarios().addAll(Arrays.asList(c1,c2));
		p2.getComentarios().addAll(Arrays.asList(c3));
		
		repositorioDoPost.saveAll(Arrays.asList(p1,p2));
		
		maria.getPosts().addAll(Arrays.asList(p1,p2));
		repositorioDoUsuario.save(maria);
	}

}
