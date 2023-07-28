package StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Wow, isso é incrível");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viagem", "Vou viajar", 12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("A forca esta com vc");
		Post p2 = new Post(sdf.parse("21/06/2018 13:20:44"),"Boa Noite", "Ate amanha",5);
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
