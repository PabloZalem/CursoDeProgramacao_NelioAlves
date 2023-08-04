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
	
	public PecaDeXadrez performanceParaMoverXadrez(PosicaoNoXadrez posicaoDeOrigem, PosicaoNoXadrez posicaoDeDestino) {
		Posicao origem = posicaoDeOrigem.ParaPosicao();
		Posicao destino = posicaoDeDestino.ParaPosicao();
		validarAPosicao(origem);
		Peca capturaDaPeca = fazerOMovimento(origem, destino);
		return (PecaDeXadrez)capturaDaPeca; 
	}
	
	private Peca fazerOMovimento(Posicao origem, Posicao destino) {
		Peca p = board.removerPeca(origem);
		Peca pecaCapturada = board.removerPeca(destino);
		board.lugarDaPeca(p, destino);
		return pecaCapturada;
	}

	private void validarAPosicao(Posicao posicao) {
		if (!board.haPeca(posicao)) {
			throw new XadrezException("Não há peça na posicao de origem");
		}
		if (!board.peca(posicao).TemAlgumaPossibilidadeDeMovimento()) {
			throw new XadrezException("Não tem possibilidade de movimento");
		}
	}
	

	private void lugarDaNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		board.lugarDaPeca(peca, new PosicaoNoXadrez(coluna, linha).ParaPosicao());
	}
	
	private void setupInicial() {
		lugarDaNovaPeca('b',6,new Torre(board, Cor.BRANCO));
		lugarDaNovaPeca('e',8,new Rei(board, Cor.PRETO));
		lugarDaNovaPeca('e',1,new Rei(board, Cor.BRANCO));
	}
}
