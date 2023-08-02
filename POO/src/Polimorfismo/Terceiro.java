package Polimorfismo;

public class Terceiro extends Empregados{
	private Double valorAdicional;
	
	public Terceiro() {
	}

	public Terceiro(String nome, Integer horas, Double valorPorHoras, Double valorAdicional) {
		super(nome, horas, valorPorHoras);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double payments() {
		return super.payments() + valorAdicional * 1.1;
	}
}
