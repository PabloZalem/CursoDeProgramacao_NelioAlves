package ExercicioDeFixacao;

public class ServicoDePaypal implements ServicoDePagamentoOnline{

	@Override
	public double taxaDePagamento(double valor) {
		return valor * 0.02;
	}

	@Override
	public double juro(double valor, int meses) {
		return valor * 0.01 * meses;
	}
	
}
