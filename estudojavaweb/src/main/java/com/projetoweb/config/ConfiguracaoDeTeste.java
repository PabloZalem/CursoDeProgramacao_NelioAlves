package com.projetoweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.entities.Categoria;
import com.projetoweb.entities.ItemDoPedido;
import com.projetoweb.entities.Pagamento;
import com.projetoweb.entities.Pedido;
import com.projetoweb.entities.Produto;
import com.projetoweb.entities.Usuario;
import com.projetoweb.enums.StatusDoPedido;
import com.projetoweb.repositories.RepositorioDeCategoria;
import com.projetoweb.repositories.RepositorioDePedido;
import com.projetoweb.repositories.RepositorioDePedidoDoItem;
import com.projetoweb.repositories.RepositorioDeProduto;
import com.projetoweb.repositories.RepositorioDoUsuario;

@Configuration
@Profile("test")
public class ConfiguracaoDeTeste implements CommandLineRunner{
	//Popular nosso banco de dados
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;
	
	@Autowired
	private RepositorioDePedido repositorioDePedido;
	
	@Autowired
	private RepositorioDeCategoria repositorioDeCategoria;
	
	@Autowired
	private RepositorioDeProduto repositorioDeProduto;
	
	@Autowired
	private RepositorioDePedidoDoItem repositorioDePedidoDoItem;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers"); 		
		repositorioDeCategoria.saveAll(Arrays.asList(cat1,cat2,cat3));
			
		Produto p1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto p5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		repositorioDeProduto.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategorias().add(cat2);
		p2.getCategorias().add(cat1);
		p2.getCategorias().add(cat3);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat3);
		p5.getCategorias().add(cat2);
		
		repositorioDeProduto.saveAllAndFlush(Arrays.asList(p1,p2,p3,p4,p5));
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Pedido pro1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusDoPedido.PAGO, u1); 
		Pedido pro2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), StatusDoPedido.ENTREGUE, u2); 
		Pedido pro3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), StatusDoPedido.ENVIADO, u1);
		//instanciar banco de dados
		repositorioDoUsuario.saveAll(Arrays.asList(u1, u2));
		repositorioDePedido.saveAll(Arrays.asList(pro1,pro2,pro3));
		
		ItemDoPedido oi1 = new ItemDoPedido(pro1, p1, 2, p1.getPreco());
		ItemDoPedido oi2 = new ItemDoPedido(pro1, p3, 1, p3.getPreco());
		ItemDoPedido oi3 = new ItemDoPedido(pro2, p3, 2, p3.getPreco());
		ItemDoPedido oi4 = new ItemDoPedido(pro3, p5, 2, p5.getPreco()); 
		repositorioDePedidoDoItem.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
		
		Pagamento pay1 = new Pagamento(null, Instant.parse("2019-06-20T21:53:07Z"),pro1);
		pro1.setPagamento(pay1);
		repositorioDePedido.save(pro1);
	}
}
