package Polimorfismo;

public class Empregados {
	private String nome;
	private Integer horas;
	private Double valorPorHoras;
	
	public Empregados() {
	}

	public Empregados(String nome, Integer horas, Double valorPorHoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHoras = valorPorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHoras() {
		return valorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		this.valorPorHoras = valorPorHoras;
	}
	
	public double payments() {
		return horas * valorPorHoras;
	}
}
