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
	
}
