package MetodosPadroes;

public class TaxaDeJuroDosUSA implements ServicoDeInterface {
	private Double taxaDeJuros;

	public TaxaDeJuroDosUSA(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}
}
