package Polimorfismo_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	
	private LocalDate momento;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, LocalDate momento) {
		super(nome, preco);
		this.momento = momento;
	}

	public LocalDate getMomento() {
		return momento;
	}

	public void setMomento(LocalDate momento) {
		this.momento = momento;
	}
	
	@Override
	public String precoDaEtiqueta() {
		return getNome()
				+ " $"
				+ String.format("%.2f", getPreco())
				+ "Data do Produto: $"
				+ momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}
}
