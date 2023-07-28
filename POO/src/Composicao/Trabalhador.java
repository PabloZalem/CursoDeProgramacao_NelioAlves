package Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	private String nome;
	private Senioridade senioridade;
	private Double salario;
	
	private Departamento departamento;
	private List<HoraDoContrato> contrato = new ArrayList<>();
	

	public Trabalhador(String nome, Senioridade senioridade, Double salario, Departamento departamento) {
		this.nome = nome;
		this.senioridade = senioridade;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Senioridade getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraDoContrato> getContrato() {
		return contrato;
	}

	public void adicionarContrato(HoraDoContrato contratos) {
		contrato.add(contratos);
	}
	
	public void removerContrato(HoraDoContrato contratos) {
		contrato.remove(contratos);
	}
	
	public double total(int ano, int mes) {
		double soma = salario;
		Calendar calendar = Calendar.getInstance();
		for(HoraDoContrato c : contrato) {
			calendar.setTime(c.getData());
			int c_year = calendar.get(Calendar.YEAR);
			int c_month = 1 + calendar.get(Calendar.MONTH);
			if(ano == c_year && mes == c_month) {
				soma += c.valorTotal();
			}		
		}
		return soma;
	}
}
