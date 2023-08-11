package ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data: ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		Double valorTotal = sc.nextDouble();
		
		Contrato c1 = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com o numero de parcelas:");
		int n = sc.nextInt();
		
		ServicoDeContrato sc1 = new ServicoDeContrato(new ServicoDePaypal());
		sc1.processoDoContrato(c1, n);
		System.out.println("PARCELAS: ");
		for(Parcela parcela : c1.getParcela()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}
}
