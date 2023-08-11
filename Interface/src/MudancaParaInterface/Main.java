package MudancaParaInterface;

public class Main {
	public static void main(String[] args) {
		Formato f1 = new Circulo(Cor.PRETO, 2.0);
		Formato f2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
		
		System.out.print("Cor do circulo: " + f1.getCor());
		System.out.println();
		System.out.print("Area do Circulo: " + String.format("%.2f", f1.area()));
		System.out.println();
		System.out.print("Cor do Retangulo: " + f2.getCor());
		System.out.println();
		System.out.print("Area do Retangulo: " + String.format("%.2f", f2.area()));
	}
}
