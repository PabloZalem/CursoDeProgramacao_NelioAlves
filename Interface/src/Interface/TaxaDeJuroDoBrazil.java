package Interface;

public class TaxaDeJuroDoBrazil implements ServicoDeTaxa{
	public double taxa (double valor) {
		if (valor <= 100) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}

	@Override
	public double tax(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
