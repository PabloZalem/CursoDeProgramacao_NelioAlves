package Tabuleiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

	public static void printBoard(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static PosicaoNoXadrez leiaAPosicaoDoXadrez(Scanner sc) {
		try {
		String s = sc.nextLine();
		char coluna = s.charAt(0);
		int linha = Integer.parseInt(s.substring(1));
		return new PosicaoNoXadrez(coluna, linha);
		}catch(RuntimeException e) {
			throw new InputMismatchException("Erro ao ler valores no xadrez");
		}
	}
	
	private static void imprimirPeca(PecaDeXadrez xadrez) {
		if(xadrez == null) {
			System.out.print("-");
		}else {
			System.out.print(xadrez);
		}
		System.out.print(" ");
	}
}
