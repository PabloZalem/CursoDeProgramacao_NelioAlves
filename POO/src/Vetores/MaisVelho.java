package Vetores;

import java.util.Scanner;

public class MaisVelho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int quantidadePessoas = scanner.nextInt();

		// Vetores para armazenar os nomes e idades das pessoas
		String[] nomes = new String[quantidadePessoas];
		int[] idades = new int[quantidadePessoas];

		// Leitura dos nomes e idades
		for (int i = 0; i < quantidadePessoas; i++) {
			scanner.nextLine(); // Limpa o buffer do scanner
			System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = scanner.nextLine();
			System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
			idades[i] = scanner.nextInt();
		}

		// Encontrar a pessoa mais velha
		int indiceMaisVelho = 0;
		for (int i = 1; i < quantidadePessoas; i++) {
			if (idades[i] > idades[indiceMaisVelho]) {
				indiceMaisVelho = i;
			}
		}

		// Exibir o nome da pessoa mais velha
		System.out.println("A pessoa mais velha é: " + nomes[indiceMaisVelho]);

		scanner.close();
	}
}
