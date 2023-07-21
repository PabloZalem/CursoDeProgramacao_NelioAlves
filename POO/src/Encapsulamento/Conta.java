package Encapsulamento;

public class Conta {
	private int numero;
	private String proprietario;
	private double balanco;

	public Conta(int numero, String proprietario, double depositoInicial) {
		this.numero = numero;
		this.proprietario = proprietario;
		deposito(depositoInicial);
	}

	public Conta(int numero, String proprietario) {
		this.numero = numero;
		this.proprietario = proprietario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getBalanco() {
		return balanco;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}

	public void deposito(double amount) {
		balanco += amount;
	}

	public void sacar(double amount) {
		balanco -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta: "
			+ getNumero()
			+ ", Nome: "
			+ getProprietario()
			+ ", balanco: "
			+ String.format("%.2f", getBalanco());
		
	}
}
