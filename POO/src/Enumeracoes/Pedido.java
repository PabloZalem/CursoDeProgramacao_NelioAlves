package Enumeracoes;

import java.util.Date;

public class Pedido {
	private Integer id;
	private Date moment;
	private Status status;

	public Pedido() {
	}

	public Pedido(Integer id, Date moment, Status status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
