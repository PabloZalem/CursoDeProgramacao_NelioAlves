package EstruturaFor;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();

		long fatorial = calcularFatorial(N);
		System.out.println("Fatorial de " + N + " = " + fatorial);

		sc.close();
	}

	private static long calcularFatorial(int n) {
		if (n == 0) {
			return 1;
		}

		long fatorial = 1;
		for (int i = n; i >= 1; i--) {
			fatorial *= i;
		}
		return fatorial;
	}
}
