package ExercicioDeFixacao;

public interface ServicoDePagamentoOnline {
	double taxaDePagamento(double valor);
	double juro(double valor, int meses);
}
