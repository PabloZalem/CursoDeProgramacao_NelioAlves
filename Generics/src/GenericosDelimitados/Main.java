package GenericosDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		String path = "C:/temp/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha = br.readLine();
			while (linha != null) {
				
				String[] campos = linha.split(",");
				list.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}

			Produto x = ServicoDeCalculador.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
