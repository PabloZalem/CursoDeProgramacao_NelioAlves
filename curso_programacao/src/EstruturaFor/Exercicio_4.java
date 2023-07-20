package EstruturaFor;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o primeiro número do par " + (i + 1) + ": ");
			int numerador = sc.nextInt();

			System.out.print("Digite o segundo número do par " + (i + 1) + ": ");
			int denominador = sc.nextInt();

			if (denominador != 0) {
				double resultado = (double) numerador / denominador;
				System.out.printf("Resultado da divisão: %.2f%n", resultado);
			} else {
				System.out.println("Divisão impossível (denominador igual a zero).");
			}
		}

		sc.close();
	}
}
