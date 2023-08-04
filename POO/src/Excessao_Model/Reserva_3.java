package Excessao_Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva_3 {
	private Integer reserva;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva_3(Integer reserva, Date checkOut, Date checkIn){
		if (!checkOut.after(checkIn)) {
			throw new DominioException("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
		}
		this.reserva = reserva;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getReserva() {
		return reserva;
	}

	public void setReserva(Integer reserva) {
		this.reserva = reserva;
	}

	public Date getCheck_in() {
		return checkIn;
	}

	public Date getcheckOut() {
		return checkOut;
	}

	public long duracao() {
		long dif = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	public void atualizarDatas(Date checkIn, Date checkOut){
		Date agora = new Date();
		if (checkIn.before(agora) || checkOut.before(agora)) {
			throw new DominioException("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
		}
		if (!checkOut.after(checkIn)) {
			throw new DominioException("Erro na reserva: data de Check-out deve ser depois da data de Check-in");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto " + reserva + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
				+ ", " + duracao() + " noites";
	}
}
