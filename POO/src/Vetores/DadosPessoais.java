package Vetores;

import java.util.Scanner;

public class DadosPessoais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de pessoas: ");
		int n = scanner.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		// Leitura dos dados
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da pessoa " + (i + 1) + ": ");
			alturas[i] = scanner.nextDouble();

			System.out.print("Gênero (M/F) da pessoa " + (i + 1) + ": ");
			generos[i] = scanner.next().charAt(0);
		}

		scanner.close();

		// Cálculo da maior e menor altura
		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];

		// Cálculo da média de altura das mulheres
		double somaAlturasMulheres = 0;
		int countMulheres = 0;

		// Contagem de homens
		int countHomens = 0;

		for (int i = 0; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}

			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}

			if (generos[i] == 'F') {
				somaAlturasMulheres += alturas[i];
				countMulheres++;
			} else if (generos[i] == 'M') {
				countHomens++;
			}
		}

		double mediaAlturasMulheres = 0;
		if (countMulheres > 0) {
			mediaAlturasMulheres = somaAlturasMulheres / countMulheres;
		}

		// Exibindo os resultados
		System.out.println("\nMaior altura: " + maiorAltura);
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Média de altura das mulheres: " + mediaAlturasMulheres);
		System.out.println("Número de homens: " + countHomens);
	}
}
