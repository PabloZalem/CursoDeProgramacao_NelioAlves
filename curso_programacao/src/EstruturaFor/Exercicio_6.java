package EstruturaFor;

import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite o número inteiro N: ");
		N = sc.nextInt();

		System.out.println("Divisores de " + N + ":");
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
