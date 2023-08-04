package Excessao_Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vet = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vet[posicao]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida");
		}catch(InputMismatchException e) {
			System.out.println("Erro de Entrada");
		}
		
		System.out.println("Fim do Programa");
		sc.close();
	}
}
