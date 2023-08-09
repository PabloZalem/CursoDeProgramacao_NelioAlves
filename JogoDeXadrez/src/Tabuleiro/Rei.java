package Tabuleiro;

public class Rei extends PecaDeXadrez {

	public Rei(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean podeMover(Posicao posicao) {
		PecaDeXadrez p = (PecaDeXadrez) getBoard().peca(posicao);
		return p == null || p.getCor() != getCor();
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		Posicao p = new Posicao(0, 0);

		// acima
		p.setValores(p.getLinha() - 1, p.getColuna());
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// baixo
		p.setValores(p.getLinha() + 1, p.getColuna());
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// esquerda
		p.setValores(p.getLinha(), p.getColuna() - 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// acima
		p.setValores(p.getLinha(), p.getColuna() + 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// diagonal
		p.setValores(p.getLinha() - 1, p.getColuna() - 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() - 1, p.getColuna() + 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() + 1, p.getColuna() - 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() + 1, p.getColuna() + 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		return mat;
	}
}
