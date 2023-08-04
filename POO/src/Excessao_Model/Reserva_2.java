package Excessao_Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva_2 {
	private Integer reserva;
	private Date check_in;
	private Date check_out;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva_2(Integer reserva, Date check_in, Date check_out) {

		this.reserva = reserva;
		this.check_in = check_in;
		this.check_out = check_out;
	}

	public Integer getReserva() {
		return reserva;
	}

	public void setReserva(Integer reserva) {
		this.reserva = reserva;
	}

	public Date getCheck_in() {
		return check_in;
	}

	public Date getCheck_out() {
		return check_out;
	}

	public long duracao() {
		long dif = check_out.getTime() - check_in.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	public String atualizarDatas(Date checkIn, Date checkOut) {		
		Date agora = new Date();
		if (checkIn.before(agora) || checkOut.before(agora)) {
			return "Erro na reserva: data de Check-out deve ser depois da data de Check-in";
		} 
		if (!checkOut.after(checkIn)) {
			return "Erro na reserva: data de Check-out deve ser depois da data de Check-in";
		}
		this.check_in = checkIn;
		this.check_out = checkOut;
		return null;
	}

	@Override
	public String toString() {
		return "Quarto " + reserva + ", check-in: " + sdf.format(check_in) + ", check-out: " + sdf.format(check_out)
				+ ", " + duracao() + " noites";
	}
}