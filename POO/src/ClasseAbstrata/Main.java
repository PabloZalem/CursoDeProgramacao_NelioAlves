package ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Conta> list = new ArrayList<>();
		list.add(new ContasSalvas(1001, "Alex", 1000.0, 0.01));
		list.add(new ContaBusiness(1002, "Bob", 2000.0, 400.0));
		list.add(new ContasSalvas(1003, "Fred", 500.0, 0.01));
		list.add(new ContaBusiness(1004, "Laura", 2000.0, 200.0));
		
		double soma = 0.0;
		for (Conta acc : list) {
			soma += acc.getBalance();
		}
		System.out.printf("Total: %.2f", soma);
		
		for (Conta acc : list) {
			acc.deposit(10.0);
		}
		for (Conta acc : list) {
			System.out.printf("Atualizando o saldo das contas %d: %.2f\n", acc.getNumber(), acc.getBalance());
		}
		
	}
}
