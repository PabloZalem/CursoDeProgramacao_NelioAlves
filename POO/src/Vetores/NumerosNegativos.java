package Vetores;

import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Leitura do número inteiro positivo N
		System.out.print("Digite a quantidade de números (máximo = 10): ");
		int n = scanner.nextInt();

		// Verifica se o valor de N está dentro do limite
		if (n <= 0 || n > 10) {
			System.out.println("O valor de N deve ser um número inteiro positivo menor ou igual a 10.");
			return;
		}

		// Criação do vetor para armazenar os números inteiros
		int[] numeros = new int[n];

		// Leitura dos N números inteiros e armazenamento no vetor
		System.out.println("Digite os números:");
		for (int i = 0; i < n; i++) {
			numeros[i] = scanner.nextInt();
		}

		// Exibição dos números negativos
		System.out.println("Números negativos lidos:");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}

		scanner.close();
	}
}
