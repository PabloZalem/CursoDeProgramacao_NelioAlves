package Tabuleiro;

public class Peao extends PecaDeXadrez {

	public Peao(Board board, Cor cor) {
		super(board, cor);

	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		Posicao p = new Posicao(0, 0);

		if (getCor() == Cor.BRANCO) {
			p.setValores(posicao.getLinha() - 1, posicao.getColuna());
			if (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() - 2, posicao.getColuna());
			Posicao p2 = new Posicao(posicao.getLinha() - 1, posicao.getColuna());
			if (getBoard().posicaoExiste(p) && !getBoard().haPeca(p) && getBoard().posicaoExiste(p2)
					&& !getBoard().haPeca(p2)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
			if (getBoard().posicaoExiste(p) && existePecaDoOponente(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
			if (getBoard().posicaoExiste(p) && existePecaDoOponente(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
		} else {
			p.setValores(posicao.getLinha() + 1, posicao.getColuna());
			if (getBoard().posicaoExiste(p) && !getBoard().haPeca(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() + 2, posicao.getColuna());
			Posicao p2 = new Posicao(posicao.getLinha() + 1, posicao.getColuna());
			if (getBoard().posicaoExiste(p) && !getBoard().haPeca(p) && getBoard().posicaoExiste(p2)
					&& !getBoard().haPeca(p2)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
			if (getBoard().posicaoExiste(p) && existePecaDoOponente(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
			if (getBoard().posicaoExiste(p) && existePecaDoOponente(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
		}

		return null;
	}

}
