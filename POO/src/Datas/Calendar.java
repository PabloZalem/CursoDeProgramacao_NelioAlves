package Datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calendar {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(d);
		System.out.println(d);
		
		cal.add(java.util.Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(d);
		System.out.println();
		
		int minutos = cal.get(java.util.Calendar.MINUTE);
		System.out.println(minutos);
		
		int mes = 2 + cal.get(java.util.Calendar.MONTH);
		System.out.println(mes);
	}
}
