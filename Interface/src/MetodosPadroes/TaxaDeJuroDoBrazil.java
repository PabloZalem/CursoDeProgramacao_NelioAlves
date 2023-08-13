package MetodosPadroes;

public class TaxaDeJuroDoBrazil implements ServicoDeInterface {
	private Double taxaDeJuros;

	public TaxaDeJuroDoBrazil(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}
}
