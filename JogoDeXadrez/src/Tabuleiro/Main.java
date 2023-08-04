package Tabuleiro;

public class Main {
	public static void main(String[] args) {
		PartidaDeXadrez xadrez = new PartidaDeXadrez();
		UI.printBoard(xadrez.getPecas());
	}
}
