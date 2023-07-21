package Vetores;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}
		
		double media = soma/n;
		System.out.printf("Media: %.2f" + media);
		sc.close();
	}
}
