package Aplicacao;

import dominio.Pessoa;

public class Programacao {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Pablo Zalem", "pablo@pablo.com");
		Pessoa p2 = new Pessoa(2, "Michelle", "michelle@michlle.com");
		Pessoa p3 = new Pessoa(3, "Pedro Zalem", "pedro@pedro.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
