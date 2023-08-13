package MetodosPadroes;

import java.security.InvalidParameterException;

public interface ServicoDeInterface {
	public Double getTaxaDeJuros();

	default double pagamentos(double valor, int meses) {
		if (valor < 1) {
			throw new InvalidParameterException("Mes deve ser maior que zero");
		}
		return valor * Math.pow(1.0 + getTaxaDeJuros() / 100.0, meses);
	}
}
