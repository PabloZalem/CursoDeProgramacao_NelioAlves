package Tabuleiro;

public class PartidaDeXadrez {
	private Board board;
	public PartidaDeXadrez() {
		board = new Board(8, 8);
		setupInicial();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[board.getLinhas()][board.getColunas()];
		for(int i=0; i<board.getLinhas(); i++) {
			for(int j=0; j<board.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) board.peca(i,j);
			}
		}
		return mat;
	}
	
	private void setupInicial() {
		board.lugarDaPeca(new Torre(board, Cor.BRANCO), new Posicao(2, 1));
		board.lugarDaPeca(new Rei(board, Cor.PRETO), new Posicao(1, 4));
		board.lugarDaPeca(new Rei(board, Cor.BRANCO), new Posicao(7, 4));
	}
}
