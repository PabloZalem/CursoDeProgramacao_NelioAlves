package com.projetoweb.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetoweb.pk.ItemDoPedidoPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class ItemDoPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ItemDoPedidoPK itemDoPedidoPK = new ItemDoPedidoPK();	
	private Integer quantidade;
	private Double preco;
	
	public ItemDoPedido(Pedido pedido, Produto produto ,Integer quantidade, Double preco) {
		itemDoPedidoPK.setPedido(pedido);
		itemDoPedidoPK.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public ItemDoPedido() {
	}

	@JsonIgnore
	public Pedido getPedido() {
		return itemDoPedidoPK.getPedido();
	}
	
	public void setPedido(Pedido pedido) {
		itemDoPedidoPK.setPedido(pedido);
	}
	
	
	public Produto getProduto() {
		return itemDoPedidoPK.getProduto();
	}
	
	public void setProduto(Produto produto) {
		itemDoPedidoPK.setProduto(produto);
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getSubTotal() {
		return preco * quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemDoPedidoPK);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemDoPedido other = (ItemDoPedido) obj;
		return Objects.equals(itemDoPedidoPK, other.itemDoPedidoPK);
	}
}
