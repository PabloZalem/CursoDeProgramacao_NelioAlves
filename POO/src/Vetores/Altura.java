package Vetores;

import java.util.Scanner;

public class Altura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int n = scanner.nextInt();

		// Verifica se o valor de N está dentro do limite
		if (n <= 0) {
			System.out.println("A quantidade de pessoas deve ser um número inteiro positivo.");
			return;
		}

		// Arrays para armazenar os dados das pessoas
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		// Leitura dos dados das pessoas
		for (int i = 0; i < n; i++) {
			System.out.println("\nDigite os dados da pessoa " + (i + 1) + ":");
			System.out.print("Nome: ");
			nomes[i] = scanner.next();
			System.out.print("Idade: ");
			idades[i] = scanner.nextInt();
			System.out.print("Altura: ");
			alturas[i] = scanner.nextDouble();
		}

		// Cálculo da altura média das pessoas
		double somaAlturas = 0;
		for (double altura : alturas) {
			somaAlturas += altura;
		}
		double alturaMedia = somaAlturas / n;

		// Cálculo da porcentagem de pessoas com menos de 16 anos
		int pessoasMenoresDe16 = 0;
		StringBuilder nomesMenoresDe16 = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				pessoasMenoresDe16++;
				nomesMenoresDe16.append(nomes[i]).append(", ");
			}
		}

		double porcentagemMenoresDe16 = (pessoasMenoresDe16 * 100.0) / n;

		// Exibição dos resultados
		System.out.println("\nAltura média das pessoas: " + alturaMedia + " metros");
		System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemMenoresDe16 + "%");

		if (pessoasMenoresDe16 > 0) {
			System.out.println("Nomes das pessoas com menos de 16 anos: "
					+ nomesMenoresDe16.substring(0, nomesMenoresDe16.length() - 2));
		}

		scanner.close();
	}
}
