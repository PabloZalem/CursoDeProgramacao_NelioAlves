package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programacao_ConsultandoUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("estudo-jpa");
		EntityManager em = enf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		em.close();
		enf.close();
	}

}
