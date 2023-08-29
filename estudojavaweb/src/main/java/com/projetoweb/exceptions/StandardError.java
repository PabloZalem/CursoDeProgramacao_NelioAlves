package com.projetoweb.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GTM")
	private Instant tempoDataEHora;
	private Integer status;
	private String error;
	private String mensagem;
	private String caminho;
	
	public StandardError () {
	}

	public StandardError(Instant tempoDataEHora, Integer status, String error, String mensagem, String caminho) {
		super();
		this.tempoDataEHora = tempoDataEHora;
		this.status = status;
		this.error = error;
		this.mensagem = mensagem;
		this.caminho = caminho;
	}

	public Instant getTempoDataEHora() {
		return tempoDataEHora;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setTempoDataEHora(Instant tempoDataEHora) {
		this.tempoDataEHora = tempoDataEHora;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	
	
}
