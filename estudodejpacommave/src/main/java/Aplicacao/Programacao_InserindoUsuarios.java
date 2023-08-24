package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programacao_InserindoUsuarios {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Pablo Zalem", "pablo@pablo.com");
		Pessoa p2 = new Pessoa(null, "Michelle", "michelle@michlle.com");
		Pessoa p3 = new Pessoa(null, "Pedro Zalem", "pedro@pedro.com");
		
		//Primeiro
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("estudo-jpa");
		EntityManager em = enf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

	}
}
