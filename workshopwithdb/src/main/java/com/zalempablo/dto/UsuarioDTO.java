package com.zalempablo.dto;

import java.io.Serializable;

import com.zalempablo.domain.Usuario;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String nome;
	private String email;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Usuario x) {
		id = x.getId();
		nome = x.getNome();
		email = x.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	
}
