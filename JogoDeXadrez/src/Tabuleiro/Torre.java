package Tabuleiro;

public class Torre extends PecaDeXadrez {

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
		Posicao p = new Posicao(0, 0);

		// acima da minha peca
		p.setValores(posicao.getLinha() - 1, posicao.getColuna());
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// esquerda
		p.setValores(posicao.getLinha(), posicao.getColuna() - 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// direita
		p.setValores(posicao.getLinha(), posicao.getColuna() + 1);
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// baixo
		p.setValores(posicao.getLinha() + 1, posicao.getColuna());
		while (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if (getBoard().posicaoExiste(p) && getBoard().haPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		return mat;
	}
}
