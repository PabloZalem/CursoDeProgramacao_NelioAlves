package ExercicioDeTratamentoDeExcecao;

public class Conta {
	private Integer numero;
	private String proprietario;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
	}

	public Conta(Integer numero, String proprietario, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) throws ContaException {
		validandoSaque(valor);
		saldo = saldo - valor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	private void validandoSaque(double valor) throws ContaException {
		if (saldo > getLimiteDeSaque()) {
			throw new ContaException("Erro de saque: A quantia excede o limite de saque");
		}else if (saldo > getSaldo()){
			throw new ContaException("Erro de saque: Saldo insuficiente");
		}
	}
}
