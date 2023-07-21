package Encapsulamento;

import java.util.Scanner;

public class ExercicioDeFixacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.print("Entra com a conta: ");
		int num = sc.nextInt();

		System.out.print("Entra com o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Tem o deposito inicial (y/n): ");
		char res = sc.next().charAt(0);

		if (res == 'y') {
			System.out.print("Entra com o valor do deposito: ");
			double depositoinicial = sc.nextDouble();
			conta = new Conta(num, nome, depositoinicial);
		} else {
			conta = new Conta(num, nome);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta.toString());

		System.out.println();
		System.out.print("O valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Atualização da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("O valor de saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println("Atualização da conta: ");
		System.out.println(conta);
		sc.close();
	}
}
