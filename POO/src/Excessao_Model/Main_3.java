package Excessao_Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) throws DominioException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	try {
		System.out.println("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data da entrada (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data da saida (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		Reserva_2 reserva = new Reserva_2(numero, checkIn, checkOut);
		System.out.println("Reserva: " + reserva);
		System.out.println();
		System.out.println("Entre com dados para atualizar a reserva: ");
		System.out.print("Data da entrada (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Data da saida (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		
		String erro = reserva.atualizarDatas(checkIn, checkOut);
		System.out.println("Reserva " + reserva);
	}catch(ParseException e) {
		System.out.println("Dado Invalido");
	}catch(DominioException e) {
		System.out.println("Dado Invalido" + e.getMessage());
	}catch(RuntimeException e) {
		System.out.println("Dado inesperado");
	}
		sc.close();
	}
}
