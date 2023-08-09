package Tabuleiro;

public class Cavalo extends PecaDeXadrez {

	public Cavalo(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "C";
	}

	private boolean podeMover(Posicao posicao) {
		PecaDeXadrez p = (PecaDeXadrez) getBoard().peca(posicao);
		return p == null || p.getCor() != getCor();
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		Posicao p = new Posicao(0, 0);

		
		p.setValores(p.getLinha() - 1, p.getColuna() - 2);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() - 2, p.getColuna() - 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() - 2, p.getColuna() + 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.setValores(p.getLinha() - 1, p.getColuna() + 2);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(p.getLinha() + 1, p.getColuna() + 2);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(p.getLinha() + 2, p.getColuna() + 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(p.getLinha() + 2, p.getColuna() - 1);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		p.setValores(p.getLinha() + 1, p.getColuna() - 2);
		if (getBoard().posicaoExiste(p) && podeMover(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		return mat;
	}

}
