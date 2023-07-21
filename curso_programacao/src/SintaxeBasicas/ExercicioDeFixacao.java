package SintaxeBasicas;

import java.util.Locale;

public class ExercicioDeFixacao {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 24;
		int code = 5290;
		char gender = 'm';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.print("Products:\n");
		System.out.printf("%s, which price is R$%.2f\n", product1, price1);
		System.out.printf("%s, which price is R$%.2f\n\n", product2, price2);
		
		System.out.printf("Record:\n %d years old, code:%d and gender:%s\n\n", age, code, gender);
		
		System.out.printf("Measue wich eight decimal places: %f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US DECIMAL: Rouded (three decimal places): %.3f", measure);
	}
}
