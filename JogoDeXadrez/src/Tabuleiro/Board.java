package Tabuleiro;

public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int linhas, int colunas) {	
		if (linhas < 1 || colunas < 1) {
			throw new BoardException("Erro de criacação: É necessário que tenha 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; 
	}
	public int getLinhas() {
		return linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public Peca peca (int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new BoardException("Posicao nao no boarding");
		}
		return pecas[linha][coluna];
	}
	public Peca peca (Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new BoardException("Posicao nao no boarding");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarDaPeca(Peca peca, Posicao posicao) {
		if (haPeca(posicao)) {
			throw new BoardException("Ja existe uma peca nessa posicao" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha>=0 && linha<linhas && coluna>=0 &&  coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haPeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new BoardException("Posicao nao no boarding");
		}
		return peca(posicao) != null;
	}
}
