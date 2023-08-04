package ExercicioDeTratamentoDeExcecao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta acc = new Conta();
		
		System.out.println("Informe o numero da conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Saque: ");
		double saque = sc.nextDouble();
		
		Conta c1 = new Conta(numero, nome, saldo, saque);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			c1.saque(amount);	
			System.out.print("Novo salario: " + String.format("%.2f", c1.getSaldo()));
		}catch (ContaException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
