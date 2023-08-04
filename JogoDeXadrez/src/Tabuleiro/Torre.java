package Tabuleiro;

public class Torre extends PecaDeXadrez{

	public Torre(Board board, Cor cor) {
		super(board, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		return mat;
	}
}
