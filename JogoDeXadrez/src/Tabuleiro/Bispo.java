package Tabuleiro;

public class Bispo extends PecaDeXadrez {
	public Bispo(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		Posicao p = new Posicao(0, 0);

		// noroeste
		p.setValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setValores(p.getLinha() - 1, p.getColuna() - 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// nordeste
		p.setValores(posicao.getLinha(), posicao.getColuna() + 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setValores(p.getLinha() - 1, p.getColuna() + 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// sudeste
		p.setValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setValores(p.getLinha() + 1, p.getColuna() + 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// sudoeste
		p.setValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setValores(p.getLinha() + 1, p.getColuna() - 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		return mat;
	}
}
