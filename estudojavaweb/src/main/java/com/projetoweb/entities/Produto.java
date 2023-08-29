package com.projetoweb.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;
import org.springframework.web.bind.annotation.Mapping;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tb_produtos")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private String imgUrl;
	
	@ManyToMany
	@JoinTable(name = "tb_produto_categoria"
	, joinColumns = @JoinColumn(name = "produto_id")
	, inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private Set<Categoria> categorias = new HashSet<>();
	
	@OneToMany(mappedBy = "itemDoPedidoPK.produto")
	private Set<ItemDoPedido> items = new HashSet<>();
	
	public Produto() {
	}
	
	public Produto(Long id, String nome, String descricao, Double preco, String imgUrl) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imgUrl = imgUrl;
	}
	
	@JsonIgnore
	public Set<Pedido> getPedido(){
		Set<Pedido> set = new HashSet<>();
		for(ItemDoPedido x : items) {
			set.add(x.getPedido());
		}
		return set;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}
	
}
