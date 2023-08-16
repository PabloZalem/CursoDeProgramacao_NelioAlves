package CoringasDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Formas> list = new ArrayList<>();
		list.add(new Retangulo(3.0, 2.0));
		list.add(new Circulo(2.0));
		
		List<Circulo> circulo = new ArrayList<>();
		list.add(new Circulo(3.0));
		list.add(new Circulo(2.0));
		
		System.out.println("Total area: " + areaTotal(circulo));
	}
	
	//Lista de qualquer tipo que seja derivado de formas
	public static double areaTotal(List<? extends Formas> list) {
		double soma = 0.0;
		for (Formas f : list) {
			soma += f.area();
		}
		return soma;
	}
}
