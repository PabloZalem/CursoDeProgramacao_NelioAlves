package OperadoresCumulativa;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi o tempo e minutos que veio sua conta");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			//conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("A quantidade em minutos: %d e o valor: %.2f", minutos,conta);
		
		sc.close();
	}
}
