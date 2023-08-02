package Polimorfismo_1;

public class ProdutoImportado extends Produto{
	private Double taxaDaAlfandega;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaDaAlfandega) {
		super(nome, preco);
		this.taxaDaAlfandega = taxaDaAlfandega;
	}

	public Double getTaxaDaAlfandega() {
		return taxaDaAlfandega;
	}

	public void setTaxaDaAlfandega(Double taxaDaAlfandega) {
		this.taxaDaAlfandega = taxaDaAlfandega;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaDaAlfandega;
	}
	
	@Override
	public String precoDaEtiqueta() {
		return getNome()
				+ " $"
				+ String.format("%.2f", precoTotal())
				+ "Custo da alfandega: $"
				+ String.format("%.2f", taxaDaAlfandega);
	}
}
