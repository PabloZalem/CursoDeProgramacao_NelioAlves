package Function;

import java.util.Objects;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	public static boolean staticProdutoPredicado(Product p) {
		return p.getPrice() >= 100.0;
	}

	public boolean nonStaticProdutoPredicado() {
		return price >= 100.0;
	}
	
	public static void staticAtualizarPreco(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticAtualizarPreco() {
		setPrice(getPrice() * 1.1);
	}
	
	public static String staticUperCaseName(Product p ) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}