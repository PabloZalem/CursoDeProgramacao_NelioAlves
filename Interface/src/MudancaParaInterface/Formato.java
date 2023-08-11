package MudancaParaInterface;

public abstract class Formato {
	private Cor cor;
	
	public Formato(Cor cor) {
		this.cor = cor;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public abstract double area();
}
