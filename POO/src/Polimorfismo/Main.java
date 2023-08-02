package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List<Empregados> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de Empregados: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i+1) + " data:");
			System.out.print("Terceiro (s/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valor = sc.nextInt();
			if (ch == 's') {
				System.out.print("Valor adicionado: ");
				double valorAdicional = sc.nextDouble();
				Empregados emp = new Terceiro(nome, horas, valor, valorAdicional);
				list.add(emp);
			} else {
				Empregados emp = new Empregados(nome, horas, valor);
				list.add(emp);
			}
		}
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for (Empregados emp : list) {
			System.out.println(emp.getNome() + "- $" + String.format("%.2f", emp.payments()));
		}
		
		sc.close();
	}
}
