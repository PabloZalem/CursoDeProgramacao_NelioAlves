package Polimorfismo_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de Produto: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Produto(name, price));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(name, price, date));
			}
			else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new ProdutoImportado(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Produto prod : list) {
			System.out.println(prod.precoDaEtiqueta());
		}
		
		sc.close();
	}
}
