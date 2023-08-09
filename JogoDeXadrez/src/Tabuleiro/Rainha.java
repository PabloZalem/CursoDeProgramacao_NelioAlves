package Tabuleiro;

public class Rainha extends PecaDeXadrez {

	public Rainha(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "Ra";
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
