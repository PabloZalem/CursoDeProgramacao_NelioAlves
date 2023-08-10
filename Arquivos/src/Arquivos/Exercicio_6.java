package Arquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRA COM O CAMINHO DE UM ARQUIVO: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome: "  + path.getName());
		System.out.println("Parametro: "  + path.getParent());
		System.out.println("Path: "  + path.getPath());
		sc.close();
	}
}
