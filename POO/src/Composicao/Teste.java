package Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDoDepartamento = sc.nextLine();
		System.out.print("Entre com a data do trabalhador: ");
		System.out.print("Nome: ");
		String wokerName = sc.nextLine();
		System.out.print("Nivel: ");
		String wokerLevel = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador t1 = new Trabalhador(wokerName, Senioridade.valueOf(wokerLevel), salarioBase, new Departamento(nomeDoDepartamento));
		
		System.out.print("Quantos contratos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com contrato #" + i + "data: ");
			System.out.print("Data: (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int horas = sc.nextInt();
			HoraDoContrato contrato = new HoraDoContrato(data, valorPorHora, horas);
			t1.adicionarContrato(contrato);
		}
		System.out.println();
		System.out.println("Calcular o mes e o ano (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: "  + t1.getNome());
		System.out.println("Departamento: " + t1.getDepartamento().getNome());
		System.out.println("Qunto ganhou: " + mesEAno + ":" +String.format("%.2f", t1.total(ano, mes)));
		
		sc.close();
	}
}
