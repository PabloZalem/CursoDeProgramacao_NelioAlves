package Vetores;

import java.util.Scanner;

public class Aprovados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos: ");
		int quantidadeAlunos = scanner.nextInt();

		// Vetores para armazenar os nomes, notas do 1º e 2º semestres
		String[] nomes = new String[quantidadeAlunos];
		double[] notasSemestre1 = new double[quantidadeAlunos];
		double[] notasSemestre2 = new double[quantidadeAlunos];

		// Leitura dos nomes e notas dos alunos
		for (int i = 0; i < quantidadeAlunos; i++) {
			scanner.nextLine(); // Limpa o buffer do scanner
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			nomes[i] = scanner.nextLine();

			System.out.print("Digite a nota do 1º semestre do aluno " + (i + 1) + ": ");
			notasSemestre1[i] = scanner.nextDouble();

			System.out.print("Digite a nota do 2º semestre do aluno " + (i + 1) + ": ");
			notasSemestre2[i] = scanner.nextDouble();
		}

		// Verificar e imprimir os nomes dos alunos aprovados
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < quantidadeAlunos; i++) {
			double media = (notasSemestre1[i] + notasSemestre2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}

		scanner.close();
	}
}
