package CriandoFuncoesQueRecebemFuncoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ServicoDeProduto sp = new ServicoDeProduto();
		
		double som_1 = sp.somaFiltrada(list, p -> p.getName().charAt(0) == 'T');
		double som_2 = sp.somaFiltrada(list, p -> p.getName().charAt(0) == 'M');
		double som_3 = sp.somaFiltrada(list, p -> p.getPrice() < 100.0);
		System.out.print("Soma: " + String.format("%.2f", som_1));
		System.out.println();
		System.out.print("Soma: " + String.format("%.2f", som_2));
		System.out.println();
		System.out.print("Soma: " + String.format("%.2f", som_3));
	}
}
