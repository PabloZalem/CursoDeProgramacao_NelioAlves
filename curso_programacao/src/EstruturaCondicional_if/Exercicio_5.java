package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		//Scanner para leitura
		Scanner sc = new Scanner(System.in);
		
		//Inserir o código:
		System.out.println("Informe o código do lanche:");
		System.out.println("1- Hot-Dog");
		System.out.println("2- X-Salada");
		System.out.println("3- X-Bacon");
		System.out.println("4- Torrada simples");
		System.out.println("5- Refrigerante");
		int codigo = sc.nextInt();
		
		System.out.print("E a quantidade: ");
		int qtd = sc.nextInt();
		
		if (codigo == 1) {
			int resultado = 4 * qtd;
			System.out.println("O resultado: " + resultado);
		}else if (codigo == 2) {
			double resultado = (float) 4.5f * qtd;
			System.out.println("O resultado: " + resultado);
		}else if (codigo == 3) {
			double resultado = 5 * qtd;
			System.out.println("O resultado: " + resultado);
		}else if (codigo == 4) {
			double resultado = 2 * qtd;
			System.out.println("O resultado: " + resultado);
		}else if (codigo == 5) {
			double resultado = (float) 1.5f * qtd;
			System.out.println("O resultado: " + resultado);
		}
	}
}
