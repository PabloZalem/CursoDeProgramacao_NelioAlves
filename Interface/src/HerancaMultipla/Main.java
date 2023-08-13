package HerancaMultipla;

public class Main {
	public static void main(String[] args) {
		Impressora i = new Impressora("1080");
		i.processarDocumento("Minha carta");
		i.imprimir("Minha Carta");
		
		System.out.println();
		Scanner s = new Scanner("2003");
		s.processarDocumento("Meu e-mail");
		System.out.println("Resultado: " + s.scan());
		
		System.out.println();
		ComboDeAparelhos c1 = new ComboDeAparelhos("2080");
		c1.processarDocumento("Minha dissertação");
		c1.imprimir("Minha dicertação");
		System.out.println("Resultado: " + c1.scan());
	}
}
