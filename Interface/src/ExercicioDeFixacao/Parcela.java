package ExercicioDeFixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private LocalDate date;
	private Double valor;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Parcela() {
	}


	public Parcela(LocalDate date, Double valor) {
		super();
		this.date = date;
		this.valor = valor;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return date.format(dtf) + "-" + String.format("%.2f", valor);
	}
	
	
}
