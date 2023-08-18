package Function;

import java.util.function.Function;

public class NomeEmCaps implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
