package Interface;

public class Fatura {
	private Double pagamentoBase;
	private Double taxa;
	
	public Fatura() {
	}

	public Fatura(Double pagamentoBase, Double taxa) {
		this.pagamentoBase = pagamentoBase;
		this.taxa = taxa;
	}

	public Double getPagamentoBase() {
		return pagamentoBase;
	}

	public void setPagamentoBase(Double pagamentoBase) {
		this.pagamentoBase = pagamentoBase;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	public double getPagamentoTotal() {
		return getPagamentoBase() - getTaxa();
	}
}
