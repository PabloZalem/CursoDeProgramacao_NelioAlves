package Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio_4 {
	public static void main(String[] args) {
		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite" };

		// gravar arquivo
		String path = "C:/temp/ws-java/out.txt";

		//use o true para nao recriar o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String linha : linhas) {

				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}