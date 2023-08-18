package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//A funcao map funciona apenas em stream.
		List<String> nomes = list.stream().map(new NomeEmCaps()).collect(Collectors.toList());
		List<String> nomes_1 = list.stream().map(Product::staticUperCaseName).collect(Collectors.toList());
		List<String> nomes_2 = list.stream().map(Product::nonStaticUperCaseName).collect(Collectors.toList());
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> nomes_3 = list.stream().map(func).collect(Collectors.toList());
		List<String> nomes_4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
		nomes_1.forEach(System.out::println);
		nomes_2.forEach(System.out::println);
		nomes_3.forEach(System.out::println);
	}
}
