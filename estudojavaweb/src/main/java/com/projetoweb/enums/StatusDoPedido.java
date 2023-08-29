package com.projetoweb.enums;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public enum StatusDoPedido {
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	private StatusDoPedido(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static StatusDoPedido valor(int codigo) {
		for (StatusDoPedido valor : StatusDoPedido.values()) {
			if (valor.getCodigo() == codigo) {
				return valor;
			}
		}
		throw new IllegalIdentifierException("Status do pedido invalido");
	}
}
