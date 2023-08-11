package Interface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String modeloDoCarro = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime end = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, end, new Veiculo(modeloDoCarro));
		
		System.out.print("Entre com o preco por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoDeAluguel aluguel = new ServicoDeAluguel(precoPorHora, precoPorDia, new TaxaDeJuroDoBrazil());
		aluguel.processarAluguel(cr);
		System.out.println("Fatura: ");
		System.out.print("Pagamento basico: "+ String.format("%.2f", cr.getFatura().getPagamentoBase()));
		System.out.print("Imposto: " + String.format(modeloDoCarro,cr.getFatura().getTaxa()));
		System.out.print("Pagamento total: " + String.format("%.2f",cr.getFatura().getPagamentoTotal()));
		
		sc.close();
	}
}
