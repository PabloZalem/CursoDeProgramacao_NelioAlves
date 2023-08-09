package Tabuleiro;

public abstract class PecaDeXadrez extends Peca{
	private Cor cor;
	
	public PecaDeXadrez(Board board, Cor cor) {
		super(board);
		this.cor = cor;
	}	
	public Cor getCor() {
		return cor;
	}
	
	public PosicaoNoXadrez getPosicaoNoXadrez() {
		return PosicaoNoXadrez.paraPosicao(posicao);
	}
	
	protected boolean existePecaDoOponente(Posicao posicao) {
		PecaDeXadrez p = (PecaDeXadrez)getBoard().peca(posicao);
		return p != null && p.getCor() != cor;
	}
}
