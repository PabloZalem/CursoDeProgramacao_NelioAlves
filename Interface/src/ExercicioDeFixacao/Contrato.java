package ExercicioDeFixacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numeroDoContrato;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Parcela> parcela  = new ArrayList<>();

	public List<Parcela> getParcela() {
		return parcela;
	}

	public Contrato() {

	}

	public Contrato(Integer numeroDoContrato, LocalDate data, Double valorTotal) {

		this.numeroDoContrato = numeroDoContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(Integer numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
