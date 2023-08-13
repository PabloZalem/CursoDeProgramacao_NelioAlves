package HerancaMultipla;

public abstract class Aparelho {
	private String numeroSerial;

	public Aparelho(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public String getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public abstract void processarDocumento(String documento);
}
