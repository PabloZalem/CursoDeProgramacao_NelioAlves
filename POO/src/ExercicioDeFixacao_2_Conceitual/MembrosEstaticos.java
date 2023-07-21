package ExercicioDeFixacao_2_Conceitual;

import java.util.Scanner;

public class MembrosEstaticos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		double v = aoCubo(raio);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("O valor de PI: %.2f", Math.PI);
		
		sc.close();
	}
	
	
	public static double circunferencia(double radius) {
		return 2.0 * Math.PI * radius;
	}
	
	public static double aoCubo(double radius) {
		return (4.0 * Math.PI * Math.pow(radius,3)) / 3.0;
	}
}
