package ExercicioDeFixacao_2_Conceitual;

import java.util.Scanner;

public class CalculoDeConversaoDoDolar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("O valor do conversão do dolar: ");

		double c = sc.nextDouble();
		double cv = conversaoDoDolar(c);

		System.out.printf("O valor a ser pago em reais: %.2f", cv);
	}

	public static double conversaoDoDolar(double valor) {
		return ((valor * 3.10f) * 0.06) + (valor * 3.10f);
	}
}