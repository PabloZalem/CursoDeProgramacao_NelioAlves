package Arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		File f1 = new File("C:/temp/ws-java/int.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(f1);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
