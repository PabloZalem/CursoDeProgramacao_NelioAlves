package Tabuleiro;

public class Peca {
	protected Posicao posicao;
	protected Board board;
	
	public Peca(Board board) {
		this.board = board;
		posicao = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
