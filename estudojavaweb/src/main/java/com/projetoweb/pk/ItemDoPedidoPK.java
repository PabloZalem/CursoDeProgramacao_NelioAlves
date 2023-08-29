package com.projetoweb.pk;

import java.io.Serializable;
import java.util.Objects;

import com.projetoweb.entities.Pedido;
import com.projetoweb.entities.Produto;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemDoPedidoPK implements Serializable{

	private static final long serialVersionUID = 1L;
	//classe auxiliar
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	
	public Pedido getPedido() {
		return pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pedido, produto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemDoPedidoPK other = (ItemDoPedidoPK) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(produto, other.produto);
	}
}
