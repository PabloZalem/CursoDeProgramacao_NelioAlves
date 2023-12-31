package Tabuleiro;

public abstract class Peca {
	protected Posicao posicao;
	protected Board board;
	
	public Peca(Board board) {
		this.board = board;
		posicao = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possiveisMovimentos();
	
	public boolean possivelMovimento(Posicao posicao) {
		return possiveisMovimentos()[posicao.getLinha()][posicao.getColuna()]; 
	}
	
	public boolean TemAlgumaPossibilidadeDeMovimento() {
		boolean[][] mat = possiveisMovimentos();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0 ; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
