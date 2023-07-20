package curso_programacao;

import java.util.Locale;

public class Teste {
	public static void main(String[] args) {
		double x = 1987.50;
		String y = "Pablo";
		int z = 24;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n",x);
		
		System.out.printf("%s tem %d de idades e possue R$%.2f reais na conta",y,z,x);
	}
}
