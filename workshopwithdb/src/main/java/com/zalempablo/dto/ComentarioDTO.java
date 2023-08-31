package com.zalempablo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.crypto.Data;

public class ComentarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String texto;
	private Date data;
	private AutorDTO autorDTO;
		
	public ComentarioDTO() {
	}

	public ComentarioDTO(String texto, Date date, AutorDTO autorDTO) {
		super();
		this.texto = texto;
		this.data = date;
		this.autorDTO = autorDTO;
	}

	public String getTexto() {
		return texto;
	}

	public Date getData() {
		return data;
	}

	public AutorDTO getAutorDTO() {
		return autorDTO;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setAutorDTO(AutorDTO autorDTO) {
		this.autorDTO = autorDTO;
	}
	
	
}
