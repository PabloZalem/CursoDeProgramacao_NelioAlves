package HerancaMultipla;

public class ComboDeAparelhos extends Aparelho implements InterfaceImpressora, InterfaceScanner{

	public ComboDeAparelhos(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDocumento(String documento) {	
		System.out.println("Combo processando " + documento);
	}

	@Override
	public String scan() {
		return "Scaneando o combo do aparelho";
	}

	@Override
	public void imprimir(String documento) {
		System.out.println("Combo print : " + documento);
	}

}
