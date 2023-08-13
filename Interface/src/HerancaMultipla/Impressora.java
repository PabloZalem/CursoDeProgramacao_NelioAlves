package HerancaMultipla;

public class Impressora extends Aparelho implements InterfaceImpressora{

	public Impressora(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDocumento(String documento) {
		System.out.println("Processando impressao: " + documento);
	}

	public void imprimir(String documento) {
		System.out.println("Imprimindo: " + documento);
	}
}
