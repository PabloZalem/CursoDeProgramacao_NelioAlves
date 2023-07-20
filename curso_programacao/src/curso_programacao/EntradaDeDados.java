package curso_programacao;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		/*
		 	Entrada de dados: 
		 		Usando o teclado por exemplo para efetuar aquela entrada;
		 		Tambem chamada de Leitura: O PROGRAMA ESTÁ LENDO DADOS
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva algo: ");
		String x = sc.nextLine();
		System.out.println("Voce digitou: " + x);
		
		
		//Para ler um char
		char c  = sc.next().charAt(0);
		System.out.println("Escrita com char: " + c);
		
		sc.close();
	}
}
