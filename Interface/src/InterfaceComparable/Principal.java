package InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Funcionarios> list = new ArrayList<>();
		String path = "C:\\temp\\in_2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String nomeDoFuncionario = br.readLine();
			while (nomeDoFuncionario != null) {
				String[] campos = nomeDoFuncionario.split(",");
				list.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
				nomeDoFuncionario = br.readLine();
			}
			
			//Aqui ele está ordenando por salario
			Collections.sort(list);
			for (Funcionarios fun : list) {
				System.out.println(fun.getNome() + ", " + fun.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
