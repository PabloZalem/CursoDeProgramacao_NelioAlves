package ExercicioDeVetor;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		Produto[] valor = new Produto[n];	
		
		for(int i = 0; i < valor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			valor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < valor.length; i++) {
			soma += valor[i].getValor();
		}
		
		double media = soma/n;
		System.out.printf("A media: %.2f", media);
		
		sc.close();
	}
}
