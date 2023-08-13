package MetodosPadroes;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		ServicoDeInterface taxa  = new TaxaDeJuroDoBrazil(2.0);
		double pagamentos = taxa.pagamentos(valor, meses);
		
		System.out.println("Pagamento depois: " + meses + " meses no Brazil");
		System.out.println(String.format("%.2f", pagamentos));
		System.out.println();
		
		ServicoDeInterface taxaUSA  = new TaxaDeJuroDosUSA(1.0);
		double pagamentosUSA = taxaUSA.pagamentos(valor, meses);
		
		System.out.println("Pagamento depois: " + meses + "meses no USA");
		System.out.println(String.format("%.2f", pagamentosUSA));
		
		sc.close();
	}
}
