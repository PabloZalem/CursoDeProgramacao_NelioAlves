package StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String titulos;
	private String content;
	private Integer likes;
	
	private List<Comentario> comentario = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date moment, String titulos, String content, Integer likes) {
		this.moment = moment;
		this.titulos = titulos;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void adicionarComentario(Comentario comentarios) {
		comentario.add(comentarios);
	}
	
	public void removerComentario(Comentario comentarios) {
		comentario.remove(comentarios);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulos + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment));
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comentario c : comentario) {
			sb.append(c.getTexto()+ "\n");
		}
		return sb.toString();
	}
}
