package com.zalempablo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.zalempablo.dto.AutorDTO;
import com.zalempablo.dto.ComentarioDTO;

@Document
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
		@Id
		private String id;
		private Date data;
		private String titulo;
		private String corpo;
		private AutorDTO autorDTO;
		
		private List<ComentarioDTO> comentarios = new ArrayList<>();
		
		public Post() {
		}

		public Post(String id, Date data, String titulo, String corpo, AutorDTO autor) {
			super();
			this.id = id;
			this.data = data;
			this.titulo = titulo;
			this.corpo = corpo;
			this.autorDTO = autor;
		}

		public String getId() {
			return id;
		}

		public Date getData() {
			return data;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getCorpo() {
			return corpo;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public void setCorpo(String corpo) {
			this.corpo = corpo;
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
			Post other = (Post) obj;
			return Objects.equals(id, other.id);
		}

		public AutorDTO getAutor() {
			return autorDTO;
		}

		public void setAutorDTO(AutorDTO autorDTO) {
			this.autorDTO = autorDTO;
		}

		public List<ComentarioDTO> getComentarios() {
			return comentarios;
		}

		public void setComentarios(List<ComentarioDTO> comentarios) {
			this.comentarios = comentarios;
		}
		
		
}
