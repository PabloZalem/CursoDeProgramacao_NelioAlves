package HerancaMultipla;

public class Scanner extends Aparelho implements InterfaceScanner{

	public Scanner(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDocumento(String documento) {
		System.out.println("Processando Scanner: " + documento);
	}
	
	public String scan() {
		return "Scanneando conteudo";
	}
}
