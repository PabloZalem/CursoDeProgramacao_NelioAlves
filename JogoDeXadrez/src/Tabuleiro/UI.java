package Tabuleiro;

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
	
	private static void imprimirPeca(PecaDeXadrez xadrez) {
		if(xadrez == null) {
			System.out.print("-");
		}else {
			System.out.print(xadrez);
		}
		System.out.print(" ");
	}
}
