package Vetores;

import java.util.Scanner;

public class SomaDeVetores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o tamanho dos vetores: ");
		int n = scanner.nextInt();

		// Verifica se o tamanho dos vetores é válido
		if (n <= 0) {
			System.out.println("O tamanho dos vetores deve ser um número inteiro positivo.");
			return;
		}

		// Criação dos vetores A, B e C
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		// Leitura dos elementos dos vetores A e B
		System.out.println("Digite os elementos do vetor A:");
		for (int i = 0; i < n; i++) {
			vetorA[i] = scanner.nextInt();
		}

		System.out.println("Digite os elementos do vetor B:");
		for (int i = 0; i < n; i++) {
			vetorB[i] = scanner.nextInt();
		}

		// Geração do vetor C com a soma dos elementos de A e B
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		// Impressão do vetor C gerado
		System.out.println("Vetor C (soma dos vetores A e B):");
		for (int i = 0; i < n; i++) {
			System.out.print(vetorC[i] + " ");
		}

		scanner.close();
	}
}
