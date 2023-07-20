package EstruturaFor;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Digite a quantidade de valores a serem lidos: ");
		N = sc.nextInt();

		int dentroIntervalo = 0;
		int foraIntervalo = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			int X = sc.nextInt();

			if (X >= 10 && X <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}

		System.out.println("Quantidade de valores dentro do intervalo: " + dentroIntervalo);
		System.out.println("Quantidade de valores fora do intervalo: " + foraIntervalo);

		sc.close();

	}
}