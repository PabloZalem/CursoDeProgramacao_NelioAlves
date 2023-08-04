package Excessao_Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data da entrada (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data da saida (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
		} else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Entre com dados para atualizar a reserva: ");
			System.out.print("Data da entrada (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data da saida (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date agora = new Date();
			if (checkIn.before(agora) || checkOut.before(agora)) {
				System.out.println("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
			} else {
				reserva.atualizarDatas(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
			}
		}

		sc.close();
	}
}
