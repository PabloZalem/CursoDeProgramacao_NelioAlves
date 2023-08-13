package MudancaParaInterface;

public abstract class FormatoAbstrato implements Formato{
	private Cor cor;

	public FormatoAbstrato(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
