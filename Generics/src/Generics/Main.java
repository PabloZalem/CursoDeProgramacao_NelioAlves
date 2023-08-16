package Generics;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ImprimirServicoString<Integer> servico_1 = new ImprimirServicoString<>();
		System.out.println("Quanto custa: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			Integer valor = sc.nextInt();
			servico_1.adicionarValor(valor);
		}
		servico_1.print();
		System.out.println("O primeiro: " + servico_1.primeiro());
		
		sc.close();
	}
}
