package EstruturaFor;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite o número de casos de teste: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite os 3 valores reais do caso de teste " + (i + 1) + ":");
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();

			double mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3);
			System.out.printf("Média ponderada do caso de teste %d: %.1f%n", (i + 1), mediaPonderada);
		}

		sc.close();
	}

	private static double calcularMediaPonderada(double valor1, double valor2, double valor3) {
		double peso1 = 2.0;
		double peso2 = 3.0;
		double peso3 = 5.0;

		return (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / (peso1 + peso2 + peso3);
	}
}
