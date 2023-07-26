package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demonstracao {
	public static void main(String[] args) {
		// Usamos o ArrayLits, pois possue caracteristica de Array
		List<String> list = new ArrayList<>();
		list.add("Pablo");
		list.add("Bob");
		list.add("Pedro");
		list.add(1, "Michelle");
		list.add("Marcela");
		list.add("Alef");

		//For-each
		for (String nome : list) {
			System.out.println(nome);
		}
			
		//Tamanho
		System.out.println();
		System.out.println(list.size());

		// Usando o método lambda
		System.out.println();
		System.out.println("Removendo as Letras P");
		list.removeIf(nome -> nome.charAt(0) == 'P');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Posicao de Bob: " + list.indexOf("Bob"));
		
		System.out.println();
		List<String> result = list.stream()
				.filter(x -> x.charAt(0) == 'M')
				.collect(Collectors.toList());
		
		System.out.println("Filtro com nomes que iniciam com a letra M");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
		System.out.println(name);
	}
}
