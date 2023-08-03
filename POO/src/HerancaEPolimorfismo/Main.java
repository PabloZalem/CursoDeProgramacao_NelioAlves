package HerancaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<PagadorDeImposto> list = new ArrayList<PagadorDeImposto>();
		
		System.out.println("Numero de taxa de funcionaior: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Taxa do indiviuo #" + i + "data: ");
			System.out.print("Pessoa Fisica ou Pessoa Juridica: (i/c)");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Gasto Com Saude: ");
				Double gastos = sc.nextDouble();
				PessoaFisica x = new PessoaFisica(nome, renda, gastos);
				list.add(x);
			}else {
				System.out.print("Numero de Funcionarios: ");
				Integer numeroDeFuncionario = sc.nextInt();
				PessoaJuridica y = new PessoaJuridica(nome, renda, numeroDeFuncionario);
				list.add(y);
			}
		}
		System.out.println();
		System.out.println("Taxas Pagas");
		for(PagadorDeImposto pi : list) {
			System.out.println(pi.getNome() + ": $" + String.format("%.2f", pi.tax()));
		}
		
		sc.close();
	}
}
