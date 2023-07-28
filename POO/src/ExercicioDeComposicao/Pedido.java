package ExercicioDeComposicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import StringBuilder.Comentario;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private StatusDoPedido pedido;
	
	private Cliente cliente;
	
	private List<PedidoDoItem> itens = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusDoPedido pedido, Cliente cliente) {
		this.momento = momento;
		this.pedido = pedido;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getPedido() {
		return pedido;
	}

	public void setPedido(StatusDoPedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(PedidoDoItem item) {
		itens.add(item);
	}
	
	public void removerItem(PedidoDoItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(PedidoDoItem item : itens) {
			soma = soma + item.subTotal();
		}
		return soma;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(pedido + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido dos itens");

		for (PedidoDoItem itens : itens) {
			sb.append(itens+ "\n");
		}
		return sb.toString();
	}
}
