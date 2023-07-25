package Vetores;

import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de N: ");
		int N = scanner.nextInt();

		double[] vetor = new double[N];

		// Leitura dos N números reais
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			vetor[i] = scanner.nextDouble();
		}

		// Cálculo da média
		double soma = 0;
		for (int i = 0; i < N; i++) {
			soma += vetor[i];
		}
		double media = soma / N;

		System.out.printf("Média: %.3f%n", media);

		// Elementos abaixo da média
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < N; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f%n", vetor[i]);
			}
		}

		scanner.close();
	}
}
