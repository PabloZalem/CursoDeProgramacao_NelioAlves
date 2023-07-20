package EstruturaFor;

import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite um número inteiro positivo N: ");
		N = sc.nextInt();

		System.out.println("Linhas, Quadrado, Cubo");
		for (int i = 1; i <= N; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;

			System.out.printf("%5d %8d %8d%n", i, quadrado, cubo);
		}

		sc.close();
	}
}
