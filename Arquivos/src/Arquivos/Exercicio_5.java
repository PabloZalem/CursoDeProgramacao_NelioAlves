package Arquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escreva um caminho de uma pasta: ");
		String strPath = sc.nextLine();
		
		//File pode ser caminho de um arquivo como de uma pasta
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("PASTAS");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS:");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		//Criar uma subpasta
		boolean sucesso = new File(strPath + "/subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucesso);
		
		sc.close();
	}
}
