package EstruturaFor;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X;

		do {
			System.out.print("Digite um valor inteiro entre 1 e 1000 (inclusive): ");
			X = sc.nextInt();
		} while (X < 1 || X > 1000);

		System.out.println("Números ímpares de 1 até " + X + ":");
		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
