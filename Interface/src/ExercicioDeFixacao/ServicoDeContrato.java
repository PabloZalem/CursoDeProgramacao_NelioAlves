package ExercicioDeFixacao;

import java.time.LocalDate;

public class ServicoDeContrato {
	private ServicoDePagamentoOnline servicoDePagamentoOnline;

	public ServicoDeContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
	public void processoDoContrato(Contrato contrato, int meses) {
		double parcelaBasica = contrato.getValorTotal() / meses;
		
		for (int i = 1; i <= meses;i++) {
			LocalDate dataDeVecimento = contrato.getData().plusMonths(i);
			double juros = servicoDePagamentoOnline.juro(parcelaBasica, i); 
			double taxa = servicoDePagamentoOnline.taxaDePagamento(parcelaBasica + juros);
			double quota = parcelaBasica + juros + taxa;
			
			contrato.getParcela().add(new Parcela(dataDeVecimento, quota));
		}
	}
}	
