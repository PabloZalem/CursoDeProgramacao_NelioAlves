package com.projetoweb.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projetoweb.enums.StatusDoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GTM")
	private Instant momento;
	
	private Integer statusDoPedido;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Usuario usuario;
	
	
	@OneToMany(mappedBy = "itemDoPedidoPK.pedido")
	private Set<ItemDoPedido> itemDoPedido = new HashSet<>();

	public Pedido(Long id, Instant momento, StatusDoPedido statusDoPedido, Usuario usuario) {
		this.id = id;
		this.momento = momento;
		setStatusDoPedido(statusDoPedido);
		this.usuario = usuario;
	}

	public Pedido() {
	}

	public Set<ItemDoPedido> getIntemDoPedido(){
		return itemDoPedido;
	}
	
	public Long getId() {
		return id;
	}

	public Instant getMomento() {
		return momento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public StatusDoPedido getStatusDoPedido() {
		return StatusDoPedido.valor(statusDoPedido);
	}

	public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
		if (statusDoPedido != null) {
			this.statusDoPedido = statusDoPedido.getCodigo();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
