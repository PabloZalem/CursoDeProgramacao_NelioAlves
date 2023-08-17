package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsandoLambda {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		
		//Exemplo 1 de lambda
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		//Outro exemplo de função Lambda
		Comparator<Product> comp2 = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
