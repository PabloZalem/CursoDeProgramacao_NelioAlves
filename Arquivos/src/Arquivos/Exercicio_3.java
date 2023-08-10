package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_3 {
	public static void main(String[] args) {
		String path = "C:/temp/ws-java/int.txt";

		try (BufferedReader b1 = new BufferedReader(new FileReader(path))) {

			String linha = b1.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = b1.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}
