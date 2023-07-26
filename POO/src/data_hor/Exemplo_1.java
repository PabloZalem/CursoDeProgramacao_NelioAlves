package data_hor;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo_1 {
	public static void main(String[] args) {
		//Como vc vai formartar o texto	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		//Padra GMT = Londres
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05);
		
		LocalDate d06 = LocalDate.of(2022, 07, 11);
		System.out.println(d06);
		
		LocalDateTime d07 = LocalDateTime.of(2022, 07, 11,1,30);
		System.out.println(d07);
		
		/*
		//Convertendo pro Brasil
		Instant d07 = Instant.parse("2022-07-20T01:30:26Z-03:00");
		System.out.println(d07);
		
		OffsetDateTime d08 = OffsetDateTime.parse("2022-07-20T01:30:26Z-03:00".toString());
		System.out.println(d08);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06);
		
		LocalDateTime d07 = LocalDateTime.parse("07/11/1998", fmt1);
		System.out.println(d07);
		
		*/
	}
}
