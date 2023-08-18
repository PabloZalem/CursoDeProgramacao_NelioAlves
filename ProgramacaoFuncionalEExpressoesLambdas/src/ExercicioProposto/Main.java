package ExercicioProposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entra com o caminho completo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String linha = br.readLine();

			while (linha != null) {
				String[] campos = linha.split(",");
				list.add(new Product(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			 double media = list.stream()
					 .map(p -> p.getPrice())
					 //reduce permitir fazer o somatorio dos preços
					 .reduce(0.0, (x,y) -> x + y) / list.size();
			 
			 System.out.println("Preço medio: " + String.format("%.2f", media));
			 
			 Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			 
			 List<String> nomes = list.stream()
					 .filter(p -> p.getPrice() < media)
					 .map(p -> p.getName())
					 .sorted(comp.reversed())
					 .collect(Collectors.toList());
			 
			 nomes.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
