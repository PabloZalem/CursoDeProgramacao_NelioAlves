package Predicate;

import java.util.function.Predicate;

public class ProductoPredicado implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
