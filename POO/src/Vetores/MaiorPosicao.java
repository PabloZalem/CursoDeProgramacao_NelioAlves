package Vetores;

import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int n = scanner.nextInt();

		// Verifica se o valor de N está dentro do limite
		if (n <= 0) {
			System.out.println("A quantidade de números deve ser um número inteiro positivo.");
			return;
		}

		// Criação do vetor para armazenar os números reais
		double[] numeros = new double[n];

		// Leitura dos números reais e armazenamento no vetor
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}

		// Encontra o maior número e a sua posição no vetor
		double maiorNumero = numeros[0];
		int posicaoMaior = 0;

		for (int i = 1; i < n; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicaoMaior = i;
			}
		}

		// Exibição do maior número e da posição do maior elemento no vetor
		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("A posição do maior elemento é: " + posicaoMaior);

		scanner.close();
	}
}
