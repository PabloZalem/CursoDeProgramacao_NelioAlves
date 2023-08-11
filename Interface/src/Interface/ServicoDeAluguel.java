package Interface;

import java.time.Duration;

public class ServicoDeAluguel {
	private Double precoPorDia;
	private Double precoPorHora;
	private ServicoDeTaxa taxa;
	
	public ServicoDeAluguel(Double precoPorDia, Double precoPorHora, ServicoDeTaxa taxa) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxa = taxa;
	}
	
	public void processarAluguel(CarRental carRental) {
		double minutos = Duration.between(carRental.getInicio(), carRental.getFim()).toMinutes();
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if (horas  <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}
		
		double taxas = taxa.tax(pagamentoBasico);
		
		carRental.setFatura(new Fatura(pagamentoBasico, taxas));
	}
}
