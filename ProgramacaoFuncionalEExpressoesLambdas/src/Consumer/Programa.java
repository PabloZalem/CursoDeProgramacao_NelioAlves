package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double fator = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * fator);
		};
		
		//list.forEach(new AtualizarPreco());
		//list.forEach(Product::staticAtualizarPreco);
		//list.forEach(Product::nonStaticAtualizarPreco);
		Consumer<Product> cons2 = p -> p.setPrice(p.getPrice() * fator);
		list.forEach(cons);
		list.forEach(cons2);
		list.forEach(p -> p.setPrice(p.getPrice() * fator));
		
		list.forEach(System.out::println);
	}
}
