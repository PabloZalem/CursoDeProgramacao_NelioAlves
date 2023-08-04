package Tabuleiro;

public class Rei extends PecaDeXadrez{

	public Rei(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		return mat;
	}
}
